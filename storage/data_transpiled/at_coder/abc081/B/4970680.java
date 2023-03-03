public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] list = input . nextLine ( ) . split ( " " ) ;
  int ans = 0 ;
  boolean isDev = true ;
  while ( true ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      list [ i ] = Integer . parseInt ( list [ i ] ) ;
      if ( list [ i ] % 2 == 1 ) {
        isDev = false ;
        break ;
      }
      list [ i ] = Integer . parseInt ( list [ i ] ) / 2 ;
    }
    if ( ! isDev ) {
      break ;
    }
    else {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
