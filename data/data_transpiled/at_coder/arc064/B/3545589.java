public static String input ( ) {
  S = input ( ) ;
  A = S . length ( ) % 2 ;
  B = S . charAt ( 0 ) == S . charAt ( S . length ( ) - 1 ) ? 0 : 1 ;
  return "Second" . equals ( A ^ B ) ? "First" : "Second" ;
}
