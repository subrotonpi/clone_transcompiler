public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int stack = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a [ i - 1 ] < a [ i ] ) {
      stack ++ ;
    }
    else {
      ans += stack * ( stack - 1 ) / 2 ;
      stack = 1 ;
    }
  }
  ans += stack * ( stack - 1 ) / 2 ;
}
