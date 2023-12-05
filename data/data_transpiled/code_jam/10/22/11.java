public static String print ( String s ) {
  final Scanner fin = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  String result ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int N = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int K = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int B = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int T = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int [ ] x = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int [ ] v = Integer . parseInt ( fin . nextLine ( ) ) ;
    final Pair < Integer , Integer > [ ] chicks = new Pair [ N ] ;
    for ( int i = 0 ;
    i < x . length ;
    i ++ ) {
      x [ i ] = x [ i ] ;
      v [ i ] = v [ i ] ;
    }
    Arrays . sort ( chicks , Collections . reverseOrder ( ) ) ;
    int slow_counter = 0 ;
    int swap_counter = 0 ;
    int safe_counter = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final Pair < Integer , Integer > c = chicks [ i ] ;
      if ( c . first + c . second * T >= B ) {
        swap_counter += slow_counter ;
        safe_counter ++ ;
      }
      else {
        slow_counter ++ ;
      }
      if ( safe_counter >= K ) break ;
    }
    if ( safe_counter >= K ) result = swap_counter ;
    else result = "IMPOSSIBLE" ;
    System . out . println ( "Case #" + testCase + ": " + result ) ;
  }
  return result ;
}
