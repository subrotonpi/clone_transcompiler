public static void enter ( ) {
  int a = input . nextInt ( ) ;
  int b = input . nextInt ( ) ;
  if ( a > b ) {
    System . out . println ( "GREATER" ) ;
    exit ( ) ;
  }
  else if ( a < b ) {
    System . out . println ( "LESS" ) ;
    exit ( ) ;
  }
  else {
    for ( int i = 0 ;
    i < a ;
    i ++ ) {
      if ( a > b ) {
        System . out . println ( "GREATER" ) ;
        exit ( ) ;
      }
      else if ( a < b ) {
        System . out . println ( "LESS" ) ;
        exit ( ) ;
      }
    }
  }
}
