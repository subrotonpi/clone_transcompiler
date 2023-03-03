public static void main ( String input ) {
  int n , a , b ;
  a = Integer . parseInt ( input ) ;
  b = Integer . parseInt ( input ) ;
  int aida = b - a - 1 ;
  if ( aida % 2 == 0 ) {
    System . out . println ( "Borys" ) ;
  }
  else {
    System . out . println ( "Alice" ) ;
  }
}
