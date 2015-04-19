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
public class Doneness {
    
    private String dName;
    private int dLevel;
    private int dTemp;
    private int dTime;
    private String dTexture;

    /**
     * @return the dName
     */
    public String getdName() {
        return dName;
    }

    /**
     * @param dName the dName to set
     */
    public void setdName(String dName) {
        Integer.parseInt(dName);
        this.dName = dName;
    }

    /**
     * @return the dLevel
     */
    public int getdLevel() {
        return dLevel;
    }

    /**
     * @param dLevel the dLevel to set
     */
    public void setdLevel(int dLevel) {
        this.dLevel = dLevel;
    }

    /**
     * @return the dTemp
     */
    public int getdTemp() {
        return dTemp;
    }

    /**
     * @param dTemp the dTemp to set
     */
    public void setdTemp(int dTemp) {
        this.dTemp = dTemp;
    }

    /**
     * @return the dTime
     */
    public int getdTime() {
        return dTime;
    }

    /**
     * @param dTime the dTime to set
     */
    public void setdTime(int dTime) {
        
        this.dTime = dTime;
    }

    /**
     * @return the dTexture
     */
    public String getdTexture() {
        return dTexture;
    }

    /**
     * @param dTexture the dTexture to set
     */
    public void setdTexture(String dTexture) {
        this.dTexture = dTexture;
    }
    
}
