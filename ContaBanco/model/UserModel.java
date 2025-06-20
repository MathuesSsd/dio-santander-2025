package ContaBanco.model;

import java.time.LocalDate;
import java.util.Objects;

public class UserModel{
    private long  id;
    private String name;
    private String email;
    private LocalDate birthday;

    public UserModel(final long id, final String name, final String email, final LocalDate birthday){
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    } 

    public UserModel(){};

    public long getId(){
        return id;
    }

    public void setId(final long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(final String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(final String email){
        this.email = email;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public void setBirthday(final LocalDate birthday){
        this.birthday = birthday;
    }

    @Override
    public boolean equals(final Object o){
        if (this == o) return true;
        if (!(o instanceof UserModel userModel)) return false;
        return id == userModel.id 
        && Objects.equals(name, userModel.name)
        && Objects.equals(email, userModel.email)
        && Objects.equals(birthday, userModel.birthday);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, email, birthday);
    }
}
