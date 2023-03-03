static final double [ ] [ ] G ( ) {
  final double INF = Double . MAX_VALUE ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final double [ ] [ ] A = new double [ M ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ a - 1 ] [ b ] = t ;
    A [ b - 1 ] [ a - 1 ] = t ;
  }
  A = G ( A ) ;
  double Ans = INF ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Ans = Math . min ( Ans , Math . max ( A [ i ] , A [ i ] ) ) ;
  }
  return A ;
}
