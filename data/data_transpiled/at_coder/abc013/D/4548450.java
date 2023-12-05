public static int [ ] [ ] [ ] createList ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  int [ ] [ ] [ ] B = new int [ N ] [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = new int [ N ] [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      B [ i ] [ j ] = new int [ N ] ;
      for ( int k = 0 ;
      k < M ;
      k ++ ) {
        B [ i ] [ j ] = new int [ N ] ;
        for ( int k = 0 ;
        k < N ;
        k ++ ) {
          B [ i ] [ j ] = new int [ N ] ;
          for ( int k = 0 ;
          k < M ;
          k ++ ) {
            B [ i ] [ j ] = new int [ N ] ;
            for ( int k = 0 ;
            k < N ;
            k ++ ) {
              B [ i ] [ j ] = new int [ N ] ;
            }
            answer = new int [ N ] ;
            int x = 0 ;
            int check = 0 ;
            for ( int k = 0 ;
            k < N ;
            k ++ ) {
              answer [ x ] = answer [ k ] ;
            }
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
            answer [ x ] = new int [ N ] ;
          }
          answer [ x ] = new int [ N ] ;
          answer [ x ] = new int [ N ] ;
          answer [ x ] = new int [ N ] ;
        }
        answer [ x ] = new int [ N ] ;
      }
    }
  }
  return B ;
}
