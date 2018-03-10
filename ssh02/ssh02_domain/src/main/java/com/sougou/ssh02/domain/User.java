package com.sougou.ssh02.domain;  
/**  
 * ClassName:User <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午4:40:40 <br/>       
 */
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private String sex;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", age=" + age + ", sex=" + sex + "]";
    }
    
    
}
  
