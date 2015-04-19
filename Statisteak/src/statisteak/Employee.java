/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package statisteak;

/**
 *
 * @author Asus
 */
public class Employee {
    
    private String eName;
    private int eId;

    /**
     * @return the eName
     */
    public String geteName() {
        return eName;
    }

    /**
     * @param eName the eName to set
     */
    public void seteName(String eName) {
        Integer.parseInt(eName);
        this.eName = eName;
    }

    /**
     * @return the eId
     */
    public int geteId() {
        return eId;
    }

    /**
     * @param eId the eId to set
     */
    public void seteId(int eId) {
        this.eId = eId;
    }
    
    
    
}
