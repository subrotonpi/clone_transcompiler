public static int find ( int [ ] [ ] A , int x ) {
  int p = A [ x ] ;
  if ( p == x ) return x ;
  int a = find ( A , p ) ;
  A [ x ] = a ;
  return a ;
}
/*union(A,x,y);*/
int bx , by ;
int N = Integer . parseInt ( input ( ) ) ;
int Q = Integer . parseInt ( input ( ) ) ;
int [ ] V = new int [ 2 * N ] ;
for ( int i = 0 ;
i < Q ;
i ++ ) {
  V [ i ] = i ;
}
for ( int i = 0 ;
i < N ;
i ++ ) {
  int w = Integer . parseInt ( input ( ) ) ;
  int x = x - 1 , y = y - 1 ;
  if ( w == 1 ) {
    if ( z % 2 == 0 ) {
      union ( V , x , y ) ;
      union ( V , x + N , y + N ) ;
    }
    else {
      union ( V , x , y + N ) ;
      union ( V , y , x + N ) ;
    }
  }
  else {
    if ( find ( V , x ) == find ( V , y ) ) System . out . println ( "YES" ) ;
    else System . out . println ( "NO" ) ;
  }
}
