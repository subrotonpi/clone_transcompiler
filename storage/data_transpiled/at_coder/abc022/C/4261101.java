static final double [ ] [ ] G ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final double [ ] [ ] matrix = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    matrix [ i ] [ 0 ] = Double . MAX_VALUE ;
  }
  final int [ ] [ ] A = new int [ M ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = L . get ( i ) ;
    int v = L . get ( i ) ;
    int l = L . get ( i ) ;
    u -- ;
    v -- ;
    if ( u == 0 ) {
      A [ i ] [ v ] = l ;
    }
    else {
      matrix [ i ] [ v ] = l ;
    }
  }
  return A ;
}
