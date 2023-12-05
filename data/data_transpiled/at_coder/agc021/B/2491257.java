@ VisibleForTesting static Map < Integer , Double > cross ( ) {
  final CrossFunction cross = CrossFunction . identity ( ) ;
  final int n = Integer . parseInt ( input ( ) ) ;
  final int [ ] H = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    H [ i ] = Integer . parseInt ( input ( ) . split ( " " ) [ 0 ] ) ;
  }
  if ( n == 1 ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  final int [ ] convex = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    int a = ( H [ 0 ] != convex [ i ] ) ? H [ 0 ] : H [ i ] ;
    for ( int b : H ) {
      final int ac = a - convex [ i ] ;
      final int bc = b - convex [ i ] ;
      final int cross_ = cross . apply ( ac , bc ) ;
      if ( cross_ < 0 || ( cross_ == 0 && Math . abs ( ac ) < Math . abs ( bc ) ) ) {
        a = b ;
      }
    }
    if ( ( a == convex [ 0 ] ) && ( b == convex [ i ] ) ) {
      break ;
    }
    convex [ i ] = a ;
  }
  final Map < Integer , Double > ans = new TreeMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    final int c = convex [ i ] , a = convex [ i ] , b = convex [ i ] ;
    final int [ ] ca = c - a ;
    final int [ ] ba = b - a ;
    final int i = Math . inner ( ca , ba ) ;
    final double n = Math . abs ( ca ) * Math . abs ( ba ) ;
    ans . put ( new Integer ( a ) , ( Math . PI - Math . acos ( Math . clip ( i / n , - 1 , 1 ) ) ) / ( 2 * Math . PI ) ) ;
  }
  for ( int i = 0 ;
  i < H . length ;
  ++ i ) {
    System . out . println ( ans . get ( new Integer ( i ) ) ) ;
  }
  return ans ;
}
