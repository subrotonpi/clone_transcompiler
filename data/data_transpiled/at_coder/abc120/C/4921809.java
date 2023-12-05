public static int S ( ) {
  int a = S . indexOf ( "0" ) ;
  int b = S . indexOf ( "1" ) ;
  return ( S . length ( ) - Math . abs ( a - b ) ) ;
}
