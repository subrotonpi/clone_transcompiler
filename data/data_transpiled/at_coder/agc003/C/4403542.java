public static void print ( int n ) {
  int [ ] [ ] info = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    info [ i ] = new int [ ] {
      Integer . parseInt ( input . nextLine ( ) ) , i }
      ;
    }
    Arrays . sort ( info ) ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( i % 2 != info [ i ] [ 1 ] % 2 ) {
        ans = ans + 1 ;
      }
    }
    System . out . println ( ans / 2 ) ;
  }
  