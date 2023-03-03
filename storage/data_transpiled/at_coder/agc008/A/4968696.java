public static int getInt ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) , y = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( x == y ) {
    ans = 0 ;
  }
  else if ( x * y == 0 ) {
    ans = Math . abs ( x ) + Math . abs ( y ) + 1 ;
  }
  return ans ;
}
