static final void solve ( ) throws IOException {
  final BufferedReader in = new BufferedReader ( new FileReader ( "b-large.in" ) ) ;
  final PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "b.out" ) ) ) ;
  System . setIn ( in ) ;
  System . setOut ( out ) ;
  {
    final int n = a . length ;
    final double [ ] [ ] f = new double [ n + 1 ] [ n + 1 ] ;
    f [ 0 ] [ 0 ] = 1 ;
    for ( int i : xrange ( 1 , n + 1 ) ) {
      for ( int j : xrange ( n + 1 ) ) {
        f [ i ] [ j ] += f [ i - 1 ] [ j ] * a [ i - 1 ] ;
        if ( j > 0 ) {
          f [ i ] [ j ] += f [ i - 1 ] [ j - 1 ] * ( 1 - a [ i - 1 ] ) ;
        }
      }
    }
  }
  T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int t : xrange ( T ) ) {
    n = Integer . parseInt ( in . readLine ( ) ) ;
    m = Integer . parseInt ( in . readLine ( ) ) ;
  }
}
