public static void input ( Scanner input ) {
  int l = input . nextInt ( ) ;
  if ( l % 2 == 0 ) {
    int count = l / 2 ;
    char a = input . next ( ) ;
    for ( int i = 0 ;
    i < l / 2 ;
    i ++ ) {
      if ( input . next ( ) == a && input . next ( ) == a ) {
        count ++ ;
      }
      else {
        break ;
      }
    }
    System . out . println ( count ) ;
  }
  else {
    int count = l / 2 + 1 ;
    char a = input . next ( ) ;
    for ( int i = 0 ;
    i < l / 2 ;
    i ++ ) {
      if ( input . next ( ) == a && input . next ( ) == a ) {
        count ++ ;
      }
      else {
        break ;
      }
    }
    System . out . println ( count ) ;
  }
}
