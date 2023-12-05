static final Scanner in = new Scanner ( System . in ) {
  @ Override public void enter ( ) {
    int N = in . nextInt ( ) ;
    Point [ ] points = Arrays . stream ( new Point [ N ] ) . mapToInt ( l -> new Point ( Integer . parseInt ( l . split ( " " ) [ 0 ] ) ) ) . toArray ( Point [ ] :: new ) ;
    double baseX = points [ 0 ] . x ;
    double baseY = points [ 0 ] . y ;
    Arrays . sort ( points , new Comparator < Point > ( ) {
      @ Override public int compare ( Point p ) {
        return atan2 ( p . y - baseY , p . x - baseX ) ;
      }
    }
    ) ;
    double rad_90m = PI / 2 - 1e-9 , rad_90p = PI / 2 + 1e-9 , rad_360 = PI * 2 ;
    int ans2 = 0 , ans3 = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final double x1 = points [ i ] . x ;
      final double y1 = points [ i ] . y ;
      final List < Point > others = new ArrayList < > ( ) ;
      for ( int x = 0 ;
      x < points [ i ] . x ;
      x ++ ) {
        final double y = points [ i ] . y ;
        final double x = points [ i ] . x ;
        final double y = points [ i ] . y ;
        final double x = points [ i ] . x ;
        final double y = points [ i ] . y ;
        final double y = points [ i ] . x ;
        final double x = y - y ;
        final double y = points [ i ] . y ;
        final double y = y - y ;
        final double x = x + y ;
        final double y = y - y ;
        final double y = y - y ;
        for ( int j = 0 ;
        j < y ;
        j ++ ) {
          y += x ;
        }
        final double first = y ;
        final double x = x + y ;
        final double y = y - y ;
        for ( int j = 0 ;
        j < y ;
        j ++ ) {
          x += x ;
          y += y ;
        }
      }
      others . add ( x + y ) ;
    }
  }
}
