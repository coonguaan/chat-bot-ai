package com.aise.chat.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {

	@RequestMapping(value = "/chathome")
	public void chatHome(HttpServletRequest res, HttpServletResponse rep) throws ServletException, IOException{
		String input = res.getParameter("input");
		// 以下に、APIリクエストに応じたレスポンスを生成するコードを記述する
		String responseMessage = "こんにちは、お助けできますか？";
		rep.setContentType("application/json");
		PrintWriter out =  rep.getWriter();
		out.print("{\"response\": \"" + responseMessage + "\"}");
		out.flush();
	}
}
