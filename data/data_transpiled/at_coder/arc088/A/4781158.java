public static int getInt ( ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) , Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 1 ;
  do {
    X *= 2 ;
    if ( X <= Y ) {
      ans ++ ;
    }
    else {
      break ;
    }
  }
  while ( true ) ;
  return ans ;
}
