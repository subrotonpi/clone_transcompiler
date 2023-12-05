public static int [ ] a ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = - 1 ;
  int ai = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ai = a [ ai ] - 1 ;
    if ( ai == 1 ) {
      ans = i + 1 ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return a ;
}
