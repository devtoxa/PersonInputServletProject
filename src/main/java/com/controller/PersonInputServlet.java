package com.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PersonInputServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		String [] hobby = req.getParameterValues("hobby");
		String job = req.getParameter("job");
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		p.setHobby(hobby);
		p.setJob(job);
		req.setAttribute("person",p);
		// 결과를 infoResult.jsp에 출력
		RequestDispatcher rd = req.getRequestDispatcher("/exam/personResult.jsp");
		rd.forward(req, resp);
	}
}
