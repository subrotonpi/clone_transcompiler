static void n ( Scanner input , int m ) {
  int [ ] A = input . next ( ) . split ( " " ) ;
  int [ ] D0 = new int [ 2 * m + 10 ] ;
  int [ ] D1 = new int [ 2 * m + 10 ] ;
  int ans = 0 ;
  int pa = A [ 0 ] - 1 ;
  for ( int a = 1 ;
  a < A . length ;
  a ++ ) {
    a -- ;
    if ( a < pa ) a += m ;
    ans += a - pa ;
    D1 [ pa + 1 ] ++ ;
    D1 [ a ] -= a - pa ;
    D1 [ a + 1 ] += a - pa - 1 ;
    pa = a % m ;
  }
  for ( int i = 0 ;
  i < D1 . length ;
  i ++ ) {
    D0 [ i ] = D1 [ i ] + D0 [ i - 1 ] ;
  }
  int [ ] L = new int [ 2 * m + 10 ] ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    L [ i ] = D0 [ i ] + L [ i - 1 ] ;
  }
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    L [ i % m ] += L [ i ] ;
  }
  System . out . println ( ans - max ( L , 0 , m ) ) ;
}
