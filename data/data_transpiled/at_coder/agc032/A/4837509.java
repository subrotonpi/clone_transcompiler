public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] b = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] ans = new int [ N ] ;
  while ( b . length > 0 ) {
    int r = - 1 ;
    for ( int i = 0 ;
    i < b . length ;
    i ++ ) {
      if ( b [ i ] == i + 1 ) {
        r = i ;
      }
    }
    if ( r == - 1 ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
    ans [ N - i - 1 ] = r + 1 ;
    b = Arrays . copyOf ( b , b . length + 1 ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( ans [ ans . length - i - 1 ] ) ;
  }
  return ans ;
}
