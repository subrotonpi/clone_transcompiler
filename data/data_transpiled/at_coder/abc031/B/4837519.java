public static int [ ] getDistance ( String input ) {
  int l = Integer . parseInt ( input ) ;
  int h = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] < l ) {
      System . out . println ( ( int ) ( l - a [ i ] ) ) ;
    }
    else if ( a [ i ] <= h ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( Integer . toString ( - 1 ) ) ;
    }
  }
  return a ;
}
