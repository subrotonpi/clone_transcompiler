static final Pattern SINK_LETTERS = Pattern . compile ( "B.in" ) ;
System . setProperty ( "line.separator" , "," ) ;
System . setProperty ( "line.separator" , "," ) ;
System . setProperty ( "line.separator" , "," ) ;
final Function < String , String [ ] > memoize = new Function < String , String [ ] > ( ) {
  final Map < Character , String [ ] > memoized = new HashMap < Character , String [ ] > ( ) ;
  @ Override public String [ ] apply ( String [ ] input ) {
    String key ;
    if ( input == null ) {
      key = input ;
    }
    else {
      key = new String [ ] {
        input , input . charAt ( input . length ( ) - 1 ) }
        ;
      }
      String [ ] [ ] sinkLetters = new String [ 2 ] [ ] ;
      for ( int i = 0 ;
      i < sinkLetters . size ( ) ;
      i ++ ) {
        sinkLetters . get ( i ) [ i ] = memoized . get ( input [ i ] [ i ] ) ;
      }
      String [ ] [ ] elevation = null ;
      int [ ] [ ] coords = {
        {
          0 , - 1 , 1 }
          , {
            - 1 , 0 , 2 }
            , {
              1 , 0 , 4 }
              , {
                0 , 1 , 3 }
                , }
                ;
                System . out . println ( coords [ 0 ] ) ;
                @ SuppressWarnings ( "unchecked" ) int bestDdx = 0 , bestDdy = 0 ;
                int curDir = 0 ;
                for ( int i = 0 ;
                i < coords . length ;
                i ++ ) {
                  int dx = coords [ i ] [ 0 ] ;
                  int dy = coords [ i ] [ 1 ] ;
                  int dir = coords [ i ] [ 2 ] ;
                  if ( x + dx >= 0 && x + dx < elevation [ 0 ] . length && y + dy >= 0 && y + dy < elevation [ 0 ] . length ) {
                    if ( elevation [ y + dy ] [ x + dx ] < elevation [ y + bestDdy ] [ x + bestDdx ] ) {
                      bestDdx = dx ;
                      bestDdy = dy ;
                      curDir = dir ;
                    }
                    else if ( elevation [ y + dy ] [ x + dx ] == elevation [ y + bestDdy ] [ x + bestDdx ] && curDir != 0 ) {
                      bestDdx = dx ;
                      bestDdy = dy ;
                      curDir = dir ;
                      