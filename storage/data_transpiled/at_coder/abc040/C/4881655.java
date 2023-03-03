public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] dp = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    switch ( i ) {
      case 0 : dp [ i ] = 0 ;
      break ;
      case 1 : dp [ i ] = dp [ i - 1 ] + Math . abs ( a [ i ] - a [ i - 1 ] ) ;
      break ;
      default : dp [ i ] = Math . min ( dp [ i - 1 ] , dp [ i ] ) ;
    }
  }
  return dp ;
}
