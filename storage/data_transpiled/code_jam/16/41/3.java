static final String [ ] getWords ( ) {
  return new String [ ] {
    " " }
    ;
    /* Get the words of the word in the list */
    int [ ] getInts ( ) {
      return new int [ ] {
        Integer . parseInt ( i ) }
        ;
      }
      /* Get the int value of the word in the list */
      Map < Integer , String > stored = Maps . newHashMap ( ) ;
      Map < Character , String > beats = new HashMap < > ( ) ;
      beats . put ( 'P' , 'R' ) ;
      beats . put ( 'R' , 'S' ) ;
      beats . put ( 'S' , 'P' ) ;
      /* Get the first char value */
      String ans ;
      if ( stored . containsKey ( new Integer ( getInts ( ) ) ) ) {
        return stored . get ( new Integer ( getInts ( ) ) ) ;
      }
      if ( getInts ( ) . containsKey ( new Integer ( getInts ( ) ) ) ) {
        ans = new String ( ) ;
      }
      else {
        char a = getFirst ( getInts ( ) . get ( 0 ) , beats . get ( new Integer ( getInts ( ) ) ) ) ;
        char b = getFirst ( getInts ( ) . get ( 1 ) , beats . get ( new Integer ( getts ( ) ) ) ) ;
        if ( a < b ) ans = new String ( a ) ;
        else ans = new String ( b ) ;
      }
      stored . put ( new Integer ( getInts ( ) . get ( 0 ) ) , ans ) ;
      int T = getInt ( ) ;
      for ( int caseNo : xrange ( 1 , T + 1 ) ) {
        int N = getInts ( ) . get ( 0 ) ;
        int R = getInts ( ) . get ( 1 ) ;
        int P = getInts ( ) . get ( 0 ) ;
        int R = getInts ( ) . get ( 1 ) ;
        int s = getInts ( ) . get ( 1 ) ;
        boolean good = true ;
        for ( int i : xrange ( N ) ) {
          p [ i ] = P ;
          r [ i ] = R ;
          s [ i ] = S ;
          int h = ( P + R + S ) / 2 ;
          P = ( h - S ) / 2 ;
          R = ( h - P ) / 2 ;
        }
        String answer ;
        if (