public static int [ ] readIntArrayFromFile ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] a = new int [ M ] ;
  int [ ] b = new int [ M ] ;
  int [ ] ans = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
    b [ i ] = Integer . parseInt ( input ) ;
    ans [ a [ i ] - 1 ] ++ ;
    ans [ b [ i ] - 1 ] ++ ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ans ;
}
