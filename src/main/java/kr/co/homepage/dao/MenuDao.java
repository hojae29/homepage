package kr.co.homepage.dao;

import kr.co.homepage.model.Menu;

import java.util.List;

public interface MenuDao {

    List<Menu> findAll();

    List<Menu> findSortedAll();
}
