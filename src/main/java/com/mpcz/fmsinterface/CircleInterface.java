package com.mpcz.fmsinterface;

public interface CircleInterface extends BeanInterface {


    public long getId();


    public void setId(long id);

    public String getCode();

    public void setCode(String code);

    public String getName();

    public void setName(String name);

    public RegionInterface getRegion();

    public void setRegion(RegionInterface region);

}
