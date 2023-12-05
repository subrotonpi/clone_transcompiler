public static int n ( ) {
  int [ ] A = Integer . parseInt ( input . nextLine ( ) ) ;
  int dp = 1 ;
  for ( int a : A ) dp |= dp << a ;
  for ( int i = ( Integer . SIZE / 2 ) ;
  i <= Integer . SIZE ;
  i ++ ) {
    if ( ( dp >> i ) % 2 == 1 ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  return dp ;
}
