public static void main ( String input , int n , int c , int k ) {
  int [ ] T = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  int p = 0 ;
  int b = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int t = T [ i ] ;
    if ( p == 0 ) {
      w = t ;
    }
    p ++ ;
    if ( t - w > k ) {
      b ++ ;
    }
  }
  System . out . println ( b ) ;
}
