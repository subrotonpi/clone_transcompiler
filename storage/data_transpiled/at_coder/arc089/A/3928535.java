public static void print ( int n ) {
  int [ ] [ ] s = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = new int [ ] {
    Integer . parseInt ( input . nextLine ( ) ) }
    ;
    Arrays . sort ( s , 0 , new int [ ] {
      0 , 0 , 0 }
      ) ;
      int p = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int c = s [ i + 1 ] [ 0 ] - s [ i ] [ 0 ] ;
        int d = Math . abs ( s [ i + 1 ] [ 1 ] - s [ i ] [ 1 ] ) + Math . abs ( s [ i + 1 ] [ 2 ] - s [ i ] [ 2 ] ) ;
        if ( c < d || ( c - d ) % 2 == 1 ) {
          p = 1 ;
          break ;
        }
      }
      System . out . println ( p == 1 ? "No" : "Yes" ) ;
    }
    