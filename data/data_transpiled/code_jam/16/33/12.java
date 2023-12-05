public static void solve ( String a ) throws IOException {
  int J = Integer . parseInt ( a . substring ( 0 , 4 ) ) ;
  int P = Integer . parseInt ( a . substring ( 4 , 6 ) ) ;
  int S = Integer . parseInt ( a . substring ( 6 , 8 ) ) ;
  int K = Integer . parseInt ( a . substring ( 8 , 9 ) ) ;
  K = Math . min ( S , K ) ;
  System . out . println ( J * P * K ) ;
  for ( int x : xrange ( J ) ) {
    for ( int y : xrange ( P ) ) {
      for ( int z : xrange ( K ) ) {
        System . out . println ( x + 1 + " " + y + 1 + " " + ( x + y + z ) % S + 1 ) ;
      }
    }
  }
  BufferedReader file = new BufferedReader ( new FileReader ( "C-large.in" ) ) ;
  a = file . readLine ( ) ;
  int T = Integer . parseInt ( a . substring ( 0 , 1 ) ) ;
  for ( int i : xrange ( T ) ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    solve ( a . substring ( i + 1 ) ) ;
  }
}
