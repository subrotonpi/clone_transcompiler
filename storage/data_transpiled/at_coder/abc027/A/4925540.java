public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > list = Arrays . asList ( a , b , c ) ;
  for ( int i = 0 ;
  i < list . size ( ) ;
  i ++ ) {
    if ( list . stream ( ) . mapToInt ( Integer :: intValue ) . sum ( ) % 2 == 1 ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  return 0 ;
}
