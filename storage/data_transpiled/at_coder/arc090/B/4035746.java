@ VisibleForTesting static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int inf = 10 * 10 ;
  List < List < Integer >> [ ] edge = new ArrayList [ n ] ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int l = Integer . parseInt ( input ) ;
    int r = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    edge [ l - 1 ] . add ( new Integer ( r - 1 ) ) ;
    edge [ r - 1 ] . add ( new Integer ( d ) ) ;
    edge [ r - 1 ] . add ( new Integer ( l - 1 ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( x [ i ] == inf ) {
      x [ i ] = 0 ;
      Queue < Integer > q = new LinkedList < Integer > ( ) ;
      q . add ( i ) ;
      while ( q . size ( ) != 0 ) {
        int now = q . poll ( ) ;
        for ( int [ ] e : edge [ now ] ) {
          if ( x [ e [ 0 ] ] == inf ) {
            x [ e [ 0 ] ] = x [ now ] + e [ 1 ] ;
            q . add ( e [ 0 ] ) ;
          }
          else if ( x [ e [ 0 ] ] - x [ now ] != e [ 1 ] ) {
            System . out . println ( "No" ) ;
            exit ( ) ;
          }
        }
      }
    }
  }
  System . out . println ( "Yes" ) ;
}
