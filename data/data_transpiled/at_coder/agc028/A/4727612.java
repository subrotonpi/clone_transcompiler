static final Scanner getScanner ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int S = input . nextInt ( ) ;
  final int T = input . nextInt ( ) ;
  final int g = MathUtils . gcd ( N , M ) ;
  final int L = N * M / g ;
  final int ss = L / N ;
  final int ts = L / M ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( i * ss ) % ts == 0 ) {
      final int j = ( i * ss ) / ts ;
      if ( S [ i ] != T [ j ] ) {
        System . out . println ( - 1 ) ;
        System . exit ( 0 ) ;
      }
    }
  }
  System . out . println ( L ) ;
  return new Scanner ( ) ;
}
