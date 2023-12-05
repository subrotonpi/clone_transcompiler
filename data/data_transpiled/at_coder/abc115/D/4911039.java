public static int bisearch ( int N , int X ) {
  if ( N <= 0 ) return 0 ;
  int half = ( 2 * ( N + 2 ) - 3 ) / 2 ;
  if ( half < l ) return 2 * ( n ) + bisearch ( n - 1 , min ( l - 1 - half , half ) ) ;
  return 0 ;
}
