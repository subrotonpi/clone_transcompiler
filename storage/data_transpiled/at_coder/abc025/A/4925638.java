public static int S ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  System . out . println ( S [ ( N - 1 ) / 5 ] + S [ N % 5 - 1 ] ) ;
  return N ;
}
