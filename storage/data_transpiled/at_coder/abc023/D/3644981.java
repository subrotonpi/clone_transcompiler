public static void check ( List < Point > balloons , int n ) {
  int [ ] latests = new int [ balloons . size ( ) ] ;
  for ( int i = 0 ;
  i < latests . length ;
  i ++ ) {
    latests [ i ] = ( n - balloons . get ( i ) . x ) / balloons . get ( i ) . y ;
  }
  for ( int i = 0 ;
  i < latests . length ;
  i ++ ) {
    int latest = latests [ i ] ;
    if ( latests [ i ] > latest ) {
      return ;
    }
  }
  /* main program */
  int N = Integer . parseInt ( input ( ) ) ;
  balloons = new ArrayList < Point > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    balloons . add ( new Point ( Integer . parseInt ( input ( ) ) ) ) ;
  }
  int left = 0 ;
  int right = ( int ) 1e15 ;
  while ( left < right ) {
    int center = ( left + right ) / 2 ;
    if ( check ( balloons , center ) ) {
      right = center ;
    }
    else {
      left = center + 1 ;
    }
  }
  System . out . println ( left ) ;
}
