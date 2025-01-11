package com.Basics;

public class Comments {
    static  int a = 100;
    public static void main(String[] args) {
        Comments comments = new Comments();
        comments.single();
        comments.documental();
        comments.multi();

    }
           public void single(){
        System.out.println("Single Comment");//Single Comment
           }
    /*
 MultiLine Comments
 int a = 5;
 int b = 6;

*/
           public void multi() {
               System.out.println("Multi Comment");
           }
    /**Comment start
     *
     * This class is used for performing operations on comments
     * Used in above of the package,class,methods,variables
     * not used inside the method
     *
     *comment ends*/
           public void documental(){
               System.out.println("Documentation Comment");
           }


}
