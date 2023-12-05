public static int [ ] convert ( String input ) {
  int n = Integer . parseInt ( input ) , t = Integer . parseInt ( input ) ;
  int inf = 10 * 9 ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int c = 0 ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = a [ i ] + inf ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c += Math . min ( b [ i ] - a [ i ] , t ) ;
  }
  System . out . println ( c ) ;
  return b ;
}
