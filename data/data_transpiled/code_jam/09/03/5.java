static String [ ] text ( ) throws IOException {
  BufferedReader reader = new BufferedReader ( new FileReader ( "C.in" ) ) ;
  BufferedWriter out = new BufferedWriter ( new FileWriter ( "C.out" ) ) ;
  final int MOD = 10000 ;
  final String searched_string = "welcome to code jam" ;
  int tests = Integer . parseInt ( reader . readLine ( ) ) ;
  int offset = 1 ;
  for ( int test = 1 ;
  test <= tests ;
  test ++ ) {
    String line = reader . readLine ( ) ;
    System . out . println ( line ) ;
    line = "#" + line ;
    int [ ] [ ] found = new int [ searched_string . length ( ) + 1 ] [ searched_string . length ( ) + 1 ] ;
    for ( int x = 0 ;
    x < line . length ( ) ;
    x ++ ) {
      found [ x ] = new int [ searched_string . length ( ) + 1 ] ;
      if ( x == 0 ) {
        found [ x ] [ 0 ] = 1 ;
      }
      for ( int found_idx = 0 ;
      found_idx <= searched_string . length ( ) ;
      found_idx ++ ) {
        if ( line . charAt ( x ) == searched_string . charAt ( found_idx ) ) {
          for ( int y = 0 ;
          y < x ;
          y ++ ) {
            found [ x ] [ found_idx + 1 ] += found [ y ] [ found_idx ] ;
            found [ x ] [ found_idx + 1 ] %= MOD ;
          }
        }
      }
    }
    String ans = Integer . toString ( ( Integer . parseInt ( line . substring ( line . length ( ) - 1 ) ) % MOD ) & 0xff , 4 ) ;
    ans = "0" + ans ;
    assert ( ans . length ( ) == 4 ) ;
    System . out . println ( "Case #" + test + ": " + ans ) ;
    out . write ( "Case #" + test + ": " + ans + "\n" ) ;
    offset ++ ;
  }
  return text ;
}
