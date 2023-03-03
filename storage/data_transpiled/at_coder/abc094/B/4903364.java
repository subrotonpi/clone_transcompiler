public static int N ( ) {
  int M = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) A [ i ] = Integer . parseInt ( input ( ) ) ;
  int n_1 = sum ( X > A [ 0 ] ) ;
  int n_2 = sum ( ( N - A [ 0 ] ) * ( X - A [ 1 ] ) < 0 ) ;
  int ans = min ( n_1 , n_2 ) ;
  return ans ;
}
