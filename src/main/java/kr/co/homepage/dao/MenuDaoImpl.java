package kr.co.homepage.dao;

import kr.co.homepage.model.Menu;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MenuDaoImpl implements MenuDao {

    @Autowired
    SqlSession sql;

    @Override
    public List<Menu> findAll() {
        return sql.selectList("menu.findAll");
    }

    @Override
    public List<Menu> findSortedAll() {
        return sql.selectList("menu.findSortedAll");
    }
}
