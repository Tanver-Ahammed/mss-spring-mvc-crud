package com.spring.crud.controller;

import com.spring.crud.dao.ProductDao;
import com.spring.crud.dao.ProductDaoImplements;
import com.spring.crud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

	@Autowired
	private ProductDaoImplements productDao;

	@RequestMapping(path = "/")
	public String home0() {
		return "home";
	}

	@RequestMapping(path = "/home")
	public String home(Model model) {
		List<Product> products = this.productDao.getAllProduct();
		model.addAttribute("products", products);
		return "home";
	}

	// show add product form
	@RequestMapping(path = "/add-product")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "add_product_form";
	}

	// handle add product form
	@RequestMapping(path = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		this.productDao.insertProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// delete handler
	@RequestMapping(path = "/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		this.productDao.deleteSingleProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// update handler
	@RequestMapping(path = "/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId, Model model) {
		Product product = this.productDao.getSingleProduct(productId);
		model.addAttribute("product", product);
		return "update_form";
	}

}
