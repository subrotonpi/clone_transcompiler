public static List < Integer > convert ( String input ) {
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( String s : input . split ( " " ) ) {
    a . add ( Integer . parseInt ( s ) ) ;
  }
  int sum = 0 ;
  sum += a . stream ( ) . mapToInt ( Integer :: parseInt ) . sum ( ) + a . stream ( ) . mapToInt ( Integer :: parseInt ) . sum ( ) + a . stream ( ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  if ( sum == 3 ) {
    System . out . println ( 3 ) ;
  }
  else if ( sum == 5 ) {
    System . out . println ( 2 ) ;
  }
  else {
    System . out . println ( 1 ) ;
  }
  return a ;
}
