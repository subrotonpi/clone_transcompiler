static final Scanner getScanner ( ) throws IOException {
  System . setIn ( new PipedReader ( ) ) ;
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  String line ;
  ArrayList < String [ ] > data = Arrays . asList ( br . readLine ( ) . split ( " " ) ) ;
  int tn = Integer . parseInt ( data . get ( 0 ) [ 0 ] ) ;
  int ln = 1 ;
  for ( int ti = 0 ;
  ti < tn ;
  ti ++ ) {
    int m = Integer . parseInt ( data . get ( ln ) [ 0 ] ) ;
    int n = Integer . parseInt ( data . get ( ln ) [ 1 ] ) ;
    String [ ] s = new String [ n ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) s [ i ] = data . get ( ln + 1 + i ) [ 0 ] ;
    ln += m + 1 ;
  }
  /* Make sure we have a set of duplicates */
  long r1 = 0 ;
  long r2 = 0 ;
  if ( k == m ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) r1 += t [ i ] . size ( ) ;
    return new Scanner ( new HashSet < Set < String >> ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Set < String > tiorig = new HashSet < String > ( ) ;
    for ( int j = 0 ;
    j < s [ k ] . length ( ) + 1 ;
    j ++ ) t [ i ] . add ( s [ k ] . substring ( 0 , j ) ) ;
    long r1a = solve ( t , k + 1 ) ;
    long r2a = solve ( t , k + 1 ) ;
    t [ i ] = tiorig ;
    if ( r1a > r1 ) r2 = 0 ;
    if ( r1a >= r1 ) {
      r1 = r1a ;
      r2 = ( r2 + r2a ) % 1000000007 ;
    }
  }
  long r1 = solve ( new HashSet < Set < String >> ( ) , 0 ) ;
  System . out . println ( "Case #" + ( ti + 1 ) + ": " + r1 + " " + r2 ) ;
  br . close ( ) ;
  return new Scanner ( new BufferedReader ( new InputStreamReader ( System . in ) ) ) ;
}
