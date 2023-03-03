private static boolean solve ( int [ ] [ ] lawn ) {
  int n = lawn . length ;
  int m = lawn [ 0 ] . length ;
  int [ ] rowmax = new int [ n ] ;
  int [ ] colmax = new int [ n ] ;
  for ( int r = 0 ;
  r < n ;
  r ++ ) rowmax [ r ] = Math . max ( lawn [ r ] [ 0 ] , rowmax [ r ] ) ;
  for ( int c = 0 ;
  c < m ;
  c ++ ) colmax [ c ] = Math . max ( lawn [ r ] [ c ] , colmax [ c ] ) ;
  for ( int r = 0 ;
  r < n ;
  r ++ ) for ( int c = 0 ;
  c < m ;
  c ++ ) {
    int h = lawn [ r ] [ c ] ;
    if ( h != rowmax [ r ] && h != colmax [ c ] ) return false ;
  }
  return true ;
  int casesCount = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 0 ;
  t < casesCount ;
  t ++ ) {
    lawn = new int [ n ] ;
    n = Integer . parseInt ( readLine ( ) ) ;
    m = Integer . parseInt ( readLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) lawn [ i ] = new int [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) lawn [ i ] [ i ] = Integer . parseInt ( readLine ( ) ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ( solve ( lawn ) ? "YES" : "NO" ) ) ;
  }
  return false ;
}
