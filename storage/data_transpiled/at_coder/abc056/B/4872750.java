public static int w ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( a + w < b ) {
    ans = b - ( a + w ) ;
  }
  else if ( b + w < a ) {
    ans = a - ( b + w ) ;
  }
  else {
    ans = 0 ;
  }
  return ans ;
}
