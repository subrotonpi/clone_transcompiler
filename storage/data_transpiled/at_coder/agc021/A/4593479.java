public static void input ( Scanner scanner ) {
  boolean flag = true ;
  if ( scanner . hasNextInt ( ) ) {
    int i ;
    for ( i = 1 ;
    i < scanner . nextInt ( ) ;
    i ++ ) {
      if ( scanner . nextInt ( ) != '9' ) {
        flag = false ;
        break ;
      }
    }
    if ( ! flag ) {
      System . out . println ( 9 * ( scanner . nextInt ( ) - 1 ) ) ;
    }
    else {
      System . out . println ( 1 + 9 * ( scanner . nextInt ( ) - 1 ) ) ;
    }
  }
  else {
    for ( i = 1 ;
    i < scanner . nextInt ( ) ;
    i ++ ) {
      if ( scanner . nextInt ( ) != '9' ) {
        flag = false ;
        break ;
      }
    }
    if ( ! flag ) {
      System . out . println ( 9 * ( scanner . nextInt ( ) - 1 ) + Integer . parseInt ( scanner . nextInt ( ) ) - 1 ) ;
    }
    else {
      System . out . println ( 9 * ( scanner . nextInt ( ) - 1 ) + Integer . parseInt ( scanner . nextInt ( ) ) ) ;
    }
  }
}
