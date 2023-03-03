public static void print ( String s [ ] ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] s = new String [ n ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    s [ i ] = input . nextLine ( ) ;
  }
  int cnt_r = 0 ;
  int cnt_b = 0 ;
  for ( String color : s ) {
    cnt_r += color . indexOf ( "R" ) ;
    cnt_b += color . indexOf ( "B" ) ;
  }
  if ( cnt_r > cnt_b ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else if ( cnt_r < cnt_b ) {
    System . out . println ( "AOKI" ) ;
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
}
