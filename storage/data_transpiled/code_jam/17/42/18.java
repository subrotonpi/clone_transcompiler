public static void IN ( Scanner in ) throws IOException {
  PrintStream out = new PrintStream ( new FileOutputStream ( "output.txt" ) ) ;
  int NUM_TESTS = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int test : xrange ( NUM_TESTS ) ) {
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    int C = Integer . parseInt ( in . nextLine ( ) ) ;
    int M = Integer . parseInt ( in . nextLine ( ) ) ;
    int [ ] [ ] T = new int [ xrange ( C ) ] [ N ] ;
    for ( int i = 0 ;
    i < xrange ( M ) ;
    i ++ ) {
      int p = Integer . parseInt ( in . nextLine ( ) ) ;
      int b = Integer . parseInt ( in . nextLine ( ) ) ;
      T [ b - 1 ] [ p - 1 ] ++ ;
    }
    int [ ] SumForC = Arrays . copyOf ( T , N ) ;
    int [ ] SumForP = Arrays . copyOf ( SumForP , N ) ;
    int [ ] CumForP = new int [ N ] ;
    CumForP [ 0 ] = SumForP [ 0 ] ;
    for ( int i : xrange ( 1 , N ) ) {
      CumForP [ i ] = CumForP [ i - 1 ] + SumForP [ i ] ;
    }
    for ( int i : xrange ( 0 , N ) ) {
      CumForP [ i ] += i ;
      CumForP [ i ] /= i + 1 ;
    }
    int best = Math . max ( Math . max ( SumForC , CumForP ) , CumForP ) ;
    int promotion = 0 ;
    for ( int i : xrange ( 1 , N ) ) {
      promotion += Math . max ( 0 , SumForP [ i ] - best ) ;
    }
    out . println ( "Case #" + ( test + 1 ) + ": " + best + " " + promotion ) ;
    System . out . println ( test + 1 + " " + promotion ) ;
  }
  in . close ( ) ;
  out . close ( ) ;
}
