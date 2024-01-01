package com.Expence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Expence.model.Expense;
import com.Expence.service.serviceInterface;



@Controller
public class expanseController {
	
	@Autowired
	serviceInterface service;

	    @GetMapping("/")
	    public ModelAndView Home() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("massage","List of expenses");
		List<Expense> expenses = service.findAll();
		mv.addObject("expenses", expenses);
		return mv;
	}
	    
	    @RequestMapping("/expense")
	    public ModelAndView addexpense() {
		ModelAndView mv = new ModelAndView("expense");
		mv.addObject("expense", new Expense());
		return mv;
	}
	    
	    
	    @RequestMapping(value="/expense", method=RequestMethod.POST)
	    public String save(@ModelAttribute("expense")Expense expense) {
	    	
	    	service.saveExpense(expense);
	    	return "redirect:/";
		
	    }
	    
	    @RequestMapping(value="/expense/{id}", method = RequestMethod.GET)
	    public ModelAndView  edit(@PathVariable("id") Long id) {
	    	ModelAndView mv = new ModelAndView("expense");
	    	Expense expense = service.findById(id);
	    	mv.addObject("expense", expense);
	    	return mv;
	    }
	    
	    @RequestMapping(value="/expense/{id}/delete")
	    public String delete(@PathVariable("id") Long id) {
	    	service.Delete(id);
	    	return "redirect:/";
	    }
	    
	    
	    
	    
	    
	    
	    
	    
}