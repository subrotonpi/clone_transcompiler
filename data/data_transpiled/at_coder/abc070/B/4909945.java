public static int A = Integer . parseInt ( input ) {
  int start = 0 ;
  int end = 0 ;
  if ( B <= C || D <= A ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  if ( A < C ) start = C ;
  else start = A ;
  if ( B < D ) end = B ;
  else end = D ;
  return end - start ;
}
