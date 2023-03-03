public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) . trim ( ) ;
  if ( ! S . contains ( "-" ) || S . split ( "-" ) . length > 2 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  String left = S . split ( "-" ) [ 0 ] ;
  String right = S . split ( "-" ) [ 1 ] ;
  if ( left . length ( ) == A && right . length ( ) == B ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return left ;
}
