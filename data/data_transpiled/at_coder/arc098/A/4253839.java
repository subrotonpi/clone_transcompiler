public static int [ ] min ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = new String ( input ) ;
  int [ ] p = {
    0 , 0 }
    ;
    int [ ] l = {
      s . indexOf ( "E" ) , s . indexOf ( "W" ) }
      ;
      int [ ] t = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( s . charAt ( i ) == 'E' ) {
          t [ i ] = l [ 0 ] + p [ 1 ] - 1 ;
          l [ 0 ] -- ;
          p [ 0 ] ++ ;
        }
        else {
          t [ i ] = l [ 0 ] + p [ 1 ] ;
          l [ 1 ] -- ;
          p [ 1 ] ++ ;
        }
      }
      System . out . println ( min ( t ) ) ;
      return t ;
    }
    