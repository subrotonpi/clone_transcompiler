public static void print ( String S ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int a = N % 5 ;
  int b = ( N - 1 ) / 5 ;
  print ( S [ b ] + S [ a - 1 ] ) ;
}
