public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] R = input . split ( " " ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      if ( Integer . parseInt ( R [ i ] ) < Integer . parseInt ( R [ j ] ) ) {
        int tmp = R [ i ] ;
        R [ i ] = R [ j ] ;
        R [ j ] = tmp ;
      }
    }
  }
  R = R [ 0 ] ;
  R [ K ] = R [ K ] ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) sum += Integer . parseInt ( R [ i ] ) * 2 * K ;
  sum /= 2 * K ;
  System . out . println ( sum ) ;
  return K ;
}
