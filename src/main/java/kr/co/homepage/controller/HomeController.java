package kr.co.homepage.controller;

import kr.co.homepage.model.MenuTree;
import kr.co.homepage.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	MenuService menuService;

	@GetMapping
	public String main(Model model) {
		List<MenuTree> menuList = menuService.findAllToTree();
		model.addAttribute("menuList", menuList);
		return "index";
	}

	@GetMapping("/{menuEngName}")
	public String moveMenu(@PathVariable String menuEngName, Model model){
		List<MenuTree> menuList = menuService.findAllToTree();
		model.addAttribute("menuList", menuList);

//		for(MenuTree menu : menuList){
//			for (MenuTree item : menu.getChildren()) {
//				if (item.getEngName().equals(menuEngName))
//					break;
//			}
//			model.addAttribute("selectedMenuList", menu);
//			break;
//		}

		return "layout";
	}
}
