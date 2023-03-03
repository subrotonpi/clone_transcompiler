static void Move ( int r , int c , int d , int dig ) {
  c += d ;
  int fall = 0 ;
  while ( M [ r + 1 ] [ c ] == '.' ) {
    d = 0 ;
    fall ++ ;
    if ( fall > F ) return ;
    r ++ ;
    if ( r == R - 1 ) {
      best = dig ;
      return ;
    }
  }
  if ( c > 0 && M [ r ] [ c - 1 ] == '.' ) {
    if ( d <= 0 ) Move ( r , c , - 1 , dig ) ;
    if ( dig + 1 < best && M [ r + 1 ] [ c - 1 ] == '#' ) {
      M [ r + 1 ] [ c - 1 ] = '.' ;
      Move ( r , c , 0 , dig + 1 ) ;
      M [ r + 1 ] [ c - 1 ] = '#' ;
    }
  }
  if ( c + 1 < C && M [ r ] [ c + 1 ] == '.' ) {
    if ( d >= 0 ) Move ( r , c , + 1 , dig ) ;
    if ( dig + 1 < best && M [ r + 1 ] [ c + 1 ] == '#' ) {
      M [ r + 1 ] [ c + 1 ] = '.' ;
      Move ( r , c , 0 , dig + 1 ) ;
      M [ r + 1 ] [ c + 1 ] = '#' ;
    }
  }
  /*Digging*/
  int N = Integer . parseInt ( readLine ( ) ) ;
  M = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) M . add ( new LinkedList < > ( ) ) ;
  int best = Integer . MAX_VALUE ;
  Move ( 0 , 0 , 0 , 0 ) ;
  if ( best < Integer . MAX_VALUE ) System . out . println ( "Yes" + best ) ;
  else System . out . println ( "No" ) ;
  N = Integer . parseInt ( readLine ( ) ) ;
  for ( int testcase = 0 ;
  testcase < N ;
  testcase ++ ) {
    System . out . println ( "Case #" + ( testcase + 1 ) + ":" ) ;
    Digging ( ) ;
  }
}
