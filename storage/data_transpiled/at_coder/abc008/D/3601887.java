@ VisibleForTesting static final Comparator < Area > COMPARATOR_BY_ORDER = new Comparator < Area > ( ) {
  @ Override public int compare ( Area o1 , Area o2 ) {
    final int N = Integer . parseInt ( o1 . toString ( ) ) ;
    final Comparator < Area > earnComparator = new Comparator < Area > ( ) {
      @ Override public int compare ( Area o1 , Area o2 ) {
        final Map < Integer , Integer > names = new HashMap < Integer , Integer > ( ) ;
        for ( int i = 0 ;
        i < names . size ( ) ;
        i ++ ) {
          names . put ( id ( o1 ) , names . get ( id ( i ) ) ) ;
        }
        return o1 . toString ( ) . compareTo ( o2 . toString ( ) ) ;
      }
    }
    ;
    final int W = Integer . parseInt ( o1 . toString ( ) ) ;
    final int H = Integer . parseInt ( o2 . toString ( ) ) ;
    final int N = Integer . parseInt ( o1 . toString ( ) ) ;
    final Point < Integer > Point = new Point < Integer > ( W + 1 , H + 1 ) ;
    final Area < Integer > area = new Area < Integer > ( ) ;
    final List < Point > cranes = new ArrayList < Point > ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      cranes . add ( area . getBottomLeft ( ) . x <= point . x && point . x < area . getTopRight ( ) . x && area . getBottomLeft ( ) . y <= point . y && area . getTopRight ( ) . y <= point . y && area . getTopRight ( ) . x < area . getTopRight ( ) . y ) ;
    }
    final List < Area > earnMemo = new HashMap < > ( ) ;
    return earnMemo . compare ( area , earnMemo ) ;
  }
  private List < Area > split4 ( Area area , Point point ) {
    final Point bl = area . getBottomLeft ( ) ;
    final Point tr = area . getTopRight ( ) ;
    final List < Area > areas = new ArrayList < > ( ) ;
    areas . add ( area . getBottomLeft ( ) . x <= point . x && area . getTopRight ( ) . y <= point . y && area . getTopRight ( ) . x <= point . x && area . getTopRight ( ) . y <= point . y && area . getTopRight ( ) . x <= point . x && area .