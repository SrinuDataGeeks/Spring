package com.datageeks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.datageeks.dao.EmployeeBean;
import com.datageeks.service.EmployeeService;
import com.datageeks.service.ServicesException;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService = null;

	@RequestMapping(path = "/loadEmps", method = RequestMethod.GET)
	public String getAll(ModelMap map) {
		try {
			List<EmployeeBean> empList = employeeService.getAll();
			map.put("employeeList", empList);
		} catch (ServicesException e) {
			map.put("expInfo", e.getMessage());
			return "error";
		}

		return "success";
	}

	@RequestMapping(path = "/editPage", method = RequestMethod.GET)
	public String editPage(ModelMap map, @RequestParam("empId") Integer empId) {
		try {
			EmployeeBean emp = employeeService.getById(empId);
			map.put("employeeBean", emp);
		} catch (ServicesException e) {
			map.put("expInfo", e.getMessage());
			return "error";
		}

		return "edit";
	}

	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public String update(ModelMap map, @ModelAttribute EmployeeBean employeeBean) {
		try {
			employeeService.saveOrUpdate(employeeBean);
			List<EmployeeBean> empList = employeeService.getAll();
			map.put("employeeList", empList);
			map.put("resultMsg", "Employee Details Updated Successfully");
		} catch (ServicesException e) {
			map.put("expInfo", e.getMessage());
			return "error";
		}

		return "success";
	}

	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	public String delete(ModelMap map, @RequestParam("empId") Integer empId) {
		try {
			employeeService.delete(empId);
			List<EmployeeBean> empList = employeeService.getAll();
			map.put("employeeList", empList);
			map.put("resultMsg", "Employee  Deleted Successfully");
		} catch (ServicesException e) {
			map.put("expInfo", e.getMessage());
			return "error";
		}

		return "success";
	}

}
