static final int [ ] getMath ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int tc = 0 , ts = 0 , tf = 0 ;
  int [ ] C = new int [ N - 1 ] , S = new int [ N - 1 ] , F = new int [ N - 1 ] ;
  double t = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    tc = Integer . parseInt ( input . nextLine ( ) ) ;
    ts = Integer . parseInt ( input . nextLine ( ) ) ;
    tf = Integer . parseInt ( input . nextLine ( ) ) ;
    C [ i ] = tc ;
    S [ i ] = ts ;
    F [ i ] = tf ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    t = 0 ;
    for ( int j = i ;
    j < N - 1 ;
    j ++ ) {
      if ( t <= S [ j ] ) t = S [ j ] + C [ j ] ;
      else t = Math . ceil ( t / F [ j ] ) * F [ j ] + C [ j ] ;
    }
    System . out . println ( t ) ;
  }
  System . out . println ( 0 ) ;
  return C ;
}
