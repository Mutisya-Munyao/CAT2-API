package com.CAT90360;

public class Unit {

    private Long unitId;
    private String unitName;

    public Unit(String unitName) {
        this.unitName = unitName;
    }

    private Unit(){

    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + unitId +
                ", courseName='" + unitName + '\'' +
                '}';
    }
}
