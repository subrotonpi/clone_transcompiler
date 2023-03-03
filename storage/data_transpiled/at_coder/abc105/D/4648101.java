public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] B = new int [ M ] ;
  B [ 0 ] = 0 ;
  int sumV = 0 ;
  for ( int a : A ) {
    sumV += a ;
    sumV %= M ;
    B [ i ] = sumV ;
  }
  Arrays . sort ( B ) ;
  Arrays . sort ( B ) ;
  Arrays . sort ( B ) ;
  B [ 0 ] += "@" ;
  char cur = B [ 0 ] ;
  int cnt = 1 , ans = 0 ;
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) {
    if ( B [ i + 1 ] == '@' ) {
      ans += cnt * ( cnt - 1 ) / 2 ;
      break ;
    }
    if ( cur == B [ i + 1 ] ) {
      cnt ++ ;
    }
    else {
      cur = B [ i + 1 ] ;
      ans += cnt * ( cnt - 1 ) / 2 ;
      cnt = 1 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
