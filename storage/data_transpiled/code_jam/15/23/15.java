static final String getTempFile ( ) throws IOException {
  System . nanoTime ( ) ;
  System . setIn ( new FileInputStream ( "C-small-1-attempt0.in" ) ) ;
  System . setOut ( new PrintStream ( "C-small-1-attempt0.out" ) ) ;
  /* Work through the input file */
  int n = Integer . parseInt ( input . readLine ( ) . trim ( ) ) ;
  Pair [ ] sb = new Pair [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int d = Integer . parseInt ( input . readLine ( ) . trim ( ) ) ;
    int h = Integer . parseInt ( input . readLine ( ) . trim ( ) ) ;
    int m = Integer . parseInt ( input . readLine ( ) . trim ( ) ) ;
    for ( int j = 0 ;
    j < h ;
    j ++ ) sb [ i ] = new Pair ( d , 360 / ( m + j ) ) ;
  }
  Arrays . sort ( sb , new Comparator < Pair > ( ) {
    @ Override public int compare ( Pair o1 , Pair o2 ) {
      if ( o1 . second == o2 . second ) return 0 ;
      double ar1 = ( 360 - o1 . first ) / o1 . second ;
      double meet = ( 360 + o1 . first - o2 . first ) / ( o2 . first - o2 . first ) ;
      if ( meet <= ar1 + 1e-8 ) return 1 ;
      return 0 ;
    }
  }
  ) ;
  if ( className . equals ( "java.util.concurrent.atomic.AtomicInteger" ) ) {
    int T = Integer . parseInt ( input . readLine ( ) ) ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) System . out . println ( "Case #" + ( i + 1 ) + ": " + ( ( i + 1 ) ) ) ;
    System . err . printf ( "completed %.3f\n" , System . nanoTime ( ) ) ;
  }
  return null ;
}
