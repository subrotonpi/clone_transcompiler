public static void main ( String input , int N , int A , int B ) {
  if ( A + B - 1 > N || A * B < N ) {
    System . out . println ( "-1" ) ;
  }
  else {
    List < Integer > ans = Lists . newArrayList ( ) ;
    ans . add ( 1 ) ;
    ans . add ( B ) ;
    if ( A > 1 ) {
      int x = ( N - B ) / ( A - 1 ) ;
      int y = ( N - B ) % ( A - 1 ) ;
      int st = B + 1 ;
      for ( int i = 0 ;
      i < y ;
      i ++ ) {
        ans . add ( Lists . newArrayList ( ) ) ;
        ans . add ( st ) ;
        ans . add ( x + 1 ) ;
      }
      for ( int i = 0 ;
      i < A - 1 - y ;
      i ++ ) {
        ans . add ( Lists . newArrayList ( ) ) ;
        ans . add ( st ) ;
        ans . add ( x ) ;
      }
    }
    System . out . println ( Arrays . toString ( ans . toArray ( ) ) ) ;
  }
}
