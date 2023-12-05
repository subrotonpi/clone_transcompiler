static final int [ ] read ( int [ ] a ) {
  final int [ ] mem = new int [ a . length ] ;
  psyco . full ( ) ;
  {
    dbg ( a ) ;
  }
  {
    int [ ] a = new int [ a . length ] ;
    int [ ] a = new int [ a . length ] ;
    int i ;
    int j ;
    int m ;
    int [ ] a = new int [ a . length ] ;
    for ( i = 0 ;
    i < a . length ;
    i ++ ) a [ i ] = a [ i ] ;
    int res ;
    int p = a . length ;
    int last = a . length ;
    if ( mem [ p ] >= 0 ) return mem [ p ] ;
    if ( p == N ) return 0 ;
    res = doit ( p + 1 , last ) + D ;
    for ( i : xrange ( 256 ) ) {
      if ( last == - 1 ) {
        res = Math . min ( res , doit ( p + 1 , i ) + Math . abs ( a [ p ] - i ) ) ;
        continue ;
      }
      int diff = Math . abs ( last - i ) ;
      if ( M == 0 && diff > 0 ) continue ;
      int insertcost = ( diff > 0 && I > 0 ) ? ( ( diff - 1 ) / M ) * I : 0 ;
      int editcost = Math . abs ( a [ p ] - i ) ;
      res = Math . min ( res , doit ( p + 1 , i ) + editcost + insertcost ) ;
    }
    mem [ p ] = res ;
    return mem ;
  }
  private void runTest ( int test ) {
    int D ;
    int I ;
    int M ;
    int N ;
    int a [ ] = new int [ a . length ] ;
    mem [ p ] = new int [ a . length ] ;
    int res = doit ( 0 , - 1 ) ;
    System . out . println ( "Case #" + ( test + 1 ) + ": " + res ) ;
  }
  for ( test = 0 ;
  test < readint ( ) ;
  test ++ ) {
    dbg ( "Test " + ( test + 1 ) + "\n" ) ;
    runTest ( test ) ;
  }
}
