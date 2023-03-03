@ MoreIO public static int input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  final int INF = 10 * 15 ;
  Map < Integer , Integer > Q = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    Q . put ( P [ i ] , i ) ;
  }
  int ans = ( ( acc , j ) -> ( j > N || Q . get ( j - 1 ) < Q . get ( j ) ? j - 1 : 0 ) ) . intValue ( ) ;
  return N >= 2 ? ans : 0 ;
}
