static void testCase ( ) {
  int H = Integer . parseInt ( readLine ( ) ) ;
  int N = Integer . parseInt ( readLine ( ) ) ;
  int M = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] C = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) C [ i ] [ 0 ] = Integer . parseInt ( readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) F [ i ] [ 0 ] = Integer . parseInt ( readLine ( ) ) ;
  assert Arrays . equals ( C [ i ] [ 0 ] , M ) ;
  int [ ] [ ] F = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) F [ i ] [ 0 ] = Integer . parseInt ( readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) F [ i ] [ 0 ] = Integer . parseInt ( readLine ( ) ) ;
  assert Arrays . equals ( F [ i ] [ 0 ] , M ) ;
  int [ ] [ ] cost = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) cost [ i ] [ N ] = 1000000000 ;
  {
    int waterLevel = Math . max ( 1 , t <= 0 ? H : H - t ) ;
    int c1 = C [ y ] [ x ] ;
    int f1 = F [ y ] [ x ] ;
    int c2 = C [ ty ] [ tx ] ;
    int f2 = F [ ty ] [ tx ] ;
    if ( f2 + 50 > c2 ) return ;
    if ( f1 + 50 > c2 ) return ;
    if ( f2 + 50 > c1 ) return ;
    if ( waterLevel + 50 > c2 ) {
      int tt = waterLevel + 50 - c2 + Math . max ( 0 , t ) ;
      int waterLevel2 = Math . max ( 1 , H - tt ) ;
      if ( tt < cost [ ty ] [ tx ] ) {
        cost [ ty ] [ tx ] = tt ;
        schedule . add ( new Integer ( tt ) ) ;
      }
    }
  }
  ArrayList < Integer > schedule = new ArrayList < Integer > ( ) ;
  schedule . add ( new Integer ( - 10000000 ) ) ;
  schedule . add ( new Integer ( 0 ) ) ;
  while ( schedule . size ( ) > 0 ) {
    Collections . sort ( schedule , Integer . valueOf ( 0 ) ) ;
    