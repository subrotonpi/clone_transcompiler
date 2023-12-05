public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int total = sum ( t ) ;
  int [ ] ans = new int [ 2 * n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] ln = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) != 0 ) ln [ n - j - 1 ] = 1 ;
    }
    int a = sum ( t [ i ] * ln [ j ] ) ;
    ans [ i ] = max ( total - a , a ) ;
  }
  System . out . println ( min ( ans ) ) ;
  return ans ;
}
