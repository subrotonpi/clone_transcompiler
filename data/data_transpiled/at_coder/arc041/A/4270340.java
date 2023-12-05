public static void main ( String input ) {
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int ans = 0 ;
  if ( k <= y ) {
    ans = x + k ;
  }
  else {
    ans = y + ( x - k + y ) ;
  }
  System . out . println ( ans ) ;
}
