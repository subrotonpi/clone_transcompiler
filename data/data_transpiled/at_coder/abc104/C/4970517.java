public static int D = Integer . parseInt ( input ) {
  int G = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] P = new int [ D ] ;
  int [ ] C = new int [ D ] ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    P [ i ] = p ;
    C [ i ] = c ;
  }
  long ans = 10 * 100 ;
  for ( int i = 0 ;
  i < 2 * D ;
  i ++ ) {
    long rest = G ;
    int cnt = 0 ;
    int maxdgt = - 1 ;
    for ( int j = 0 ;
    j < D ;
    j ++ ) {
      if ( ( i & 1 << j ) != 0 ) {
        rest -= P [ j ] * ( j + 1 ) * 100 + C [ j ] ;
        cnt += P [ j ] ;
      }
      else {
        maxdgt = j ;
      }
    }
    if ( rest <= 0 ) {
      ans = Math . min ( ans , cnt ) ;
    }
    else if ( rest > ( P [ maxdgt ] - 1 ) * ( maxdgt + 1 ) * 100 ) continue ;
    else {
      ans = Math . min ( ans , cnt + ( rest / 100 - 1 ) / ( maxdgt + 1 ) + 1 ) ;
    }
  }
  System . out . println ( ( int ) ans ) ;
  return 0 ;
}
