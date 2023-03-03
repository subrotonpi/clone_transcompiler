static final double cross ( double [ ] a , double [ ] b ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final double [ ] H = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    H [ i ] = Math . max ( Integer . parseInt ( input . nextLine ( ) ) , 0 ) ;
  }
  final int [ ] convex = new int [ n ] ;
  convex [ 0 ] = Math . min ( H , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return o1 [ 1 ] - o2 [ 1 ] ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double a = ( H [ 0 ] != convex [ i ] ) ? H [ 0 ] : H [ i ] ;
    for ( int j = 1 ;
    j < H . length ;
    j ++ ) {
      double b = H [ j ] ;
      double ac = a - convex [ j ] ;
      double bc = b - convex [ j ] ;
      final double cross_ = cross ( ac , bc ) ;
      if ( cross_ < 0 || ( cross_ == 0 && Math . abs ( ac ) < Math . abs ( bc ) ) ) {
        a = b ;
      }
    }
    if ( ( a == convex [ 0 ] ) && ( b == convex [ j ] ) ) {
      break ;
    }
    convex [ j ] = a ;
  }
  final Map < Double , Double > ans = new LinkedHashMap < Double , Double > ( ) ;
  for ( int i = 0 ;
  i < convex . length - 1 ;
  i ++ ) {
    final double c = convex [ i ] , a = convex [ i ] , b = convex [ i + 1 ] ;
    final double [ ] ca = c - a ;
    final double [ ] ba = b - a ;
    final int i = Math . inner ( ca , ba ) ;
    final double n = Math . abs ( ca ) * Math . abs ( ba ) ;
    ans . put ( new Double ( a ) , ( Math . PI - Math . acos ( Math . clip ( i / n , - 1 , 1 ) ) ) / ( 2 * Math . PI ) ) ;
  }
  for ( int i = 0 ;
  i < H . length ;
  i ++ ) {
    System . out . println ( ans . get ( new Double ( i ) ) ) ;
  }
  return ans . get