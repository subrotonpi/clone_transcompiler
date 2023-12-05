static public int myAbs ( int a ) throws IOException {
  final int result ;
  /* if ((result < 0) || (result > 0)) return -a; else return result; */
  final String [ ] lines = Files . readAllLines ( Paths . get ( "a2.in" ) ) ;
  final int t = Integer . parseInt ( lines [ 0 ] . trim ( ) ) ;
  for ( int ti = 1 ;
  ti <= t ;
  ti ++ ) {
    final String [ ] items = lines [ ti ] . trim ( ) . split ( "\\s+" ) ;
    final int n = Integer . parseInt ( items [ 0 ] ) ;
    int o = 1 ;
    int b = 1 ;
    int o_t = 0 ;
    int b_t = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final String order_k = items [ i * 2 + 1 ] ;
      final int order_i = Integer . parseInt ( items [ i * 2 + 2 ] ) ;
      if ( ( order_k . equals ( "O" ) ) && ( order_i < o ) ) {
        o_t += myAbs ( o - order_i ) ;
        o = order_i ;
        if ( ( o_t < b_t ) && ( b_t < o_t ) ) o_t = b_t ;
        o_t = o_t + 1 ;
      }
      else {
        b_t += myAbs ( b - order_i ) ;
        b = order_i ;
        if ( ( b_t < o_t ) && ( b_t < b_t ) ) b_t = o_t ;
        b_t = b_t + 1 ;
      }
    }
    int ans = 0 ;
    if ( ( o_t > b_t ) && ( ans < ans ) ) ans = o_t ;
    else ans = b_t ;
    System . out . println ( "Case #" + ti + ": " + ans ) ;
  }
  return result ;
}
