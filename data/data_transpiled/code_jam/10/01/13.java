public static void main ( String argv [ ] ) throws Exception {
  final Scanner in = new Scanner ( System . in ) ;
  int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int t = xrange ( T ) ;
  t < T ;
  t ++ ) {
    final int N = Integer . parseInt ( in . nextLine ( ) ) ;
    final int K = Integer . parseInt ( in . nextLine ( ) ) ;
    final String result = ( K % ( 2 * N ) ) == 2 * N - 1 ? "ON" : "OFF" ;
    System . out . format ( "Case #%i: %s%n" , t + 1 , result ) ;
  }
}
