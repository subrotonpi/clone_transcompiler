public static void main ( String [ ] args ) {
  try {
    File infile = new File ( "B-large.in" ) ;
    File outfile = new File ( "B-large.out" ) ;
    int cases = Integer . parseInt ( next ( infile ) ) ;
    for ( int testCase = 1 ;
    testCase <= cases ;
    testCase ++ ) {
      int ac = Integer . parseInt ( next ( infile ) ) ;
      int aj = Integer . parseInt ( next ( infile ) ) ;
      int cRemaining = 720 ;
      int jRemaining = 720 ;
      int [ ] times = new int [ 1440 ] ;
      for ( int i = 0 ;
      i < ac ;
      i ++ ) {
        int c = Integer . parseInt ( next ( infile ) ) ;
        int d = Integer . parseInt ( next ( infile ) ) ;
        for ( int j = c ;
        j < d ;
        j ++ ) {
          times [ i ] = 0 ;
        }
        cRemaining -= d - c ;
      }
      for ( int i = 0 ;
      i < aj ;
      i ++ ) {
        int j = Integer . parseInt ( next ( infile ) ) ;
        int k = Integer . parseInt ( next ( infile ) ) ;
        for ( int j = j ;
        j < k ;
        j ++ ) {
          times [ i ] = 1 ;
        }
        jRemaining -= k - j ;
      }
      while ( cRemaining > 0 ) {
        Set < Integer > zeroGaps = new HashSet < Integer > ( ) ;
        int lastItemIndex = 0 ;
        int lastItem = 0 ;
        for ( int i = 0 ;
        i < 1440 * 2 ;
        i ++ ) {
          if ( times [ i % 1440 ] == 0 ) {
            if ( lastItem == 0 && ( i - lastItemIndex ) % 1440 > 1 ) {
              zeroGaps . add ( new Integer ( lastItemIndex + 1 ) ) ;
            }
            lastItem = 0 ;
            lastItemIndex = i ;
          }
          else if ( times [ i % 1440 ] == 1 ) {
            lastItem = 1 ;
            lastItemIndex = i ;
          }
        }
        if ( zeroGaps . isEmpty ( ) ) break ;
        int e = Collections . min ( zeroGaps , new Comparator < Integer > ( ) {
          @ Override public int compare ( Integer a , Integer b ) {
            return ( a . intValue ( ) - a . intValue ( ) ) % 1440 ;
          }
        }
        ) ;
        if ( f - e > cRemaining ) break ;
        cRemaining -= f - e ;
        for ( int i = e ;
        i < f ;
        i ++ ) {
          times [ i