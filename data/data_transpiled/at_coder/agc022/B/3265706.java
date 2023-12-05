@ VisibleForTesting static LinkedHashMap < String , String > map ( String input ) {
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * 9 + 7 ;
  final double eps = 10 * - 7 ;
  final int N = Integer . parseInt ( input ) ;
  final int [ ] ans3 = new int [ 5000 ] ;
  final int [ ] ans2 = new int [ 15000 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans3 [ i ] = 3 * ( i * 2 + 1 ) ;
    ans2 [ i ] = 2 * ( i + 1 ) ;
  }
  if ( N == 3 ) {
    System . out . println ( 2 , 5 , 63 ) ;
  }
  else if ( N == 4 ) {
    System . out . println ( 2 , 5 , 20 , 63 ) ;
  }
  else if ( N == 6 ) {
    System . out . println ( 3 , 6 , 9 , 12 , 2 , 4 ) ;
  }
  else if ( N == 19999 ) {
    final String ans = ans2 [ 0 ] + ans3 [ 1 ] ;
    System . out . println ( Arrays . toString ( ans . split ( " " ) ) ) ;
  }
  else {
    for ( int x = 1 ;
    x < 2501 ;
    x ++ ) {
      if ( ( N - x * 2 ) % 3 == 0 ) {
        final int y = ( N - x * 2 ) / 3 ;
        if ( 1 <= y && y <= 5000 ) {
          final String ans = ans3 [ 0 ] + ans2 [ y ] ;
          break ;
        }
      }
    }
    System . out . println ( Arrays . toString ( ans . split ( " " ) ) ) ;
  }
  return new LinkedHashMap < > ( ) ;
}
