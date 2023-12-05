public static void main ( String input ) {
  int X = Integer . parseInt ( input ) ;
  int Y = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int ans ;
  if ( K <= Y ) {
    ans = X + K ;
  }
  else {
    ans = X - ( K - Y ) + Y ;
  }
  System . out . println ( ans ) ;
}
