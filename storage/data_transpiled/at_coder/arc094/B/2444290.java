static final int q = Integer . parseInt ( input ) {
  int x = 0 ;
  int y = 0 ;
  for ( int j = 0 ;
  j < q ;
  j ++ ) {
    int [ ] AB = new int [ 2 ] ;
    for ( int i = 0 ;
    i < AB . length ;
    i ++ ) AB [ i ] = Integer . parseInt ( input . next ( ) ) ;
    Arrays . sort ( AB ) ;
    double ab = AB [ 0 ] * AB [ 1 ] ;
    for ( int i = ( int ) Math . sqrt ( ab ) ;
    i <= AB [ 1 ] ;
    i ++ ) {
      if ( x * i >= ab ) {
        x = i - 1 ;
        break ;
      }
    }
    if ( x == 0 ) {
      System . out . println ( 0 ) ;
      continue ;
    }
    for ( int i = ( int ) ( ab / x ) ;
    i <= ab ;
    i ++ ) {
      if ( x * i >= ab ) {
        y = i - 1 ;
        break ;
      }
    }
    int cnt1 = 2 * x ;
    int cnts = x == y ? 1 : 0 ;
    int cntdd = x - AB [ 0 ] >= 0 ? 1 : 0 ;
    int cntdu = AB [ 1 ] - y >= 0 && ( AB [ 1 ] + 1 ) * ( x - AB [ 1 ] + y ) >= ab ? 1 : 0 ;
    System . out . println ( cnt1 - cnts - cntdd - cntdu ) ;
  }
  return x ;
}
