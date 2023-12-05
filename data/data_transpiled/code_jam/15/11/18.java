private static void readIn ( ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int c = 1 ;
  c <= t ;
  c ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] a = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    new Solution ( c , a ) ;
  }
  {
    int [ ] b = new int [ a . length ] ;
    for ( int i = 1 ;
    i < a . length ;
    i ++ ) {
      b [ i ] = a [ i - 1 ] - a [ i ] ;
    }
    int m1 = Integer . parseInt ( b [ 0 ] ) ;
    int rate = Math . max ( Math . max ( b [ 0 ] , 0 ) , a [ 1 ] ) ;
    int m2 = Integer . parseInt ( Math . min ( b [ 0 ] , rate ) ) ;
    for ( int i = a . length - 1 ;
    i >= 0 ;
    i -- ) {
      m2 = Integer . parseInt ( Math . min ( a [ i ] , rate ) ) ;
    }
  }
  if ( getClass ( ) . equals ( Solution . class ) ) {
    for ( int c = 0 ;
    c < a . length ;
    c ++ ) {
      System . out . println ( "Case #" + c + ": " + solve ( a ) ) ;
    }
  }
}
