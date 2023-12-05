static void print ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  @ SuppressWarnings ( "resource" ) final int h = Integer . parseInt ( input ) ;
  final int w = Integer . parseInt ( input ) ;
  final int k = Integer . parseInt ( input ) ;
  final List < String > MAP = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    final List < String > s = Collections . singletonList ( input . trim ( ) ) ;
    for ( int j = 0 ;
    j < s . size ( ) ;
    j ++ ) {
      if ( s . get ( j ) . equals ( "S" ) ) {
        final int sx = i ;
        final int sy = j ;
        MAP . add ( s ) ;
      }
    }
    MAP . add ( s ) ;
  }
  final int [ ] [ ] delta = {
    {
      1 , 0 }
      , {
        0 , 1 }
        , {
          - 1 , 0 }
          , {
            0 , - 1 }
          }
          ;
          final PriorityQueue < Integer > q = new PriorityQueue < > ( ) ;
          q . add ( new Integer ( sx ) ) ;
          q . add ( new Integer ( sy ) ) ;
          double dist = Double . MAX_VALUE ;
          final boolean [ ] [ ] visited = new boolean [ w ] [ h ] ;
          for ( int i = 0 ;
          i < h ;
          i ++ ) {
            visited [ i ] [ i ] = false ;
          }
          visited [ sx ] [ sy ] = true ;
          while ( q . size ( ) > 0 ) {
            final int x = q . poll ( ) ;
            final int y = q . poll ( ) ;
            dist = Math . min ( dist , x , y , h - 1 - x , w - 1 - y ) ;
            if ( dist == 0 ) {
              break ;
            }
            if ( t > 0 ) {
              t -- ;
              for ( final int dx = 0 ;
              dx < delta . length ;
              dy ++ ) {
                if ( MAP . get ( x + dx ) . charAt ( y + dy ) == '.' && ! visited [ x + dx ] [ y + dy ] ) {
                  q . add ( new Integer ( x + dx ) ) ;
                  visited [ x + dx ] [ y + dy ] = true ;
                }
              }
            }
          }
          System . out . println ( 1 + Math . ceil ( dist / k ) ) ;
        }
        