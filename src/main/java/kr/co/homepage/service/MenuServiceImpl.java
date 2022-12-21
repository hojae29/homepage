package kr.co.homepage.service;

import kr.co.homepage.dao.MenuDao;
import kr.co.homepage.model.Menu;
import kr.co.homepage.model.MenuTree;
import kr.co.homepage.util.TreeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuDao menuDao;

    @Override
    public List<Menu> findAll() {
        return menuDao.findAll();
    }

    @Override
    public List<MenuTree> findAllToTree() {
        List<Menu> menuList = menuDao.findSortedAll();
        List<MenuTree> menuTreeList = new ArrayList<>();

        //Menu -> MenuDto 변경
        menuList.forEach(menu -> menuTreeList.add(menu.toTree()));

        TreeUtil treeUtil = new TreeUtil();

        return treeUtil.formatTree(menuTreeList);
    }
}
