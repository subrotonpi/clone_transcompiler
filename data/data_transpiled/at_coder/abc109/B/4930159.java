public static void print ( int N ) {
  int [ ] W = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) W [ i ] = input . nextInt ( ) ;
  Set < String > his = new HashSet < String > ( ) ;
  boolean ok = true ;
  String lc = W [ 0 ] . charAt ( 0 ) ;
  for ( String w : W ) {
    if ( his . contains ( w ) || lc != w . charAt ( 0 ) ) {
      ok = false ;
      break ;
    }
    his . add ( w ) ;
    lc = w . charAt ( w . length ( ) - 1 ) ;
  }
  System . out . println ( ok ? "Yes" : "No" ) ;
}
