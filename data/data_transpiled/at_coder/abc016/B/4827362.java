public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int p = a + b ;
  int m = a - b ;
  if ( ( ( p == c ) ? ( m != c ) : p != c ) ) {
    System . out . println ( "+" ) ;
  }
  else if ( ( ( p != c ) ? ( m == c ) : m != c ) ) {
    System . out . println ( "-" ) ;
  }
  else if ( ( ( p == c ) ? ( m == c ) : m == c ) ) {
    System . out . println ( '?' ) ;
  }
  else {
    System . out . println ( "!" ) ;
  }
  return p ;
}
