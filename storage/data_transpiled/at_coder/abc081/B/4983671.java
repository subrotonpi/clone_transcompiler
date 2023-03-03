public static void print ( int num ) {
  int [ ] board = new int [ num ] ;
  for ( int i = 0 ;
  i < num ;
  i ++ ) {
    board [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int evener = 0 ;
  boolean ope = true ;
  do {
    for ( int i = 0 ;
    i < num ;
    i ++ ) {
      if ( board [ i ] % 2 == 0 ) {
        board [ i ] = board [ i ] / 2 ;
      }
      else {
        ope = false ;
        break ;
      }
    }
  }
  while ( ope ) ;
}
