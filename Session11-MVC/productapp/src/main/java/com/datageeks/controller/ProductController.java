package com.datageeks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.datageeks.dao.ProductBean;
import com.datageeks.service.ProductService;
import com.datageeks.service.ServicesException;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping(path = "/addPage", method = RequestMethod.GET)
	public String savePage(ModelMap map) {
		ProductBean produt = new ProductBean();
		map.put("productBean", produt);
		return "add";
	}

	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public String save(ModelMap map, @ModelAttribute ProductBean productBean) {
		try {
			ProductBean p = productService.get(productBean.getProductId());
			if (p == null) {
				productService.saveOrUpdate(productBean);
				List<ProductBean> productList = productService.getAll();
				map.put("productList", productList);
			} else {
				map.put("idExits", "Product ID exists");
				return "add";
			}
		} catch (ServicesException exp) {
			map.put("expInfo", exp.getMessage());
			return "error";
		}
		return "success";
	}

	@RequestMapping(path = "/editPage", method = RequestMethod.GET)
	public String editPage(ModelMap map, @RequestParam("productId") Integer productId) {
		try {
			ProductBean product = productService.get(productId);
			map.put("productBean", product);
		} catch (ServicesException exp) {
			map.put("expInfo", exp.getMessage());
			return "error";
		}
		return "edit";
	}

	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public String update(ModelMap map, @ModelAttribute ProductBean productBean) {
		try {
			productService.saveOrUpdate(productBean);
			List<ProductBean> productList = productService.getAll();
			map.put("productList", productList);
		} catch (ServicesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}

	@RequestMapping(path = "/searchPage", method = RequestMethod.GET)
	public String searchPage(ModelMap map) {
		SearchBean search = new SearchBean();
		map.put("searchBean", search);
		return "search";
	}

	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String search(ModelMap map, @ModelAttribute SearchBean searchBean) {
		try {
			if (searchBean.getProductName().isEmpty()) {
				map.put("productNameReq", "Product Name Required");
				map.put("searchBean",searchBean);
				return "search";
			}
			List<ProductBean> productList = productService.search(searchBean.getProductName());
			if (productList == null || productList.size() == 0) {
				map.put("invalidName", "With the given product name details not found");
				map.put("searchBean",searchBean);
				return "search";
			}
			map.put("productList", productList);
		} catch (ServicesException exp) {
			map.put("expInfo", exp.getMessage());
			return "error";
		}
		return "success";
	}

	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	public String delete(ModelMap map, @RequestParam("productId") Integer productId) {
		try {
			productService.delete(productId);
			List<ProductBean> productList = productService.getAll();
			if (productList == null || productList.size() == 0) {
				map.put("noData", "Product details not found");
				return "success";
			}
			map.put("productList", productList);
		} catch (ServicesException exp) {
			map.put("expInfo", exp.getMessage());
			return "error";
		}
		return "success";
	}

}
