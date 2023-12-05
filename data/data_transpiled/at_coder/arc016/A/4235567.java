public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] list = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list [ i ] = i + 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( Integer . parseInt ( list [ i ] ) != M ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
  }
  return M ;
}
