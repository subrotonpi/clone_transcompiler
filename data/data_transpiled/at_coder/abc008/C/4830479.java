public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] c = new int [ n ] ;
  double ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int [ ] lis = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int temp = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( c [ i ] % c [ j ] == 0 ) {
        temp ++ ;
      }
    }
    if ( temp % 2 == 0 ) {
      ans += 0.5 ;
    }
    else {
      ans += ( temp + 1 ) / ( 2 * temp ) ;
    }
  }
  System . out . println ( ans ) ;
}
