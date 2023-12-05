public static void main ( String input ) {
  int w = Integer . parseInt ( input ) ;
  int h = Integer . parseInt ( input ) ;
  long ans = 1 ;
  long mod = 10 * * 9 + 7 ;
  for ( int i = 0 ;
  i < w - 1 ;
  i ++ ) {
    ans = ans * ( i + h ) % mod * Math . pow ( i + 1 , mod - 2 , mod ) % mod ;
  }
  System . out . println ( ans ) ;
}
