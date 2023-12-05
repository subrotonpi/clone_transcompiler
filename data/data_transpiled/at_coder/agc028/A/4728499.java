static final int [ ] getNegativeInstances ( ) {
  final int N = Integer . parseInt ( input . readLine ( ) ) ;
  final int M = Integer . parseInt ( input . readLine ( ) ) ;
  final int S = input . readInt ( ) ;
  final int T = input . readInt ( ) ;
  final int g = MathUtils . gcd ( N , M ) ;
  final int L = N * M / g ;
  {
    final int s1 = L / U1 . length ;
    final int s2 = L / U2 . length ;
    for ( int i = 0 ;
    i < U1 . length ;
    i ++ ) {
      if ( ( i * s1 ) % s2 == 0 ) {
        final int j = ( i * s1 ) / s2 ;
        if ( U1 . charAt ( i ) != U2 . charAt ( j ) ) {
          return false ;
        }
      }
    }
    return true ;
  }
}
