public static int solveCase ( int caseNum ) {
  int M = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  int F = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  int N = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  ArrayList < Integer > tempFoods = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < xrange ( N ) ;
  i ++ ) {
    int p = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int s = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    tempFoods . add ( new Integer ( s ) ) ;
  }
  Collections . sort ( tempFoods ) ;
  ArrayList < Integer > foods = new ArrayList < Integer > ( ) ;
  for ( int s = 0 ;
  s < tempFoods . size ( ) ;
  s ++ ) {
    int p = tempFoods . get ( s ) ;
    if ( foods . size ( ) > 0 && s + 1 == foods . get ( foods . size ( ) - 1 ) . intValue ( ) ) continue ;
    while ( foods . size ( ) > 0 && foods . get ( foods . size ( ) - 1 ) . intValue ( ) >= p ) foods . clear ( ) ;
    foods . add ( new Integer ( s + 1 ) ) ;
  }
  for ( int i = xrange ( foods . size ( ) - 1 ) ;
  i < xrange ( foods . size ( ) ) ;
  i ++ ) {
    int s = foods . get ( i ) . intValue ( ) ;
    int p = foods . get ( i ) . intValue ( ) ;
    assert s < foods . get ( i + 1 ) . intValue ( ) && p < foods . get ( i + 1 ) . intValue ( ) ;
  }
  int [ ] cumCost = new int [ foods . size ( ) ] ;
  cumCost [ 0 ] = F ;
  for ( int i = xrange ( foods . size ( ) ) ;
  i < xrange ( foods . size ( ) ) ;
  i ++ ) {
    int numDays = foods . get ( i ) . intValue ( ) - ( foods . get ( i - 1 ) . intValue ( ) > 0 ? 1 : 0 ) ;
    cumCost [ i ] = cumCost [ i ] + numDays * foods . get ( i ) . intValue ( ) ;
  }
  / * assert ▁ 0 ▁