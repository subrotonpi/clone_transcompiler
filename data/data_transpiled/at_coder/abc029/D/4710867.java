public static void input ( Scanner s ) {
  int n = s . nextInt ( ) ;
  int [ ] [ ] [ ] dp = new int [ n + 1 ] [ n + 1 ] [ n + 1 ] ;
  dp [ 0 ] [ 0 ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      for ( int k = 0 ;
      k < 11 ;
      k ++ ) {
        int x = j > 0 ? 9 : Integer . parseInt ( s . nextLine ( ) ) ;
        for ( int d = 0 ;
        d < x + 1 ;
        d ++ ) {
          dp [ i + 1 ] [ j || ( d < x ) ] [ k + ( d == 1 ? 0 : 1 ) ] += dp [ i ] [ j ] [ k ] * k ;
        }
      }
    }
  }
  int ans = 0 ;
  for ( int j = 0 ;
  j < 2 ;
  j ++ ) {
    for ( int k = 0 ;
    k < 11 ;
    k ++ ) {
      ans += dp [ n ] [ j ] [ k ] * k ;
    }
  }
  System . out . println ( ans ) ;
}
