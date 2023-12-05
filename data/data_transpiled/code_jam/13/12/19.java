static private int solve ( int [ ] activities , int E , int R ) {
  /* find wastePoints */
  int rec = R ;
  i ++ ;
  while ( a > activities [ i ] ) {
    rec += R ;
    i ++ ;
  }
  /* find the window */
  int window = ( int ) Math . ceil ( ( double ) E / R ) + 1 ;
  int gain = 0 ;
  int e = E ;
  for ( int i = 0 ;
  i < window ;
  i ++ ) {
    int a = activities [ i ] ;
    int m = Math . max ( activities [ i ] , i + window ) ;
    if ( m == a ) {
      gain += a * e ;
      e = 0 ;
    }
    else {
      int wp = findWastePoints ( a , i , e ) ;
      gain += wp * a ;
      e -= wp ;
    }
    e += R ;
    if ( e > E ) e = E ;
  }
  /* find the window */
  int tcases = Integer . parseInt ( readLine ( ) ) ;
  for ( int d : xrange ( 1 , tcases + 1 ) ) {
    E = Integer . parseInt ( readLine ( ) ) ;
    R = Integer . parseInt ( readLine ( ) ) ;
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] activities = readLine ( ) . split ( " " ) ;
    System . out . println ( "Case #" + d + ": " + solve ( activities , E , R ) ) ;
  }
  return gain ;
}
