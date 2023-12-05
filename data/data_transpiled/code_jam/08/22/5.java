static final int [ ] getArgs ( ) {
  psyco . profile ( ) ;
  DEBUG = false ;
  int [ ] [ ] buckets = new int [ 10 ] [ 10 ] ;
  int tot = 0 ;
  for ( int [ ] bucket : buckets ) {
    if ( bucket . length > 0 ) tot ++ ;
  }
  if ( __name__ == "__main__" ) {
    final String [ ] parts = new String [ 10 ] ;
    for ( int i : xrange ( parts . length ) ) {
      got [ i ] = types [ i ] . run ( parts [ i ] ) ;
    }
    return buckets ;
  }
  int [ ] [ ] ints = new int [ 10 ] [ 10 ] ;
  for ( int i : xrange ( ints . length ) ) {
    ints [ i ] = ints [ i ] ;
    assert ints . length == 1 ;
  }
  int [ ] out = new int [ 10 ] ;
  if ( out == null && out . length > 0 && out [ 0 ] . endsWith ( ".in" ) ) out [ 0 ] = out [ 0 ] . substring ( 0 , out [ 0 ] . length ( ) - 3 ) + ".out" ;
  if ( out == null ) out = System . out ;
  else {
    out = new PrintStream ( out ) ;
    if ( out [ 0 ] == null ) {
      System . out . println ( "Output file is null" ) ;
    }
    int ncases = ints [ 0 ] ;
    for ( int i : xrange ( ncases ) ) {
      int A = ints [ i ] ;
      int B = ints [ i ] ;
      int P = ints [ i ] ;
      int answer = runCase ( A , B , P ) ;
      System . out . println ( >>> outfile + "Case #" + ( i + 1 ) + ": " + answer ) ;
    }
  }
  boolean [ ] isprime = new boolean [ 10000001 ] ;
  isprime [ 0 ] = false ;
  isprime [ 1 ] = false ;
  for ( int i : xrange ( 10000001 ) ) {
    if ( isprime [ i ] ) for ( int j : xrange ( i , 10000001 , i ) ) isprime [ j ] = false ;
    isprime [ i ] = true ;
  }
  return isprime ;
}
