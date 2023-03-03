public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int turn = 1 ;
  do {
    if ( turn == 1 ) {
      if ( n > a ) {
        n -= a ;
        turn *= - 1 ;
      }
      else {
        System . out . println ( "Ant" ) ;
        exit ( ) ;
      }
    }
    else {
      if ( n > b ) {
        n -= b ;
        turn *= - 1 ;
      }
      else {
        System . out . println ( "Bug" ) ;
        exit ( ) ;
      }
    }
  }
  while ( turn > 1 ) ;
  return a ;
}
