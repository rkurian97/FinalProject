package com.CIS3368.FinalProject.controllers;
import com.CIS3368.FinalProject.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@Controller
public class MainController {

    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    ProductRepo productRepo;
    @Autowired
    TransactionRepo transactionRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");

        return mv;
    }
    @RequestMapping("/customer")
    public ModelAndView doCustomer(){
        ModelAndView mv = new ModelAndView("customer");
        mv.addObject("customerlist",customerRepo.findAll() );

        return mv;
    }
    @RequestMapping("/employee")
    public ModelAndView doEmployee(){
        ModelAndView mv = new ModelAndView("employee");
        mv.addObject("employeelist",employeeRepo.findAll());

        return mv;
    }

    @RequestMapping("/product")
    public ModelAndView doProduct(){
        ModelAndView mv = new ModelAndView("product");
        mv.addObject("productlist",productRepo.findAll());

        return mv;
    }

    @RequestMapping("/transaction")
    public ModelAndView doTransaction(){
        ModelAndView mv = new ModelAndView("transaction");
        mv.addObject("transactionlist",transactionRepo.findAll());

        return mv;
    }


    //Edits
    @RequestMapping( value = "/customerEdit/{id}", method = RequestMethod.GET)
    public ModelAndView editC(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("customerEdit");
        Optional<Customer> person = customerRepo.findById(id);
        Customer personToMap = person.get();
        mv.addObject("selectedItem", personToMap);
        return mv;
    }

    @RequestMapping(value = "/saveC", method = RequestMethod.POST)
    public ModelAndView saveC(@RequestParam("id") String id, @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName){
        ModelAndView mv = new ModelAndView("redirect:/");
        Customer personToSave ;
        if(!id.isEmpty())
        {
            Optional<Customer> users = customerRepo.findById(id);
            personToSave = users.get();
        }
        else
        {
            personToSave = new Customer();
            personToSave.setId(UUID.randomUUID().toString());
        }
        personToSave.setFirstName(firstName);
        personToSave.setLastName(lastName);
        customerRepo.save(personToSave);
        mv.addObject("customerlist", customerRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/employeeEdit/{id}", method = RequestMethod.GET)
    public ModelAndView editE(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("employeeEdit");
        Optional<Employee> person = employeeRepo.findById(id);
        Employee personToMap = person.get();
        mv.addObject("selectedItem", personToMap);
        return mv;
    }

    @RequestMapping(value = "/saveE", method = RequestMethod.POST)
    public ModelAndView saveE(@RequestParam("id") String id, @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName, @RequestParam("employeeID") int employeeID){
        ModelAndView mv = new ModelAndView("redirect:/");
        Employee personToSave ;
        if(!id.isEmpty())
        {
            Optional<Employee> users = employeeRepo.findById(id);
            personToSave = users.get();
        }
        else
        {
            personToSave = new Employee();
            personToSave.setId(UUID.randomUUID().toString());
        }
        personToSave.setFirstName(firstName);
        personToSave.setLastName(lastName);
        personToSave.setEmployeeID(employeeID);
        employeeRepo.save(personToSave);
        mv.addObject("customerlist", employeeRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/productEdit/{id}", method = RequestMethod.GET)
    public ModelAndView editP(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("productEdit");
        Optional<Product> person = productRepo.findById(id);
        Product personToMap = person.get();
        mv.addObject("selectedItem", personToMap);
        return mv;
    }

    @RequestMapping(value = "/saveP", method = RequestMethod.POST)
    public ModelAndView saveP(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("price") double price, @RequestParam("description") String description){
        ModelAndView mv = new ModelAndView("redirect:/");
        Product personToSave ;
        if(!id.isEmpty())
        {
            Optional<Product> users = productRepo.findById(id);
            personToSave = users.get();
        }
        else
        {
            personToSave = new Product();
            personToSave.setId(UUID.randomUUID().toString());
        }
        personToSave.setName(name);
        personToSave.setPrice(price);
        personToSave.setDescription(description);
        productRepo.save(personToSave);
        mv.addObject("productlist", productRepo.findAll());
        return mv;
    }

    @RequestMapping( value = "/transactionEdit/{id}", method = RequestMethod.GET)
    public ModelAndView editT(@PathVariable("id") String id){
        ModelAndView mv = new ModelAndView("transactionEdit");
        Optional<Transaction> person = transactionRepo.findById(id);
        Transaction personToMap = person.get();
        mv.addObject("selectedItem", personToMap);
        return mv;
    }

    @RequestMapping(value = "/saveT", method = RequestMethod.POST)
    public ModelAndView saveT(@RequestParam("id") String id, @RequestParam("date") String date, @RequestParam("receipt") int receipt){
        ModelAndView mv = new ModelAndView("redirect:/");
        Transaction personToSave ;
        if(!id.isEmpty())
        {
            Optional<Transaction> users = transactionRepo.findById(id);
            personToSave = users.get();
        }
        else
        {
            personToSave = new Transaction();
            personToSave.setId(UUID.randomUUID().toString());
        }
        personToSave.setDate(date);
        personToSave.setReceipt(receipt);
        transactionRepo.save(personToSave);
        mv.addObject("transactionlist", transactionRepo.findAll());
        return mv;
    }

//Deletes

    @RequestMapping(value = "/customerDelete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteCustomer(@PathVariable("id") String id){
        ModelAndView model = new ModelAndView("redirect:/");
        customerRepo.deleteById(id);
        return model;
    }

    @RequestMapping(value = "/employeeDelete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteEmployee(@PathVariable("id") String id){
        ModelAndView model = new ModelAndView("redirect:/");
        employeeRepo.deleteById(id);
        return model;
    }

    @RequestMapping(value = "/productDelete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteProduct(@PathVariable("id") String id){
        ModelAndView model = new ModelAndView("redirect:/");
        productRepo.deleteById(id);
        return model;
    }

    @RequestMapping(value = "/transactionDelete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteTransaction(@PathVariable("id") String id){
        ModelAndView model = new ModelAndView("redirect:/");
        transactionRepo.deleteById(id);
        return model;
    }

    //View
    @RequestMapping( value = "/transactionView/{id}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable("id") String id /*@RequestParam String customerid*/){
        ModelAndView mv = new ModelAndView("transactionView");
        Optional<Transaction> person = transactionRepo.findById(id);
   //     Optional<Customer> person2 = customerRepo.findById(customerid);
        Transaction personToMap = person.get();
   //     Customer customerToMap= person2.get();
        mv.addObject("selectedItem", personToMap);
      //  mv.addObject("selectedItem2", customerToMap);
        return mv;
    }



}