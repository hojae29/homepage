package kr.co.homepage.model;

public class Menu {

    private Integer code;
    private String type;
    private Integer boardCode;
    private Integer parentCode;
    private String name;
    private String engName;
    private String information;
    private int order;
    private boolean show;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getBoardCode() {
        return boardCode;
    }

    public void setBoardCode(Integer boardCode) {
        this.boardCode = boardCode;
    }

    public Integer getParentCode() {
        return parentCode;
    }

    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public MenuTree toTree(){
        MenuTree tree = new MenuTree();
        tree.setCode(this.code);
        tree.setParentCode(this.parentCode);
        tree.setText(this.name);
        tree.setEngName(this.engName);
        return tree;
    }
}