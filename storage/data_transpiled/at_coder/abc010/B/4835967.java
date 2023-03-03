public static void n ( ) {
  int [ ] flowers = new int [ input . nextInt ( ) ] ;
  for ( int i = 0 ;
  i < flowers . length ;
  i ++ ) {
    flowers [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int petals = 0 ;
  for ( int i = 0 ;
  i < flowers . length ;
  i ++ ) {
    switch ( flowers [ i ] ) {
      case 6 : petals += 3 ;
      break ;
      case 5 : petals += 2 ;
      break ;
      case 8 : petals += 4 ;
      break ;
      case 4 : petals += 2 ;
      break ;
    }
  }
  System . out . println ( petals ) ;
}
