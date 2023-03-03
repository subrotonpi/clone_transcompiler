public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < List < Integer >> A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    A . add ( Lists . newArrayList ( Integer . parseInt ( input ) ) ) ;
  }
  int [ ] [ ] dp = new int [ N + 1 ] [ 2 ] ;
  dp [ 0 ] [ 0 ] = A . get ( 0 ) . get ( 0 ) ;
  dp [ 1 ] [ 0 ] = A . get ( 0 ) . get ( 0 ) + A . get ( 1 ) . get ( 0 ) ;
  for ( int j = 0 ;
  j < N - 1 ;
  j ++ ) {
    dp [ 0 ] [ j + 1 ] = Math . max ( dp [ 0 ] [ j + 1 ] + A . get ( 1 ) [ j + 1 ] , dp [ 1 ] [ j ] + A . get ( 1 ) [ j + 1 ] ) ;
  }
  System . out . println ( dp [ 1 ] [ N - 1 ] ) ;
  return dp ;
}
