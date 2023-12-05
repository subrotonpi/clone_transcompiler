static final String getExample ( ) {
  final String input = "Enter a sample of integers: " ;
  final double INF = Double . NaN ;
  System . setProperty ( "line.separator" , "" ) ;
  final double [ ] dy = {
    0 , - 1 , 0 , 1 }
    ;
    final double [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      final int N = Integer . parseInt ( input ) ;
      final int [ ] s1 = new int [ N ] ;
      final int [ ] s2 = new int [ N ] ;
      boolean change = true ;
      while ( change ) {
        change = false ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          final char c1 = s1 [ i ] ;
          final char c2 = s2 [ i ] ;
          if ( c1 != c2 && Character . isLetter ( c1 ) && Character . isLetter ( c2 ) ) {
            change = true ;
            for ( int j = 0 ;
            j < N ;
            j ++ ) {
              if ( s1 [ j ] == c2 ) {
                s1 [ j ] = c1 ;
              }
              if ( s2 [ j ] == c2 ) {
                s2 [ j ] = c1 ;
              }
            }
          }
        }
        final HashMap < Character , Integer > aN = new HashMap < Character , Integer > ( ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          final char c1 = s1 [ i ] ;
          final char c2 = s2 [ i ] ;
          if ( c1 != c2 && Character . isLetter ( c1 ) && Character . isLetter ( c2 ) ) {
            change = true ;
            for ( int j = 0 ;
            j < N ;
            j ++ ) {
              if ( s1 [ j ] == c2 ) {
                s1 [ j ] = c1 ;
              }
              if ( s2 [ j ] == c2 ) {
                s2 [ j ] = c1 ;
              }
            }
          }
        }
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          s1 [ i ] = aN . get ( s1 [ i ] ) ;
          s2 [ i ] = aN . get ( s2 [ i ] ) ;
        }
        assert s1 . equals ( s2 ) ;
        final HashSet < Character > s = new HashSet < Character > ( ) ;
        int ans = 1 ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          final char c = s1 [ i ] ;
          if ( Character . isLetter ( c ) && ! s . contains ( c ) ) {
            s . add ( c ) ;
            ans *= i == 0