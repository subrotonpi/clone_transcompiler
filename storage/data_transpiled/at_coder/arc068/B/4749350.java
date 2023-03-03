public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  int [ ] d = new int [ 100001 ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < A . size ( ) ;
  i ++ ) {
    if ( d [ i ] > 0 ) ans ++ ;
    d [ i ] ++ ;
  }
  System . out . println ( N - ( ( ans + 1 ) / 2 ) * 2 ) ;
}
