static final Iterable < Integer > inpl ( ) {
  return Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . map ( i -> Integer . parseInt ( i ) ) . collect ( Collectors . toList ( ) ) ;
  int n = inpl ( ) ;
  int m = inpl ( ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  }
  int [ ] tans = new int [ 2 * m ] ;
  int [ ] Mi = new int [ m ] ;
  int Si = 0 ;
  for ( int a0 = 0 , a1 = a . length ;
  a0 < a1 ;
  a0 ++ ) {
    int a1 = a [ a0 ] ;
    if ( a1 < a0 ) a1 += m ;
    tans [ a0 + 2 ] ++ ;
    tans [ a1 + 2 ] -- ;
    Mi [ a1 ] = new int [ a1 + 1 ] ;
  }
  Arrays . sort ( Mi ) ;
  for ( int x = 0 , v = Mi ;
  x < m ;
  x ++ ) {
    tans [ x ] += v ;
  }
  Arrays . sort ( tans ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ans [ i % m ] += v ;
  }
  System . out . println ( Si - max ( ans ) ) ;
  return ans ;
}
