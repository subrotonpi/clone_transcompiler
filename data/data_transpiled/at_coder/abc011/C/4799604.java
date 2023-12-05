public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int n1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int n2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int n3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dp = new int [ 301 ] ;
  for ( int i = 0 ;
  i < 301 ;
  i ++ ) {
    dp [ i ] = 10 * 18 ;
  }
  dp [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < 301 ;
  i ++ ) {
    if ( i == 1 ) {
      dp [ i ] = dp [ 0 ] + 1 ;
    }
    else if ( i == 2 ) {
      dp [ i ] = Math . min ( dp [ i - 1 ] + 1 , dp [ i - 2 ] + 1 ) ;
    }
    dp [ i ] = Math . min ( dp [ i - 1 ] + 1 , dp [ i - 2 ] + 1 , dp [ i - 3 ] + 1 ) ;
    if ( i == n1 || i == n2 || i == n3 ) {
      dp [ i ] = 10 * 18 ;
    }
  }
  if ( dp [ n ] > 100 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  return dp ;
}
