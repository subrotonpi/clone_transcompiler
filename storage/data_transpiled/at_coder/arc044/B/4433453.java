static final Scanner getScanner ( ) {
  final Scanner in = new Scanner ( System . in ) ;
  final int n = in . nextInt ( ) ;
  final int [ ] a = list ( in ) ;
  if ( a [ 0 ] != 0 || a . length > 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  Arrays . sort ( a ) ;
  final List < List < Integer >> g = gb ( a ) ;
  final List < Integer > l = new ArrayList < Integer > ( ) ;
  final List < Integer > cnt = new ArrayList < Integer > ( ) ;
  for ( final List < Integer > e : g ) {
    l . add ( e . get ( 0 ) ) ;
    final int ln = Collections . binarySearch ( e , l ) ;
    cnt . add ( ln ) ;
  }
  if ( l . size ( ) != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  long res = 1 ;
  final int MOD = 10 * 9 + 7 ;
  for ( int i = 1 ;
  i < cnt . size ( ) ;
  i ++ ) {
    res *= Math . pow ( ( Math . pow ( 2 , cnt . get ( i - 1 ) , MOD ) - 1 ) % MOD , cnt . get ( i ) , MOD ) ;
    res *= Math . pow ( 2 , cnt . get ( i ) * ( cnt . get ( i ) - 1 ) / 2 , MOD ) ;
    res %= MOD ;
  }
  System . out . println ( res ) ;
  return in ;
}
