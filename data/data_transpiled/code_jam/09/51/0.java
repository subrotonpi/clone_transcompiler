@ VisibleForTesting static void solve ( ) {
  final Class < ? > gcj = Class . forName ( "gcj" ) ;
  final InputStream IN = System . in ;
  int number = 0 ;
  @ SuppressWarnings ( "unused" ) final String line ;
  int r = IN . read ( ) ;
  int c = IN . read ( ) ;
  final String [ ] src = new String [ r ] ;
  final int [ ] dst = new int [ c ] ;
  for ( int i = 0 ;
  i < r ;
  ++ i ) {
    for ( int j = 0 ;
    j < c ;
    ++ j ) {
      if ( "ow" . equals ( src [ i ] ) ) {
        src [ i ] = IN . read ( ) ;
      }
      if ( "xw" . equals ( dst [ i ] ) ) {
        dst [ i ] = IN . read ( ) ;
      }
    }
  }
  assert src . length ( ) == dst . length ;
  assert isSafe ( dst ) ;
  src = ( new String [ ] {
    Arrays . copyOf ( src , src . length ) }
    ) ;
    dst = ( new String [ ] {
      Arrays . copyOf ( dst , src . length ) }
      ) ;
      dest = 0 ;
      final Set < Integer > vis = new HashSet < Integer > ( ) ;
      while ( next != null ) {
        dest = next ;
        next = new int [ c ] ;
        for ( int i = 0 ;
        i < c ;
        ++ i ) {
          dest [ i ] = in . read ( ) ;
        }
      }
      final int t = gcj . line ( Integer . MAX_VALUE ) ;
      for ( int i = 0 ;
      i < t ;
      ++ i ) {
        final int r = gcj . splitline ( Integer . MAX_VALUE ) ;
        final int c = gcj . splitline ( Integer . MAX_VALUE ) ;
        final int [ ] data = new int [ r ] ;
        for ( int j = 0 ;
        j < r ;
        ++ j ) {
          data [ j ] = in . read ( ) ;
        }
        System . out . println ( gcj . case ( ) + " " + solve ( data ) ) ;
        System . out . flush ( ) ;
      }
      final int [ ] pos = new int [ n ] ;
      int safe = pos . length > r ;
      final int n = pos . length ;
      final int r = in . read ( ) ;
      final int c = in . read ( ) ;
      for ( int i = 0 ;
      i < n ;
      ++ i ) {
        final int [ ] dx = pos [ i ] ;
        