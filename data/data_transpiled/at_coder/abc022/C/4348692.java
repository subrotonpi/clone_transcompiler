static final double [ ] [ ] G ( ) {
  final double inf = 1e9 ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final double [ ] [ ] D = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int u = Integer . parseInt ( input . nextLine ( ) ) ;
    final int v = Integer . parseInt ( input . nextLine ( ) ) ;
    final int l = Integer . parseInt ( input . nextLine ( ) ) ;
    D [ u - 1 ] [ v - 1 ] = D [ v - 1 ] [ u - 1 ] = l ;
  }
  final double [ ] [ ] K = new double [ N ] [ N ] ;
  K [ 0 ] [ 0 ] = K [ 0 ] [ 0 ] ;
  K [ 0 ] [ 0 ] = inf ;
  K [ 0 ] [ 0 ] = inf ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    K [ i ] [ 0 ] = K [ i ] [ 0 ] ;
  }
  return K ;
}
