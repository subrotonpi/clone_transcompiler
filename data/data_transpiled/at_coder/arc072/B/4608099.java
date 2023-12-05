public static void main ( String [ ] args ) {
  X = Integer . parseInt ( input . nextLine ( ) ) ;
  Y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( X == Y || Math . abs ( X - Y ) == 1 ) {
    System . out . println ( "Brown" ) ;
  }
  else {
    System . out . println ( "Alice" ) ;
  }
}
