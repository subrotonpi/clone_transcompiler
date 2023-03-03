static int N ( int N , int a ) {
  a -- ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b [ i ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) t [ i ] = - 1 ;
  int nowt = 0 ;
  while ( t [ a ] == - 1 ) {
    t [ a ] = nowt ;
    a = b [ a ] ;
    nowt ++ ;
  }
  int loop = Math . max ( t . length - t [ a ] + 1 , t [ a ] ) ;
  if ( k <= Math . max ( t . length , k ) ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( t [ i ] == k ) {
        System . out . println ( i + 1 ) ;
        break ;
      }
    }
  }
  else {
    int base = t [ a ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) t [ i ] -= base ;
    k -= base ;
    k %= loop ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( t [ i ] == k ) {
        System . out . println ( i + 1 ) ;
        break ;
      }
    }
  }
  return N ;
}
