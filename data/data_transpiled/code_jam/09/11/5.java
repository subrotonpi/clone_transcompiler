public static long xform ( long n , long b ) {
  long s = 0 ;
  while ( n != 0 ) {
    s += ( n % b ) * ( n % b ) ;
    n /= b ;
  }
  return s ;
  /* happy */
  Set < Long > pres = new HashSet < Long > ( ) ;
  while ( ! pres . contains ( n ) ) {
    pres . add ( n ) ;
    n = xform ( n , b ) ;
  }
  /* assume n is 1 */
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i : xrange ( T ) ) {
    long [ ] bs = map ( Integer . parseInt ( System . console ( ) . readLine ( ) ) ) ;
    int j = 1 ;
    boolean good = false ;
    while ( ! good ) {
      j ++ ;
      good = true ;
      for ( long b : bs ) {
        if ( ! happy ( j , b ) ) {
          good = false ;
          break ;
        }
      }
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + j ) ;
  }
  return s ;
}
