static void testCase ( String [ ] args ) {
  List < Integer > list = Arrays . stream ( args ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
  assert list . size ( ) == list . get ( 0 ) + 1 ;
  int [ ] points = list . subList ( 1 , list . size ( ) ) ;
  int X = Integer . parseInt ( args [ 0 ] ) ;
  int N = points . length ;
  int total = 2 * X ;
  double soll = total / ( double ) N ;
  int [ ] result = new int [ N ] ;
  boolean flag = true ;
  while ( flag ) {
    flag = false ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int p = points [ i ] ;
      if ( result [ i ] == 0 && p >= soll ) {
        result [ i ] = 0 ;
        N -- ;
        total -= p ;
        soll = total / ( double ) N ;
        flag = true ;
      }
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int p = points [ i ] ;
    if ( result [ i ] == 0 ) {
      result [ i ] = ( total / ( double ) N - p ) / X * 100 ;
    }
  }
  if ( Class . isPrimitive ( String . class ) ) {
    int n = Integer . parseInt ( args [ 0 ] ) ;
    for ( int i : xrange ( n ) ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + testCase ( ) ) ;
    }
  }
}
