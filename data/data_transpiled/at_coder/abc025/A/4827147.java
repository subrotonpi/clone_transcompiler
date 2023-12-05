public static String S = input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  String a = S [ ( N - 1 ) / 5 ] ;
  String b = S [ ( N - 1 ) % 5 ] ;
  return print ( a + b ) ;
}
