public static int N = Integer . parseInt ( input ) {
  int dp = 1 ;
  int asum = 0 ;
  for ( String a : input . split ( "\\s+" ) ) {
    int x = Integer . parseInt ( a ) ;
    asum += x ;
    dp = dp | ( dp << x ) ;
  }
  for ( int i = ( asum + 1 ) / 2 ;
  i <= asum ;
  i ++ ) {
    if ( ( dp >> i ) & 1 != 0 ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  return 0 ;
}
