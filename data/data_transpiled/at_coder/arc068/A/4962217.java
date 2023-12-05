public static int sum ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = n / 11 ;
  int b = n - a * 11 ;
  int ans ;
  if ( ( b == 0 ) && ( a <= 6 ) ) {
    ans = a * 2 ;
  }
  else if ( b <= 6 ) {
    ans = 1 + ( a * 2 ) ;
  }
  else {
    ans = 2 + ( a * 2 ) ;
  }
  return ans ;
}
