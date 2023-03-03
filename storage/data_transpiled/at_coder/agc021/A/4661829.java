public static void print ( String n ) {
  if ( ( Arrays . binarySearch ( n , '9' ) >= 0 ) && ( Arrays . binarySearch ( n , '9' ) >= 0 ) ) {
    System . out . println ( Integer . parseInt ( n . substring ( 0 , 1 ) ) + 9 * ( n . length ( ) - 1 ) ) ;
  }
  else {
    System . out . println ( Integer . parseInt ( n . substring ( 0 , 1 ) ) - 1 + 9 * ( n . length ( ) - 1 ) ) ;
  }
}
