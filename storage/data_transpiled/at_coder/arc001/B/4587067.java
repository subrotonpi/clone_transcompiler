public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Math . abs ( a - b ) ;
  int ans = 0 ;
  if ( x > 7 ) {
    ans += 1 + ( ( x - 8 ) / 10 ) ;
    x = Math . abs ( x - ans * 10 ) ;
  }
  if ( x < 3 ) {
    ans += 1 ;
  }
  return ans ;
}
