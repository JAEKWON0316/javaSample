package web06.contact;

public class ContactInfo {
   //셋으로 받아서 겟으로 바꿔서 쓰기
    private String name;
    private String email;
    
   public String getName() { 
      return name;
   }
   public void setName(String name) {  
      this.name = name;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
}
