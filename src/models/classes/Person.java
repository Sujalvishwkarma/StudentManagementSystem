package src.models.classes;

import src.models.enums.Role;
import src.models.interfaces.PersonInterface;;

public class Person implements PersonInterface {
    private String name ;
    private Role role ;
    private String address ;

    Person(String name,Role role,String address){
        this.name = name ;
        this.role = role ;
        this.address = address ;
    }

    @Override public String getName()    { return this.name; }
    @Override public Role getRole()    { return this.role; }
    @Override public String getAddress() { return this.address; }

    @Override
    public String toString(){
        return this.name + ',' + this.address ;
    }
}
