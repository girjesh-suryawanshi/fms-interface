package com.mpcz.fmsinterface;

import java.util.Date;

public interface SubstationInterface extends BeanInterface {


    public long getId();

    public void setId(long id);

    public String getSubstationName();

    public void setSubstationName(String substationName);

    public String getSubstationCode();

    public void setSubstationCode(String substationCode);

    public long getPowerTransformer();

    public void setPowerTransformer(long powerTransformer);

    public long getIncomingLines();

    public void setIncomingLines(long incomingLines);

    public long getZoneId();

    public void setZoneId(long zoneId);

    public String getCreatedBy();

    public void setCreatedBy(String createdBy);

    public Date getCreatedOn();

    public void setCreatedOn(Date createdOn);

    public String getUpdatedBy();

    public void setUpdatedBy(String updatedBy);

    public Date getUpdatedOn();

    public void setUpdatedOn(Date updatedOn);

}
