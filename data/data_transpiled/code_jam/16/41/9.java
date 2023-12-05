private static boolean invalid ( int n , int r , int p , int s ) {
  int N = 1 << n ;
  if ( max ( r , p , s ) > ( N + 2 ) / 3 ) return true ;
  if ( min ( r , p , s ) < N / 3 ) return true ;
  return false ;
}
