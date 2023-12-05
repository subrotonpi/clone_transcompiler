public static int N ( ) {
  List < String > ans = list ( input ) ;
  return Math . max ( ans . stream ( ) . mapToInt ( String :: length ) ) ;
}
