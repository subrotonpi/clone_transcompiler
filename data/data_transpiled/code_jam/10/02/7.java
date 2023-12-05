static final String nextLine ( ) {
  return System . console ( ) . readLine ( ) . substring ( 0 , System . console ( ) . length ( ) - 1 ) ;
  /* read nlines */
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( readLine ( ) ) ;
  }
  /* gcd */
  if ( a >= b ) {
    int m = a % b ;
    if ( m == 0 ) {
      return b ;
    }
    else {
      return gcd ( b , m ) ;
    }
  }
  /* truc */
  long x0 = 0 ;
  long x = 0 ;
  for ( int curcase = 1 ;
  curcase <= Integer . MAX_VALUE ;
  curcase ++ ) {
    l = CollectionUtils . parseInt ( readLine ( ) . split ( " " ) ) ;
    n = l . get ( 0 ) ;
    l = l . subList ( 1 , l . size ( ) ) ;
    x0 = l . get ( 0 ) ;
    long [ ] diff = CollectionUtils . toLongArray ( l . subList ( 1 , l . size ( ) ) ) ;
    long cur = diff [ 0 ] ;
    for ( int i = 1 ;
    i < diff . length ;
    i ++ ) {
      if ( cur == 0 ) {
        cur = diff [ i ] ;
      }
      if ( diff [ i ] != 0 ) {
        cur = gcd ( cur , diff [ i ] ) ;
      }
    }
    long todo = x0 % cur ;
    if ( todo == 0 ) {
      System . out . println ( "Case #" + curcase + ": " + 0 ) ;
    }
    else {
      System . out . println ( "Case #" + curcase + ": " + ( cur - todo ) ) ;
    }
  }
  return null ;
}
