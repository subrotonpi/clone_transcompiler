public static void main ( int n , String X ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( X >> i ) & 1 == 1 ) {
      ans += a [ i ] ;
    }
  }
  System . out . println ( ans ) ;
}
