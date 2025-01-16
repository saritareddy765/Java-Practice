package com.mainMethod;

public class Main {
    //valid main methods
    public static void main(String[] args) {
        System.out.println("valid and invalid methods");
       /*
          valid methods:
       * static public void main(String[] args){}
        *  public static void main(int[] args){}
          -- It will work and didn't through any error.
          -- But the compilation and runtime may be some errors will occur.
          -- main method overloading.
          -- Any type of data type will be pass instead of String data type.
          -- we can more than one data type main method.

          invalid methods:
        * static void public main(String[] args){invalid,bcz void is always
                         placed before the main method only}
        * void main(String[] args) public static {}
              -- invalid,bcz public static put it before only.
              -- the method name already given and some arguments are passed.
              -- after closing () this bracket,the flower bracket should be started.
              -- we shouldn't  give any keyword after the closing bracket of the method.

    */
    }

}
