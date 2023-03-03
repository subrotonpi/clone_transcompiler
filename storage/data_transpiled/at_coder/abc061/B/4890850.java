public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > numbers = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    numbers . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  numbers = numbers . stream ( ) . flatMap ( inner -> inner . stream ( ) ) . collect ( Collectors . toList ( ) ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    System . out . println ( numbers . stream ( ) . collect ( Collectors . joining ( "" ) ) ) ;
  }
  return N ;
}
