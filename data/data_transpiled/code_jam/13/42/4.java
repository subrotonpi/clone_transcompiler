public static int T = Integer . parseInt ( input ) {
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    int N = Integer . parseInt ( input . readLine ( ) ) , P = Integer . parseInt ( input . readLine ( ) ) ;
    int step = ( 1 << N ) ;
    int answer = 0 ;
    while ( step > 0 ) {
      if ( answer + step < ( 1 << N ) ) {
        answer += step ;
        int aux = answer ;
        int rounds = 0 ;
        int position = 0 ;
        while ( aux >= ( 1 << rounds ) ) {
          aux -= ( 1 << rounds ) ;
          rounds ++ ;
          position += ( 1 << ( N - rounds ) ) ;
        }
        if ( position >= P ) {
          answer -= step ;
        }
      }
      step >>= 1 ;
    }
    int answer2 = 0 ;
    step = ( 1 << N ) ;
    while ( step > 0 ) {
      if ( answer2 + step < ( 1 << N ) ) {
        answer2 += step ;
        int aux = ( 1 << N ) - answer2 - 1 ;
        int rounds = 0 ;
        int position = ( 1 << N ) - 1 ;
        while ( aux >= ( 1 << rounds ) ) {
          aux -= ( 1 << rounds ) ;
          rounds ++ ;
          position -= ( 1 << ( N - rounds ) ) ;
        }
        if ( position >= P ) {
          answer2 -= step ;
        }
      }
      step >>= 1 ;
    }
    System . out . println ( "Case #" + test + ":" + answer + ":" + answer2 ) ;
  }
  return answer ;
}
