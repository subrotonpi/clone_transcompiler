public static void for ( int x = 1 ;
x <= Integer . MAX_VALUE ;
x ++ ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] sums = copyOf ( Ints . fromCharArray ( input . nextLine ( ) ) ) ;
  int [ ] a = new int [ K ] ;
  int t = sums [ 0 ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int b = 0 ;
    int c = 0 ;
    for ( int j = i ;
    j < N - K ;
    j += K ) {
      c += sums [ j + 1 ] - sums [ j ] ;
      if ( c > a [ i ] ) {
        a [ i ] = c ;
      }
      else if ( c < b ) {
        b = c ;
      }
    }
    a [ i ] -= b ;
    t += b ;
  }
  t %= K ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    int bestj = 0 ;
    for ( int j = 1 ;
    j < K ;
    j ++ ) {
      if ( a [ j ] < a [ bestj ] ) {
        bestj = j ;
      }
    }
    a [ bestj ] ++ ;
  }
  int y = Collections . max ( a ) ;
  System . out . println ( "Case #" + x + ":" + y ) ;
}
