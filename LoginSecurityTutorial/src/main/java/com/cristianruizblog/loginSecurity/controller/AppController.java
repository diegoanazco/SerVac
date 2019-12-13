package com.cristianruizblog.loginSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/generic")
	public String generic()
	{
		return "generic";
	}
	
	@GetMapping("/galeriaVentana")
	public String galeriaVentana()
	{
		return "galeriaVentana";
	}
	
	@GetMapping("/galeriaVentanal")
	public String galeriaVentanal()
	{
		return "galeriaVentanal";
	}
	@GetMapping("/galeriaMampara")
	public String galeriaMampara()
	{
		return "galeriaMampara";
	}
	@GetMapping("/galeriaAluminio")
	public String galeriaAluminio()
	{
		return "galeriaAluminio";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
}
