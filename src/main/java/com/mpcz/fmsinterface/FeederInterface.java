package com.mpcz.fmsinterface;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface FeederInterface extends BeanInterface {

   
	public long getId();

    public void setId(long id);

    public long getSubstationId();

    public void setSubstationId(long substationId);

    public String getFeederName();

    public void setFeederName(String feederName);

    public String getFeederType();

    public void setFeederType(String feederType);

    public String getStatus();

    public void setStatus(String status);

    public String getCreatedBy();

    public void setCreatedBy(String createdBy);

    public Date getCreatedOn();

    public void setCreatedOn(Date createdOn);

    public String getUpdatedBy();

    public void setUpdatedBy(String updatedBy);

    public Date getUpdatedOn();

    public void setUpdatedOn(Date updatedOn);

}
