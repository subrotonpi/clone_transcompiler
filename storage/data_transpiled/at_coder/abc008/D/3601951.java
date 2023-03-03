@ VisibleForTesting static final Comparator < Area > COMPARATOR_BY_ORDER = new Comparator < Area > ( ) {
  @ Override public int compare ( Area o1 , Area o2 ) {
    final int N = Integer . parseInt ( o1 . getScore ( ) ) ;
    final Comparator < Area > earnComparator = Comparator . comparing ( ( subArea , inCranes ) -> {
      final Map < Integer , String > names = new HashMap < > ( ) ;
      for ( Entry < Integer , String > entry : o1 . getScore ( ) . entrySet ( ) ) {
        names . put ( entry . getKey ( ) , entry . getKey ( ) ) ;
      }
      return entry . getValue ( ) . compareTo ( o2 . getScore ( ) ) ;
    }
    ) ;
    final int W = Integer . parseInt ( o1 . getScore ( ) ) ;
    final int H = Integer . parseInt ( o2 . getScore ( ) ) ;
    final int N = Integer . parseInt ( o1 . getScore ( ) ) ;
    final Point < Integer > Point = new Point < > ( 1 , W + 1 ) ;
    final Area < Integer > area = new Area < > ( Point . BOTTOM , Point . TOP ) ;
    final List < Point > cranes = new ArrayList < > ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      cranes . add ( Point . valueOf ( Integer . parseInt ( o1 . getScore ( ) ) ) ) ;
    }
    final Map < Integer , Integer > earnMemo = new HashMap < > ( ) ;
    return isInArea ( area , point -> area . getBottomLeft ( ) . x <= point . x && point . x < area . getTopRight ( ) . x && area . getBottomLeft ( ) . y <= point . y && area . getTopRight ( ) . y <= point . y ) ? area . getBottomLeft ( ) . x <= point . x && area . getTopRight ( ) . y <= point . y : area . getTopRight ( ) . y <= point . y ;
  }
}
