package kr.co.homepage.util;

import kr.co.homepage.model.MenuTree;

import java.util.List;
import java.util.stream.Collectors;

public class TreeUtil {

    public List<MenuTree> formatTree(List<MenuTree> list) {

        if(list.isEmpty()) return null;

        MenuTree firstNode = list.get(0); //기준점

        for (MenuTree node : list) {
            if (firstNode.getCode().equals(node.getParentCode())) {
                firstNode.getChildren().add(node);
            } else {
                for (MenuTree node2 : list) {
                    if (node2.getCode().equals(node.getParentCode())) {
                        node2.getChildren().add(node);
                        break;
                    }
                }
            }
        }
        return list.stream().filter(item -> item.getParentCode() == 0).collect(Collectors.toList());
    }
}
