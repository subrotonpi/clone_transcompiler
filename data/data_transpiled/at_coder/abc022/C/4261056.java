static final double [ ] [ ] G ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    L . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  final double [ ] [ ] A = new double [ N ] [ N ] ;
  final List < Integer > B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = L . get ( i ) ;
    int v = L . get ( i ) ;
    int l = L . get ( i ) ;
    u -- ;
    v -- ;
    if ( u == 0 ) B . add ( new Integer ( v ) ) ;
    else A [ v ] [ v ] = l ;
  }
  A = B . get ( 0 ) ;
  return A ;
}
