public static void tnum ( Scanner in ) {
  int tnum = in . nextInt ( ) ;
  for ( int test = 0 ;
  test < tnum ;
  test ++ ) {
    final String s = in . next ( ) ;
    final int len = s . length ( ) ;
    int t = 0 ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < len ;
    i ++ ) {
      ans = Math . max ( ans , i - t ) ;
      t += Integer . parseInt ( s . substring ( i , i + 1 ) ) ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + ans ) ;
  }
}
