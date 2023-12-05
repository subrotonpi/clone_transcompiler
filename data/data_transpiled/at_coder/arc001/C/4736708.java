public static int [ ] convert ( String input ) {
  int A , B ;
  int d = Integer . parseInt ( input ) ;
  int [ ] l = {
    0 , 1 , 2 , 3 , 2 , 1 , 2 , 3 , 3 , 2 }
    ;
    int c = d / 10 + l [ d % 10 ] ;
    System . out . println ( c ) ;
    return l ;
  }
  