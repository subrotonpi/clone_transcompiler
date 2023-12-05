static final String findSquare ( String S ) {
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  String S ;
  int [ ] qpos = new int [ S . length ( ) ] ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    char ch = S . charAt ( i ) ;
    if ( ch == '?' ) {
      qpos [ i ] = i ;
    }
  }
  int ns = S . length ( ) ;
  int nq = qpos . length ;
  int baseval = Integer . parseInt ( S . replace ( '?' , '0' ) , 2 ) ;
  for ( int i : xrange ( 1 << qpos . length ) ) {
    long val = baseval ;
    for ( int j : xrange ( nq ) ) {
      if ( ( i & ( 1 << j ) ) != 0 ) {
        long p = 1 << ( ns - qpos [ j ] - 1 ) ;
        val += p ;
      }
    }
    int r = ( int ) ( val * 0.5 ) ;
    if ( ( r * r == val ) && ( r < val ) ) {
      return Integer . toBinaryString ( val ) ;
    }
  }
  int T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int i : xrange ( T ) ) {
    S = in . readLine ( ) . trim ( ) ;
    String result = findSquare ( S ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + result ) ;
  }
  return S ;
}
