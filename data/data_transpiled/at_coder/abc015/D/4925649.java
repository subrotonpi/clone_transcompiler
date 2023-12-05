public static int W = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int [ ] [ ] dp = new int [ 5001 ] [ 51 ] ;
  dp [ 0 ] [ 0 ] = 0 ;
  int t = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i ;
    j >= 0 ;
    j -- ) {
      for ( int k = t ;
      k >= 0 ;
      k -- ) {
        dp [ j + 1 ] [ k + A . get ( i ) . intValue ( ) ] = Math . min ( dp [ j ] [ k ] + A . get ( i ) . intValue ( ) , dp [ j + 1 ] [ k + A . get ( i ) . intValue ( ) ] ) ;
      }
    }
    t += A . get ( i ) . intValue ( ) ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= K ;
  i ++ ) {
    for ( int j = 0 ;
    j < 5001 ;
    j ++ ) {
      if ( dp [ i ] [ j ] <= W ) ans = Math . max ( ans , j ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
