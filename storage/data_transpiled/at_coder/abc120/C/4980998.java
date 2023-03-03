public static int input ( ) {
  S = input ( ) ;
  C0 = S . count ( "0" ) ;
  C1 = S . count ( "1" ) ;
  return 2 * Math . min ( C0 , C1 ) ;
}
