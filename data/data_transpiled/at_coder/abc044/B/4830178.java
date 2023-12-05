public static void hoge ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < hoge . length ;
  i ++ ) {
    ans += hoge . count ( hoge [ i ] ) % 2 ;
  }
  if ( ( ans == 0 ) && ( hoge . length == 1 ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
