public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  while ( true ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int b = a [ i ] ;
      int c = b / n ;
      b = b % n ;
      a [ i ] = b ;
    }
    ans += c ;
  }
  if ( max ( a ) < n ) {
    break ;
  }
}
