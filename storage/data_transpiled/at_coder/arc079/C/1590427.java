public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = 0 ;
  while ( true ) {
    int c = 0 ;
    boolean exist = false ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( a [ i ] > n - 1 ) {
        c = a [ i ] / n ;
        a [ i ] %= n ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( j != i ) {
            a [ j ] += c ;
          }
        }
        ans += c ;
        exist = true ;
      }
    }
    if ( ! exist ) {
      break ;
    }
  }
  System . out . println ( ans ) ;
}
