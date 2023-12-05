public static int getInt ( ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 1 ;
  do {
    X *= 2 ;
    if ( X > Y ) break ;
    ans ++ ;
  }
  while ( true ) ;
  return ans ;
}
