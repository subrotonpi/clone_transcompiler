static final double distance ( double [ ] a , double [ ] b , double [ ] c ) {
  final double [ ] u = new double [ ] {
    b [ 0 ] - a [ 0 ] , b [ 1 ] - a [ 1 ] }
    ;
    final double [ ] v = new double [ ] {
      c [ 0 ] - a [ 0 ] , c [ 1 ] - a [ 1 ] }
      ;
      final double L = Math . abs ( cross ( u , v ) / FastMath . sqrt ( u . length ) ) ;
      return L ;
    }
    