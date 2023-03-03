static final String getInput ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  System . setIn ( input ) ;
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
          final Queue < Pair < Integer , Integer >> q = new ArrayDeque < > ( ) ;
          q . add ( new Pair < > ( sx , sy , k ) ) ;
          double dist = Double . MAX_VALUE ;
          final boolean [ ] [ ] visited = new boolean [ w ] [ h ] ;
          for ( int i = 0 ;
          i < h ;
          i ++ ) {
            for ( int dx = 0 ;
            dx < delta . length ;
            dx ++ ) {
              for ( int dy = 0 ;
              dy < delta [ dx ] ;
              dy ++ ) {
                if ( MAP . get ( x + dx ) . charAt ( y + dy ) == '.' && ! visited [ x + dx ] [ y + dy ] ) {
                  q . add ( new Pair < > ( x + dx , y + dy , t ) ) ;
                  visited [ x + dx ] [ y + dy ] = true ;
                }
              }
            }
          }
          System . out . println ( 1 + Math . ceil ( dist / k ) ) ;
          return null ;
        }
        