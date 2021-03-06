package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;


@WebServlet("/contacts")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContactController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("Inside Contact Controller");
		ContactService contactService = ContactService.getInstance();
		List<Contact> contacts = contactService.get();
		
		System.out.println(contacts.size());
		request.setAttribute("contactList", contacts);

		RequestDispatcher view = request.getRequestDispatcher("contacts.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}