package kr.co.homepage.service;

import kr.co.homepage.model.Menu;
import kr.co.homepage.model.MenuTree;

import java.util.List;

public interface MenuService {
    List<Menu> findAll();

    List<MenuTree> findAllToTree();
}
