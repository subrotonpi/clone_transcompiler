public static int [ ] [ ] solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > A = Arrays . asList ( Integer . parseInt ( input . nextLine ( ) ) . split ( " " ) ) ;
  int a = max ( A ) ;
  int b = min ( A ) ;
  if ( b >= 0 ) {
    final int [ ] [ ] ans = new int [ N ] [ N ] ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      ans [ i ] [ 0 ] = i ;
    }
    System . out . println ( N - 1 ) ;
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      System . out . println ( a + " " + a ) ;
    }
    System . exit ( 0 ) ;
  }
  if ( a <= 0 ) {
    final int [ ] [ ] ans = new int [ N ] [ N ] ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      ans [ i ] [ 0 ] = N - i + 1 ;
    }
    System . out . println ( N - 1 ) ;
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      System . out . println ( a + " " + a ) ;
    }
    System . exit ( 0 ) ;
  }
  final int x = A . indexOf ( a ) + 1 ;
  final int y = A . indexOf ( b ) + 1 ;
  if ( Math . abs ( a ) >= Math . abs ( b ) ) {
    final int [ ] [ ] ans = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      ans [ i ] [ 0 ] = x ;
    }
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      ans [ i ] [ 1 ] = i ;
    }
    System . out . println ( 2 * N - 1 ) ;
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      System . out . println ( a + " " + a ) ;
    }
    System . exit ( 0 ) ;
  }
  if ( Math . abs ( b ) > Math . abs ( a ) ) {
    final int [ ] [ ] ans = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      ans [ i ] [ 0 ] = y ;
    }
    for ( int i = 1 ;
    i < N