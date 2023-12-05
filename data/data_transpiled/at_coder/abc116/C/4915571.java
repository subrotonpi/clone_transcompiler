public static void print ( int N ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > heights = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    heights . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int ans = heights . get ( 0 ) ;
  int [ ] sa = new int [ N - 1 ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    sa [ i ] += heights . get ( i + 1 ) - heights . get ( i ) ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( sa [ i ] > 0 ) {
      ans += sa [ i ] ;
    }
  }
  System . out . println ( ans ) ;
}
