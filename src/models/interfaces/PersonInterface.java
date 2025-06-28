package src.models.interfaces;

import src.models.enums.Role;

public interface PersonInterface {
    String getName();
    Role getRole();
    String getAddress();
    default String getInfo(){
        return getName() + ',' + getAddress() ;
    }
}
