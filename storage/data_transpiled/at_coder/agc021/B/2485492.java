@ VisibleForTesting static Map < Point , Double > cross ( ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Point > H = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    H . add ( new Point ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  if ( n == 1 ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  final List < Point > convex = new ArrayList < > ( ) ;
  convex . add ( Collections . min ( H , new Comparator < Point > ( ) {
    @ Override public int compare ( Point o1 , Point o2 ) {
      return o1 . y - o2 . y ;
    }
  }
  ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Point a = ( H . get ( 0 ) != convex . get ( convex . size ( ) - 1 ) ) ? H . get ( 0 ) : H . get ( convex . size ( ) - 1 ) ;
    for ( Point b : H ) {
      final Point ac = a . x - convex . get ( convex . size ( ) - 1 ) ;
      final Point bc = b . x - convex . get ( convex . size ( ) - 1 ) ;
      final int cross_ = cross ( ac , bc ) ;
      if ( cross_ < 0 || ( cross_ == 0 && Math . abs ( ac . x ) < Math . abs ( bc . x ) ) ) {
        a = b ;
      }
    }
    if ( ( a == convex . get ( 0 ) ) && ( b == convex . get ( 0 ) ) ) {
      break ;
    }
    convex . add ( a ) ;
  }
  final Map < Point , Double > ans = new TreeMap < > ( ) ;
  for ( int i = 0 ;
  i < H . size ( ) ;
  i ++ ) {
    final Point c = convex . get ( i - 1 ) ;
    final Point a = convex . get ( i - 1 ) ;
    final Point b = convex . get ( i - 1 ) ;
    final Point ca = c . x - a ;
    final Point ba = b . x - a ;
    final Point i = new Point ( ca . x * ba . x ) ;
    final double n = Math . abs ( ca . x ) ;
    ans . put ( new Point ( a , b ) , ( Math . PI - Math . acos ( Math . clip ( i / n , - 1 ,