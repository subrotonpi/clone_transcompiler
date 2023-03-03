public static void readFile ( File file ) throws IOException {
  BufferedReader reader = new BufferedReader ( new FileReader ( file ) ) ;
  int cases = Integer . parseInt ( reader . readLine ( ) ) ;
  final PrintWriter ans = new PrintWriter ( new BufferedWriter ( new FileWriter ( "1.out" ) ) ) ;
  print ( cases ) ;
  for ( int z = 0 ;
  z <= cases ;
  z ++ ) {
    int p = Integer . parseInt ( reader . readLine ( ) ) ;
    int k = Integer . parseInt ( reader . readLine ( ) ) ;
    int l = Integer . parseInt ( reader . readLine ( ) ) ;
    int [ ] letters = new int [ p ] ;
    for ( int i = 0 ;
    i < p ;
    i ++ ) {
      letters [ i ] = Integer . parseInt ( reader . readLine ( ) ) ;
    }
    Arrays . sort ( letters ) ;
    Arrays . reverse ( letters ) ;
    int res = 0 ;
    print ( p , k , l ) ;
    print ( letters ) ;
    for ( int x = 0 ;
    x <= l ;
    x ++ ) {
      int keylvl = x / k + 1 ;
      res += letters [ x ] * keylvl ;
    }
    print ( "Case #" + ( z + 1 ) + ": " + res + "\n" ) ;
    ans . println ( "Case #" + ( z + 1 ) + ": " + res + "\n" ) ;
  }
}
