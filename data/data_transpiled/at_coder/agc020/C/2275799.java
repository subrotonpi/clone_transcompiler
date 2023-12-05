public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) a [ i ] = Integer . parseInt ( input ) ;
  long dp = 1 ;
  for ( int i = 0 ;
  i <= a . length ;
  i ++ ) dp = ( dp | ( dp << a [ i ] ) ) ;
  int asum = 0 ;
  for ( int i = 0 ;
  i <= a . length ;
  i ++ ) asum += a [ i ] ;
  for ( int i = ( int ) ( ( asum + 1 ) / 2 ) ;
  i <= asum ;
  i ++ ) {
    if ( ( dp >> i ) & 1 ) {
      System . out . println ( i ) ;
      break ;
    }
  }
}
