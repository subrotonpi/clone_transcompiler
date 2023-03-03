static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( As ) ;
  final int M = ( int ) ( 1e9 + 7 ) ;
  /* advance n */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    As [ 0 ] *= A ;
    Arrays . sort ( As ) ;
  }
  /* solve */
  if ( A == 1 ) return 0 ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < B ;
  i ++ ) {
    cnt ++ ;
    As [ 0 ] *= A ;
    Arrays . sort ( As ) ;
    if ( cnt == B ) return 0 ;
    if ( As [ 0 ] * A >= As [ As . length - 1 ] ) break ;
  }
  if ( B - cnt > 0 ) {
    int q = ( B - cnt ) / As . length ;
    int r = ( B - cnt ) % As . length ;
    double Aq = Math . pow ( A , q , M ) ;
    for ( int j = 0 ;
    j < As . length ;
    j ++ ) As [ j ] *= Aq ;
    /* advance r */
  }
  /* solve */
  for ( int a : As ) System . out . println ( a % M ) ;
  return A ;
}
