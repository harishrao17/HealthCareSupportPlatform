/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.User;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nehar
 */
public class UserDirectory {
     ArrayList<User> userDirectory;

    public UserDirectory() {

        userDirectory = new ArrayList<>();
    }

    public ArrayList<User> getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(ArrayList<User> userDirectory) {
        this.userDirectory = userDirectory;
    }

    public User addUser() {
       
            User user = new User();
            userDirectory.add(user);
            return user;
        
    }
    
    public void addUserDefault(String emailId,String userName,String password,String name ,char   type ,String phoneNumber,Date DOB ,String gender,String emergencyPhoneNumber,String relationShip ,String addr, String zip ,String state ,String urban ,boolean heart,boolean liver ,boolean lungs ,boolean kidney ,boolean eyes,boolean limbs) {
            User user = new User();
            userDirectory.add(user);
            user.setEmailId(emailId);
            user.setPassword(password);
            user.setUserName(userName);
            user.setName(name);
            user.setAddr(addr);
            user.setType(type);
            user.setPhoneNumber(phoneNumber);
            user.setEmergencyPhoneNumber(emergencyPhoneNumber);
            user.setZip(zip);
            user.setDOB(DOB);
            user.setGender(gender);
            user.setRelationShip(relationShip);
            user.setState(state);
            user.setUrban(urban);
            user.setKidney(kidney);
            user.setHeart(heart);
            user.setLimbs(limbs);
            user.setLiver(liver);
            user.setEyes(eyes);
            user.setLungs(lungs);
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (User ua : userDirectory){
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }

    public boolean checkIfEmailidExist(String emailId) {
        for (User user : userDirectory) {
            if (user.getEmailId().equals(emailId)) {
                return true;
            }
        }
        return false;
    }

    public User authenticateUser(String username, String password) {
        for (User user : userDirectory) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
