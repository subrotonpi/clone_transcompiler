public static void print ( String n ) {
  n = input . nextLine ( ) ;
  if ( n . length ( ) > 1 && n . substring ( 1 ) . equals ( "9" ) ) {
    System . out . println ( Integer . parseInt ( n . substring ( 0 , 1 ) ) + 9 * ( n . length ( ) - 1 ) ) ;
  }
  else {
    System . out . println ( Integer . parseInt ( n . substring ( 0 , 1 ) ) + 9 * ( n . length ( ) - 1 ) - 1 ) ;
  }
}
