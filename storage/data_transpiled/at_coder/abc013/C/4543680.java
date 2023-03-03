public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int H = Integer . parseInt ( input ) ;
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  int E = Integer . parseInt ( input ) ;
  int X_max = ( N * E - H ) / ( B + E ) + 1 ;
  do {
    if ( X_max < 0 ) X_max ++ ;
    else break ;
  }
  while ( X_max < 0 ) ;
  int cost_min = X_max * A ;
  for ( int i = 0 ;
  i < X_max ;
  i ++ ) {
    int Y = ( N * E - H - ( B + E ) * ( X_max - i ) ) / ( D + E ) + 1 ;
    if ( Y >= 0 ) {
      int cost = ( X_max - i ) * A + Y * C ;
      if ( cost < cost_min ) cost_min = cost ;
    }
  }
  System . out . println ( cost_min ) ;
}
