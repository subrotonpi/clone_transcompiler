public static void i ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] r = {
    0 , 1 , 2 }
    ;
    HashMap < Point , Integer > map = new HashMap < Point , Integer > ( ) ;
    while ( n -- > 0 ) {
      int a = i ( ) ;
      int b = i ( ) ;
      n -- ;
      for ( int j = 0 ;
      j < r . length ;
      j ++ ) {
        for ( int k = 0 ;
        k < r . length ;
        k ++ ) if ( w >= b ) map . put ( ( Point ) a + j , ( Point ) b ) ;
      }
    }
  }
  