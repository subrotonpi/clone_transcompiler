public static int inpl ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = inpl ( ) ;
  int mod = 10 * 9 + 7 ;
  int [ ] fct = new int [ n + 1 ] ;
  int [ ] inv = new int [ n + 1 ] ;
  fct [ 0 ] = 1 ;
  inv [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    fct [ i ] = ( fct [ i - 1 ] * i ) % mod ;
    inv [ i ] = ( Math . pow ( fct [ i ] , mod - 2 , mod ) ) ;
  }
  /* comb n */
  if ( n < 0 || n > n ) {
    return 0 ;
  }
  /* C */
  String [ ] C = new String [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    C [ i ] = "" ;
  }
  for ( int l = 0 ;
  l < A . length ;
  l ++ ) {
    int a = A [ l ] . charAt ( 0 ) ;
    if ( ( C [ a ] . length ( ) > 1 ) && ( C [ a ] . charAt ( 1 ) == 'a' ) ) {
      i = C [ a ] . charAt ( 1 ) ;
      j = l ;
      break ;
    }
    else {
      C [ a ] = l ;
    }
  }
  System . out . println ( n ) ;
  for ( int k = 2 ;
  k <= n ;
  k ++ ) {
    int total = comb ( n + 1 , k ) ;
    int b = comb ( n + i - j , k - 1 ) ;
    int res = ( total - b ) % ( mod ) ;
    System . out . println ( res ) ;
  }
  return n ;
}
