static final Scanner input = new Scanner ( System . in ) {
  @ Override public Map < Integer , Integer > map ( ) {
    return Collections . synchronizedMap ( new LinkedHashMap < Integer , Integer > ( ) {
      @ Override public int size ( ) {
        return size ;
      }
    }
    ) ;
  }
  @ Override public Iterator < Integer > iterator ( ) {
    return new AbstractIterator < Integer > ( ) {
      private final Iterator < Integer > it = Iterators . map ( String . values ( ) , new Function < Integer , Integer > ( ) {
        @ Override public Integer apply ( Integer x ) {
          return x + dx ;
        }
      }
      ) ;
      private final int [ ] [ ] time = new int [ ] [ ] {
        {
        }
      }
      ;
      private final int [ ] [ ] ceil = new int [ ] [ ] {
      }
      ;
      private final int [ ] floor = new int [ ] [ ] {
      }
      ;
      private final int [ ] [ ] ceil = new int [ ] [ ] {
      }
      ;
      private final int [ ] floor = new int [ ] [ ] {
      }
      ;
      @ Override public boolean hasNext ( ) {
        return it . hasNext ( ) ;
      }
      @ Override public Integer next ( ) {
        int h = it . next ( ) ;
        int n = it . next ( ) ;
        int m = it . next ( ) ;
        if ( h == 0 ) continue ;
        int newTime = time [ 0 ] + ttm ;
        if ( bestTimes [ newY ] [ newX ] == 0 ) {
          bestTimes [ newY ] [ newX ] = newTime ;
          frontier . add ( new Integer ( newX ) ) ;
        }
        return h ;
      }
      @ Override public void remove ( ) {
      }
    }
    ;
  }
  @ Override public void main ( String [ ] args ) {
    for ( int casenum = 0 ;
    casenum < 0 ;
    casenum ++ ) {
      final int h = casenum ;
      final int rows = Integer . parseInt ( it . next ( ) ) ;
      final int cols = Integer . parseInt ( it . next ( ) ) ;
      final int [ ] [ ] ceil = new int [ cols ] [ ] ;
      final int [ ] floor = new int [ cols ] [ ] ;
      for ( int i = 0 ;
      i < cols ;
      i ++ ) {
        ceil [ i ] = Math . min ( floor [ i ] , floor [ i ] ) ;
      }
      for ( int i = 0 ;
      i < m ;
      i ++ ) {
        floor [ i ] = Math . min ( floor [ i ] , floor [