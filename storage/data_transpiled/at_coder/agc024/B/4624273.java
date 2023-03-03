@ MoreRequires public static int input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  final int INF = 10 * 15 ;
  final Map < Integer , Integer > Q = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i < P . length ;
  i ++ ) {
    Q . put ( P [ i ] , i ) ;
  }
  int ans = Q . get ( 2 ) ;
  return ans ;
}
