@ GwtIncompatible ( "java.lang.String" ) public static String [ ] [ ] generateExamples ( ) throws IOException {
  int n = 32 ;
  int j = 500 ;
  ArrayList < String [ ] > arr = new ArrayList < String [ ] > ( ) ;
  File f = new File ( "out.txt" ) ;
  /* find the divisor of the number of digits */
  int res = 2 ;
  while ( f . length ( ) % res != 0 && res < 100 ) {
    res ++ ;
  }
  for ( int i : xrange ( 2 * ( n - 2 ) ) ) {
    String t = Integer . toBinaryString ( i ) ;
    t = "0" + t ;
    t = "1" + t + "1" ;
    boolean ok = true ;
    for ( int base : xrange ( 2 , 11 ) ) {
      if ( isprime ( Integer . parseInt ( t , base ) ) || findDivisor ( Integer . parseInt ( t , base ) ) == 100 ) {
        ok = false ;
        break ;
      }
    }
    if ( ok ) {
      String [ ] str = new String [ j ] ;
      str [ 0 ] = t ;
      for ( int base : xrange ( 2 , 11 ) ) {
        int num = Integer . parseInt ( t , base ) ;
        str [ base ] = Integer . toString ( findDivisor ( num ) ) ;
      }
      arr . add ( str ) ;
      if ( arr . size ( ) == j ) break ;
    }
  }
  System . out . println ( f . getAbsolutePath ( ) , "Case #1:" ) ;
  for ( String [ ] l : arr ) {
    System . out . println ( f . getAbsolutePath ( ) , l ) ;
  }
  return arr . toArray ( new String [ arr . size ( ) ] [ j ] ) ;
}
