static final Scanner rl = new Scanner ( System . in ) {
  private final static boolean next = System . in . nextInt ( ) > 0 ;
  private int pick ( final List < Integer > hand , final int [ ] order ) {
    return new AbstractList < Integer > ( ) {
      private int pick ( final List < Integer > hand , final int [ ] order ) {
        return order [ 0 ] ;
      }
      private int pick ( final int [ ] a , final int [ ] b ) {
        for ( int field : order ) {
          if ( a [ field ] != b [ field ] ) {
            return a [ field ] - b [ field ] ;
          }
        }
        return 0 ;
      }
      public int compare ( final int [ ] a , final int [ ] b ) {
        for ( int field : order ) {
          if ( a [ field ] != b [ field ] ) {
            return a [ field ] - b [ field ] ;
          }
        }
        return 0 ;
      }
    }
    ;
  }
  public int compare ( final int [ ] a , final int [ ] b ) {
    final List < Integer > hand = new LinkedList < Integer > ( ) ;
    int ret = 0 ;
    while ( hand . size ( ) > 0 && turns > 0 ) {
      ret += pick ( hand , new int [ ] {
        1 }
        ) . get ( ) ;
        turns -- ;
      }
      return ret ;
    }
    public int playGreedy ( final List < Integer > hand , final int turns ) {
      final int max = Integer . MAX_VALUE ;
      int max = 0 ;
      int t = Integer . MAX_VALUE ;
      for ( int cc = 0 ;
      cc < t ;
      cc ++ ) {
        final int n = Integer . parseInt ( rl . nextInt ( ) ) ;
        final int [ ] hand = new int [ n ] ;
        for ( int i : xrange ( n ) ) {
          hand [ i ] = Integer . parseInt ( rl . nextInt ( ) ) ;
        }
        for ( int i : xrange ( m ) ) {
          int [ ] deck = new int [ n ] ;
          for ( int i : xrange ( m ) ) {
            deck [ i ] = Integer . parseInt ( rl . nextInt ( ) ) ;
          }
          int draw = use [ 0 ] ;
          hand = hand . toArray ( new Integer [ draw ] ) ;
          hand = hand . toArray ( new Integer [ draw ] ) ;
          deck = deck . toArray ( new Integer [ draw ] ) ;
          score += use [ 1 ] ;
          turns += use [ 2 ] - 1 ;
        }
        max = max ;
      }
      return max ;
    }
  }
  