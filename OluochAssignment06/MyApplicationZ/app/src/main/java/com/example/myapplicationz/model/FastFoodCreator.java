package com.example.myapplicationz.model;

import java.util.ArrayList;

public class FastFoodCreator {
    public ArrayList<FastFood> fastfoods;
    public ArrayList<String> names;
    public ArrayList<String> foods;
    public ArrayList<String> slogans;
    public ArrayList<String> descriptions;

    public FastFoodCreator(){
        FastFood food1 = new FastFood("McDonalds","Burgers","I'm Lovin' It", "McDonald's is an American fast food company, founded in 1940 as a restaurant operated by Richard and Maurice McDonald, in San Bernardino, California, United States. They rechristened their business as a hamburger stand, and later turned the company into a franchise, with the Golden Arches logo being introduced in 1953 at a location in Phoenix, Arizona.");
        FastFood food2 = new FastFood("Taco Bell","Tacos","Live Mas", "Taco Bell is an American chain of fast food restaurants based out of Irvine, California and a subsidiary of Yum! Brands, Inc. The restaurants serve a variety of Tex-Mex foods that include tacos, burritos, quesadillas, nachos, novelty and specialty items, and a variety of \"value menu\" items.");
        FastFood food3 = new FastFood("Burger King","Burgers","Have it Your Way", "Burger King (BK) is an American global chain of hamburger fast food restaurants. Headquartered in the unincorporated area of Miami-Dade County, Florida, the company was founded in 1953 as Insta-Burger King, a Jacksonville, Florida–based restaurant chain. After Insta-Burger King ran into financial difficulties in 1954, its two Miami-based franchisees David Edgerton and James McLamore purchased the company and renamed it \"Burger King\".");
        FastFood food4 = new FastFood("Wendy's","Burgers","Here's the beef!", "Wendy's is an American international fast food restaurant chain founded by Dave Thomas on November 15, 1969, in Columbus, Ohio. The company moved its headquarters to Dublin, Ohio, on January 29, 2006. As of 2016, Wendy's was the world's third largest hamburger fast food chain with 6,500+ locations, following Burger King and McDonald's.");
        FastFood food5 = new FastFood("Pizza Hut","Pizza","No one out Pizza's the Hut", "Pizza Hut is an American restaurant chain and international franchise which was founded in 1958 by Dan and Frank Carney. The company is known for its Italian-American cuisine menu, including pizza and pasta, as well as side dishes and desserts.");
        FastFood food6 = new FastFood("KFC","Chicken","Finger lickin' good!", "KFC, also known as Kentucky Fried Chicken, is an American fast food restaurant chain that specializes in fried chicken. Headquartered in Louisville, Kentucky, it is the world's second-largest restaurant chain (as measured by sales) after McDonald's, with almost 20,000 locations globally in 123 countries and territories as of December 2015.");
        FastFood food7 = new FastFood("Popeye's","Chicken","Louisiana Fast", "Popeyes is an American multinational chain of fried chicken fast food restaurants founded in 1972 in New Orleans, Louisiana. Since 2008, its full brand name is Popeyes Louisiana Kitchen, Inc., and it was formerly named Popeyes Chicken & Biscuits and Popeyes Famous Fried Chicken & Biscuits. It is currently a subsidiary of Toronto-based Restaurant Brands International.");
        FastFood food8 = new FastFood("Dominoes","Pizza","You Got 30 Minutes", "Domino's Pizza, Inc., branded as Domino's, is an American pizza restaurant chain founded in 1960. The corporation is headquartered at the Domino's Farms Office Park in Ann Arbor, Michigan, and incorporated in Delaware. In February 2018, the chain became the largest pizza seller worldwide in terms of sales.");
        FastFood food9 = new FastFood("Buffalo Wild Wings","Chicken", "Wings. Beer. Sports.", "Buffalo Wild Wings (originally Buffalo Wild Wings & Weck, hence the numeronym BW3) is an American casual dining restaurant and sports bar franchise in the United States, Canada, India, Mexico, Oman, Panama, Philippines, Saudi Arabia, United Arab Emirates, and Vietnam which specializes in Buffalo wings and sauces.");
        FastFood food10 = new FastFood("Five Guys","Burgers","Always fresh. Never frozen.", "Five Guys Enterprises LLC (doing business as Five Guys Burgers and Fries) is an American fast casual restaurant chain focused on hamburgers, hot dogs, and French fries, and headquartered in Lorton, Virginia, an unincorporated part of Fairfax County.");
        FastFood food11 = new FastFood("Qdoba","Tacos","We Live Food", "Qdoba Mexican Eats (kew-DOH-bə) is a chain of fast casual restaurants in the United States and Canada serving Mexican-style cuisine. The company operated as a wholly owned subsidiary of Jack in the Box after its purchase from ACI Capital, Western Growth Capital, and other private investors in 2003.");
        FastFood food12 = new FastFood("Sonic","Burgers","Service at the Speed of Sound", "Sonic Corp., more commonly known as Sonic (stylized as SONIC), is the operator of an American drive-in fast-food restaurant chain based in Oklahoma City, Oklahoma, that is owned by Inspire Brands, the parent company of Arby's and Buffalo Wild Wings.");
        FastFood food13 = new FastFood("Arby's","Sandwiches","We have the meats!", "Arby's is an American quick-service fast-food sandwich restaurant chain with more than 3,300 restaurants system wide and third in terms of revenue. In October 2017, Food & Wine called Arby's \"America's second largest sandwich chain (after Subway)\"");
        FastFood food14 = new FastFood("Little Caesar's","Pizza","Pizza! Pizza!", "Little Caesar Enterprises Inc. (doing business as Little Caesars) is the third-largest pizza chain in the United States, behind Pizza Hut and Domino's Pizza. It operates and franchises pizza restaurants in the United States and internationally in Asia, the Middle East, Australia, Canada, Latin America and the Caribbean.");
        FastFood food15= new FastFood("Chick-Fil-A","Chicken","Eat Mor Chikin", "Chick-fil-A ( a play on the American English pronunciation of fillet) is an American fast food restaurant chain headquartered in the city of College Park, Georgia, specializing in chicken sandwiches.");
        FastFood food16 = new FastFood("Chipotle","Burritos","Food with Integrity", "Chipotle Mexican Grill, Inc. ( chih-POHT-lay) is an American chain of fast casual restaurants in the United States, United Kingdom, Canada, Germany, and France, specializing in tacos and Mission-style burritos. Its name derives from chipotle, the Nahuatl name for a smoked and dried jalapeño chili pepper.");
        FastFood food17 = new FastFood("Papa Johns","Pizza","Better Ingredients. Better Pizza", "Papa John's Pizza is an American pizza restaurant franchise. It runs the fourth largest pizza delivery restaurant chain in the United States, with headquarters in Jeffersontown, Kentucky, a suburb of Louisville.");
        FastFood food18 = new FastFood("Johnny Rockets","Burgers","The Original Hamburger.", "The Johnny Rockets Group Inc. is an American restaurant franchise whose themed decor is based upon 1950s diner-style restaurants. Decor includes Coca-Cola advertising, featuring nearly life-size cardboard illustrations of women in World War II armed services uniforms (see WASP- Women Airforce Service Pilots), individual jukebox stations, chrome accents and red vinyl seats.");
        FastFood food19 = new FastFood("Cheeburger Cheeburger","Burgers","Big is Better", "Cheeburger Cheeburger is a 1950s-style burger restaurant chain that started on Sanibel Island, Florida, United States, in 1986. They specialize in cheeseburgers, french fries, onion rings, and milkshakes.");
        FastFood food20 = new FastFood("Whataburger","Burgers","Just like you like it.", "Whataburger is an American privately held regional fast food restaurant chain, based in San Antonio, Texas, that specializes in hamburgers. The company, founded by Harmon Dobson and Paul Burton, opened its first restaurant in Corpus Christi, Texas, in 1950. ");




        ArrayList<FastFood> ff= new ArrayList<FastFood>();
        ff.add(food1);
        ff.add(food2);
        ff.add(food3);
        ff.add(food4);
        ff.add(food5);
        ff.add(food6);
        ff.add(food7);
        ff.add(food8);
        ff.add(food9);
        ff.add(food10);
        ff.add(food11);
        ff.add(food12);
        ff.add(food13);
        ff.add(food14);
        ff.add(food15);
        ff.add(food16);
        ff.add(food17);
        ff.add(food18);
        ff.add(food19);
        ff.add(food20);


        this.fastfoods=ff;

       ArrayList<String> name0= new ArrayList<String>();
       ArrayList<String> food0= new ArrayList<String>();
       ArrayList<String> slogan0= new ArrayList<String>();
       ArrayList<String> desc0= new ArrayList<String>();

//       int index = 0;
       for (FastFood a: ff){
           name0.add(a.getName());
           food0.add(a.getFood());
           slogan0.add(a.getSlogan());
           desc0.add(a.getDescription());
       }

       this.names=name0;
       this.foods=food0;
       this.descriptions=desc0;
       this.slogans=slogan0;
    }

    public ArrayList<String> getDescriptions() {
        return descriptions;
    }

    public ArrayList<String> getFoods() {
        return foods;
    }

    public ArrayList<String> getSlogans() {
        return slogans;
    }

    public ArrayList<String> getNames() {
        return names;
    }
}
