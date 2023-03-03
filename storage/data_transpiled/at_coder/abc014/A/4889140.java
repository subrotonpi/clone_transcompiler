public static void print ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int ans ;
  if ( ( a % b ) == 0 ) {
    ans = 0 ;
  }
  else {
    ans = b - ( a % b ) ;
  }
  System . out . println ( ans ) ;
}
