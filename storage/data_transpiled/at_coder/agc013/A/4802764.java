public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int count = 1 ;
  Boolean increasing = null ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( increasing == null ) {
      if ( a [ i ] - a [ i + 1 ] > 0 ) increasing = true ;
      else if ( a [ i ] - a [ i + 1 ] < 0 ) increasing = false ;
    }
    else if ( increasing ) {
      if ( a [ i ] - a [ i + 1 ] < 0 ) increasing = null ;
      count ++ ;
    }
    else if ( increasing ) {
      if ( a [ i ] - a [ i + 1 ] > 0 ) increasing = null ;
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
