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
public class Statisteak {

    
    
    
    public static void main(String[] args) {
    
    //=========================================================================    
    // [DONENESS = TINGKAT KEMATANGAN STEAKNYA]
    // (dName = nama tingkat kematangannya)
    // (dLevel =  tingkat kematangannya)
    // (dTemp = temperatur dalam derajat celcius yg dibutuhkan)
    // (dTime = lama memasak dalam menit)
    // (dTexture = tekstur kematangannya)
        
        Doneness d1 = new Doneness();
        d1.setdName("Blue");
        d1.setdLevel(1);
        d1.setdTemp(47);
        d1.setdTime(2);
        d1.setdTexture("Seared on the outside, completely red throughout");
        
        Doneness d2 = new Doneness();
        d2.setdName("Rare");
        d2.setdLevel(2);
        d2.setdTemp(53);
        d2.setdTime(3);
        d2.setdTexture("Seared outside and still red 75% through the centre");
        
        Doneness d3 = new Doneness();
        d3.setdName("Medium Rare");
        d3.setdLevel(3);
        d3.setdTemp(57);
        d3.setdTime(4);
        d3.setdTexture("Seared outside with 50% red centre");
        
        Doneness d4 = new Doneness();
        d4.setdName("Medium");
        d4.setdLevel(4);
        d4.setdTemp(63);
        d4.setdTime(5);
        d4.setdTexture("Seared outside, 25% pink showing inside");
        
        Doneness d5 = new Doneness();
        d5.setdName("Medium Well");
        d5.setdLevel(5);
        d5.setdTemp(67);
        d5.setdTime(6);
        d5.setdTexture("A Slight hint of pink");
        
        Doneness d6 = new Doneness();
        d6.setdName("Well Done");
        d6.setdLevel(6);
        d6.setdTemp(85);
        d6.setdTime(7);
        d6.setdTexture("Boiled until 100% brown");
    //=========================================================================
    //[MEAT TYPE]
        
        MeatType m1 = new MeatType();
        m1.setmName("Wagyu Beef");
        
        MeatType m2 = new MeatType();
        m2.setmName("Kobe Beef");
        
        MeatType m3 = new MeatType();
        m3.setmName("Tuna");
        
        MeatType m4 = new MeatType();
        m4.setmName("Salmon");
        
        MeatType m5 = new MeatType();
        m5.setmName("Mahi-mahi");
        
        MeatType m6 = new MeatType();
        m6.setmName("Swordfish");
        
        MeatType m7 = new MeatType();
        m7.setmName("Lamb");
        
        MeatType m8 = new MeatType();
        m8.setmName("Boston Butt Pork");
        
        MeatType m9 = new MeatType();
        m9.setmName("Ham");
        
        MeatType m10 = new MeatType();
        m10.setmName("Chicken Fried");
        
        MeatType m11 = new MeatType();
        m11.setmName("Kangaroo");
        
        MeatType m12 = new MeatType();
        m12.setmName("Camel");
        
        MeatType m13 = new MeatType();
        m13.setmName("Horse");
        
        MeatType m14 = new MeatType();
        m14.setmName("Bison");
        
        MeatType m15 = new MeatType();
        m15.setmName("Ostrich");
        
        MeatType m16 = new MeatType();
        m16.setmName("Deer");
        
        MeatType m17 = new MeatType();
        m17.setmName("Reindeer");
        
        
    //
    //=========================================================================
    //[SAUCE]
        
        Sauce s1 = new Sauce();
        s1.setsName("Salsa Verde");
        s1.setsDesc("Chopped parsley, chives, mint, mixed in a bowl with capers,"
                + " few anchovies, crushed garlic, lemon juice, and olive oil");
        
        Sauce s2 = new Sauce();
        s2.setsName("Peppercorn Sauce");
        s2.setsDesc("Red wine vinegar, chicken stock, green peppercorns, and"
                +" double cream");
        
        Sauce s3 = new Sauce();
        s3.setsName("Bearnaise Sauce");
        s3.setsDesc("Butter, finely-chopped shallot, white wine vinegar, creme"
                +" fraiche, Dijon mustard, capers, and chopped tarragon");
        
        Sauce s4 = new Sauce();
        s4.setsName("Spicy Chimichurri");
        s4.setsDesc("Garlic, red chilli, coriander, parsley, red wine vinegar,"
                +" and olive oil");
        
        Sauce s5 = new Sauce();
        s5.setsName("Black Bean and Sesame Sauce");
        s5.setsDesc("Rinsed black beans, soft dark brown sugar, honey, Chinese"
                +" five-spice powder, grated ginger, red chilli, tahini paste,"
                +" cider vinegar, and soy sauce");
        
        Sauce s6 = new Sauce();
        s6.setsName("Quick Red Wine Sauce");
        s6.setsDesc("Beef stock, red wine, dark brown sugar, and balsamic vinegar");
        
        Sauce s7 = new Sauce();
        s7.setsName("Teriyaki Sauce");
        s7.setsDesc("Soy sauce, sake, mirin, ginger, honey, and spring onion");
        
        Sauce s8 = new Sauce();
        s8.setsName("Mustard Sauce");
        s8.setsDesc("Dijon mustard and creme fraiche");
        
        Sauce s9 = new Sauce();
        s9.setsName("Blue Cheese Sauce");
        s9.setsDesc("Butter, flour, milk, stilton, and blue cheese");
        
        Sauce s10 = new Sauce();
        s10.setsName("Mushroom Sauce");
        s10.setsDesc("Olive oil, chestnut mushrooms, garlic clove, brandy,"
                +" double cream, and wholegrain mustard");
    //
    //=========================================================================
    //[EMPLOYEE]
    //
        Employee e1 = new Employee();
        e1.seteName("Danang");
        e1.seteId(2001);
        
        Employee e2 = new Employee();
        e2.seteName("Darto");
        e2.seteId(2002);
    //=========================================================================
    //[CUSTOMER]
    //
        Customer c1 = new Customer();
        c1.setcName("Andro");
                
        
    //=========================================================================
        
        
    }
    
}
