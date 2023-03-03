public static int w ( int a , int b ) {
  int ans ;
  ans = 0 ;
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a < b ) {
    if ( ( ( a <= b ) & ( b <= a + w ) ) ) ans = 0 ;
    else ans = Math . abs ( b - a - w ) ;
  }
  return ans ;
}
