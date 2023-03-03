public static void print ( String input ) {
  int r = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l . add ( Integer . parseInt ( input ) ) ;
  @ SuppressWarnings ( "unchecked" ) int [ ] rows = new int [ r ] ;
  int [ ] cols = new int [ c ] ;
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    rows [ i - 1 ] ++ ;
    cols [ j - 1 ] ++ ;
  }
  Counter R = new Counter ( rows ) ;
  Counter C = new Counter ( cols ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < R . keySet ( ) . size ( ) ;
  i ++ ) {
    res += R . get ( i ) * C . get ( k - i ) ;
  }
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    if ( rows [ i - 1 ] + cols [ j - 1 ] == k ) res -- ;
    if ( rows [ i - 1 ] + cols [ j - 1 ] == k + 1 ) res ++ ;
  }
  System . out . println ( res ) ;
}
