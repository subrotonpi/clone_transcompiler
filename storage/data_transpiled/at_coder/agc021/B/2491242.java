@ VisibleForTesting static double [ ] [ ] solve ( ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final double [ ] [ ] H = new double [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) H [ i ] = new double [ n ] ;
  for ( int j = 0 ;
  j < n ;
  ++ j ) H [ i ] [ j ] = Double . parseDouble ( input . nextLine ( ) ) ;
  if ( n == 1 ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  final List < Integer > convex = new ArrayList < > ( ) ;
  convex . add ( Collections . min ( H , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 - o2 ;
    }
  }
  ) ) ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    int a = ( H [ 0 ] != convex . get ( i ) ) ? H [ 0 ] : H [ i ] ;
    for ( int b : H ) {
      final int ac = a - convex . get ( i - 1 ) ;
      final int bc = b - convex . get ( i - 1 ) ;
      final int cross_ = Math . min ( ac , bc ) ;
      if ( cross_ < 0 || ( cross_ == 0 && Math . abs ( ac ) < Math . abs ( bc ) ) ) a = b ;
    }
    if ( ( a == convex . get ( 0 ) ) ) break ;
    convex . add ( a ) ;
  }
  final Map < Double , Double > ans = new TreeMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    final int c = convex . get ( i - 1 ) ;
    final int a = convex . get ( i + 1 ) ;
    final int b = convex . get ( i + 1 ) ;
    final int [ ] ca = c - a ;
    final int [ ] ba = b - a ;
    final int i = Math . inner ( ca , ba ) ;
    final double n = Math . abs ( ca ) * Math . abs ( ba ) ;
    ans . put ( new Double ( a ) , ( Math . PI - Math . acos ( Math . clip ( i / n , - 1 , 1 ) ) ) / ( 2 * Math . PI ) ) ;
  }
  for ( int i = 0 ;
  i < H . size ( ) ;
  ++ i