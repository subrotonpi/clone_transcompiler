public static void n ( Scanner input ) {
  int [ ] a = map . get ( input . nextLine ( ) . split ( " " ) ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    switch ( a [ i ] % 6 ) {
      case 0 : count += 3 ;
      break ;
      case 1 : count += 2 ;
      break ;
      case 2 : count += 1 ;
      break ;
    }
  }
  System . out . println ( count ) ;
}
