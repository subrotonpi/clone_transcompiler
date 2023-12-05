public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] C = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    C [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int cnt = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i != j && C [ i ] % C [ j ] == 0 ) {
        cnt ++ ;
      }
    }
    if ( cnt % 2 == 1 ) {
      ans += 0.5 ;
    }
    else {
      ans += ( cnt + 2 ) / ( 2 * cnt + 2 ) ;
    }
  }
  System . out . println ( ans ) ;
}
