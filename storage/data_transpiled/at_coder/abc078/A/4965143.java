public static String input ( ) {
  x , y = input ( ) . split ( ";" ) ;
  print ( "=" if x == y else "<>" + x [ y : : 2 ] ) ;
}
