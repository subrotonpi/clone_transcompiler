private static void solve ( ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
  PrintWriter g = new PrintWriter ( new FileWriter ( "B.out" ) ) ;
  int N = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = br . readLine ( ) . trim ( ) ;
    int D = s . length ( ) ;
    int [ ] [ ] m = new int [ 210 ] [ D ] ;
    /* go through the j */
    int [ ] rn = new int [ 210 ] ;
    if ( j == D ) return rn ;
    if ( m [ j ] != null ) return m [ j ] ;
    int t = Integer . parseInt ( s . substring ( j , D ) ) ;
    rn [ t % 210 ] ++ ;
    for ( int k : xrange ( j + 1 , D ) ) {
      t = Integer . parseInt ( s . substring ( j , k ) ) ;
      int [ ] rs = go ( k ) ;
      for ( int ir : xrange ( 210 ) ) {
        rn [ ( t + ir ) % 210 ] += rs [ ir ] ;
        rn [ ( 210 + t - ir ) % 210 ] += rs [ ir ] ;
      }
    }
    m [ j ] = rn ;
    /* go through the j */
    int [ ] rrr = go ( 0 ) ;
    int ret = 0 ;
    for ( int j : xrange ( 210 ) ) {
      if ( j % 2 == 0 || j % 3 == 0 || j % 5 == 0 || j % 7 == 0 ) ret += rrr [ j ] ;
    }
    g . println ( "Case #" + ( i + 1 ) + ": " + ret ) ;
  }
  g . close ( ) ;
}
