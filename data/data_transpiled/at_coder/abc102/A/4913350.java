public static int N ( ) {
  final int N = input ( ) ;
  final int g = Math . gcd ( 2 , N ) ;
  System . out . println ( ( int ) ( 2 * N / g ) ) ;
  return g ;
}
