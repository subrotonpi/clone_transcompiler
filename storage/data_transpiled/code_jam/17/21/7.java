public static String [ ] readStrings ( ) {
  return new Scanner ( System . in ) . nextLine ( ) . trim ( ) . split ( "\\s+" ) ;
  /* read ints */
  int [ ] ints = new int [ 10 ] ;
  for ( String s : readStrings ( ) ) {
    ints [ i ] = Integer . parseInt ( s ) ;
  }
  /* can that d = d / (double)v */
  for ( int i : xrange ( k . length ) ) {
    if ( k [ i ] + t * s [ i ] < t * v ) {
      return false ;
    }
  }
  /* read strings */
  int testCount = ints . length ;
  for ( int test = 0 ;
  test < testCount ;
  test ++ ) {
    int d = ints [ test ] ;
    int n = ints [ test ] ;
    int [ ] k = new int [ n ] ;
    int [ ] s = new int [ n ] ;
    for ( int i : xrange ( n ) ) {
      k [ i ] = ints [ i ] ;
      s [ i ] = ints [ i ] ;
    }
    double l = 0 ;
    double r = 1e15 ;
    for ( int it : xrange ( 100 ) ) {
      double m = ( l + r ) / 2.0 ;
      if ( can ( d , k , s , m ) ) l = m ;
      else r = m ;
    }
    System . out . println ( "Case #" + test + ": " + m ) ;
  }
  return ints ;
}
