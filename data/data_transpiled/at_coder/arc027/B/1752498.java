static final String getExample ( ) {
  final String input = "Enter a number of characters to be used in the graph. " ;
  final double INF = Double . NaN ;
  System . setProperty ( "line.separator" , "" ) ;
  final double [ ] dy = {
    0 , - 1 , 0 , 1 }
    ;
    final double [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      final int N = Integer . parseInt ( input ) ;
      final char [ ] s1 = new char [ N ] ;
      final char [ ] s2 = new char [ N ] ;
      boolean change = true ;
      while ( change ) {
        change = false ;
        for ( char c1 : s1 ) {
          char c2 = s2 [ c1 ] ;
          if ( c1 != c2 && Character . isLetter ( c1 ) && Character . isLetter ( c2 ) ) {
            change = true ;
            for ( int i = 0 ;
            i < N ;
            i ++ ) {
              if ( s1 [ i ] == c2 ) {
                s1 [ i ] = c1 ;
              }
              if ( s2 [ i ] == c2 ) {
                s2 [ i ] = c1 ;
              }
            }
            break ;
          }
        }
        change = true ;
        while ( change ) {
          change = false ;
          final HashMap < Character , Character > aN = new HashMap < Character , Character > ( ) ;
          for ( char c1 : s1 ) {
            char c2 = s2 [ c1 ] ;
            if ( Character . isLetter ( c1 ) && Character . isDigit ( c2 ) ) {
              change = true ;
              aN . put ( c1 , c2 ) ;
            }
            if ( Character . isLetter ( c2 ) && Character . isDigit ( c1 ) ) {
              change = true ;
              aN . put ( c2 , c1 ) ;
            }
          }
          for ( int i = 0 ;
          i < N ;
          i ++ ) {
            s1 [ i ] = aN . get ( s1 [ i ] ) ;
            s2 [ i ] = aN . get ( s2 [ i ] ) ;
          }
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
            if ( i == 0 ) ans *= 9 ;
            else ans *= 10 ;
          }
        }
        System . out . println (