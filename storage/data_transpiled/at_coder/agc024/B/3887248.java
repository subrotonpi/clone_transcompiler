public static int max ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] p_m = new int [ n ] ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    p_m [ p [ i ] - 1 ] = p [ i ] ;
  }
  int res = - 10 * 9 ;
  int cnt = 0 ;
  int prev = - 1 ;
  for ( int i = 0 ;
  i < p_m . length ;
  i ++ ) {
    if ( prev <= p_m [ i ] ) {
      cnt ++ ;
      prev = p_m [ i ] ;
    }
    else {
      res = Math . max ( res , cnt ) ;
      cnt = 1 ;
      prev = p_m [ i ] ;
    }
  }
  System . out . println ( n - res ) ;
  return res ;
}
