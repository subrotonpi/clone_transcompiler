public static String input ( ) {
  String a , b = input ( ) . split ( " " ) ;
  List squares = new ArrayList ( ) ;
  for ( int x = 0 ;
  x < 318 ;
  x ++ ) squares . add ( x * x ) ;
  return ( int ) ( a + b ) in ( squares ) ? "Yes" : "No" ;
}
