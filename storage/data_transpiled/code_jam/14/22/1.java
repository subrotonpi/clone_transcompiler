public static int n = Integer . parseInt ( input ) {
  for ( int caseno = 1 ;
  caseno <= 1 ;
  caseno ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    /* total */
    int total = 1 ;
    for ( int q = 31 ;
    q >= 0 ;
    q -- ) {
      boolean abit = ( q == i ) ? 0 : ( ( a & ( 1 << q ) ) != 0 ) ;
      boolean bbit = ( q == j ) ? 0 : ( ( b & ( 1 << q ) ) != 0 ) ;
      boolean cbit = ( q == k ) ? 0 : ( ( c & ( 1 << q ) ) != 0 ) ;
      if ( q < i && q < j && q < k ) {
        total *= 4 ;
      }
      if ( q >= i && q < j && q < k ) {
        total *= 2 ;
      }
      if ( q < i && q >= j && q < k ) {
        if ( ! cbit ) {
          total *= 3 ;
        }
      }
      if ( q >= i && q >= j && q < k ) {
      }
      if ( q >= i && q >= j && q < k ) {
      }
      if ( q >= j && q >= k ) {
        if ( cbit && abit ) {
          total *= 1 ;
        }
        if ( cbit && ! abit ) {
          total *= 0 ;
        }
        if ( ! cbit && ! abit ) {
          total *= 1 ;
        }
        if ( ! cbit && ! abit ) {
          total *= 2 ;
        }
      }
      if ( q >= i && q >= j && q >= k ) {
        if ( abit & bbit != cbit ) {
          total *= 0 ;
        }
      }
    }
    System . out . println ( "Case #" + caseno + ": " + total ) ;
  }
  return total ;
}
