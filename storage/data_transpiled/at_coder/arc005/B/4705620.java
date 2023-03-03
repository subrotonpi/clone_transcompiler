public static String input ( ) {
  String [ ] [ ] T = new String [ 10 ] [ ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    T [ i ] [ 0 ] = new String ( ) ;
  }
  String [ ] [ ] d = new String [ ] [ ] {
    {
      "R" , ( short ) 0 , ( short ) 1 , ( short ) 0 , ( short ) - 1 , ( short ) 0 , ( short ) 1 , ( short ) 1 , ( short ) - 1 , ( short ) 1 , ( short ) 1 , ( short ) - 1 , ( short ) - 1 }
      , {
        "R" , ( short ) 0 , ( short ) 1 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 , ( short ) 0 }
        ;
        String rev = new String [ ] [ ] {
          "R" , "L" , "R" , "U" , "D" , "D" , "U" , "RU" , "LD" , "RU" , "LU" }
          ;
          String rev1 = new String [ ] {
            "LD" , "RD" , "RD" , "RU" , "LU" }
            ;
            String rev2 = new String [ ] {
              "LU" , "LD" , "LU" , "RU" , "RD" , "RU" }
              ;
              for ( int i = 0 ;
              i < 9 ;
              i ++ ) {
                T [ i ] = new String [ ] {
                  input }
                  ;
                }
                String t = "" ;
                int x = Integer . parseInt ( x ) - 1 ;
                int y = Integer . parseInt ( y ) - 1 ;
                y = x ;
                t += T [ x ] [ y ] ;
                for ( int i = 0 ;
                i < 3 ;
                i ++ ) {
                  int nx = x + d [ W ] [ 0 ] ;
                  int ny = y + d [ W ] [ 1 ] ;
                  if