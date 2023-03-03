static final String getScanner ( ) throws FileNotFoundException {
  String ans ;
  BufferedReader br = null ;
  String s ;
  String ans ;
  String fn ;
  if ( args . length >= 2 ) {
    fn = args [ 1 ] ;
    if ( fn != null ) {
      fn = fn ;
    }
    br = new BufferedReader ( new FileReader ( fn ) ) ;
  }
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int _T = xrange ( T ) ;
  _T < T ;
  _T ++ ) {
    s = br . readLine ( ) ;
    String K = br . readLine ( ) ;
    K = Integer . parseInt ( K ) ;
    boolean [ ] l = new boolean [ s . length ( ) ] ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) l [ i ] = s . charAt ( i ) == '+' ;
    int flips = 0 ;
    for ( int i : xrange ( s . length ( ) - K + 1 ) ) if ( ! l [ i ] ) {
      flips ++ ;
      for ( int j : xrange ( i , i + K ) ) l [ j ] = ! l [ j ] ;
    }
    if ( ! Arrays . equals ( l , s ) ) ans = "IMPOSSIBLE" ;
    else ans = flips ;
    System . out . println ( "Case #" + ( _T + 1 ) + ": " + ans ) ;
  }
  return ans ;
}
