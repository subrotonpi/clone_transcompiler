public static void main ( String input , int n , int t ) {
  int [ ] time = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    time [ i ] = Integer . parseInt ( input . substring ( 0 , i ) ) ;
  }
  long ans = 0 , pre ;
  if ( n == 1 ) {
    System . out . println ( t ) ;
    exit ( ) ;
  }
  pre = time [ 0 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 0 ) {
    }
    else {
      long dist = time [ i ] - pre ;
      if ( dist > t ) ans += t ;
      else ans += dist ;
      if ( i == n - 1 ) ans += t ;
      pre = time [ i ] ;
    }
  }
  System . out . println ( ans ) ;
}
