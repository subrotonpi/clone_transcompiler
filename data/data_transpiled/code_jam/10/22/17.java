@ Sys public static void Sys ( ) throws IOException {
  int C = Integer . parseInt ( stdin . readLine ( ) ) ;
  for ( int x = 1 ;
  x <= C ;
  x ++ ) {
    final int N = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int K = Integer . parseInt ( stdin . readLine ( ) ) ;
    final double B = Double . parseDouble ( stdin . readLine ( ) ) ;
    final double T = Double . parseDouble ( stdin . readLine ( ) ) ;
    final int [ ] Xi = new int [ K ] ;
    final int [ ] Vi = new int [ K ] ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      Xi [ i ] = Integer . parseInt ( stdin . readLine ( ) ) ;
    }
    final int [ ] Vi = new int [ K ] ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      Vi [ i ] = Integer . parseInt ( stdin . readLine ( ) ) ;
    }
    assert ( Xi . length == Vi . length == N ) ;
    int i = 0 ;
    int S = 0 ;
    while ( i < K ) {
      final int k = N - i - 1 ;
      for ( int j = k ;
      j >= 0 ;
      j -- ) {
        if ( Xi [ j ] + Vi [ j ] * T >= B ) break ;
      }
      if ( Xi [ j ] + Vi [ j ] * T < B ) break ;
      ( Xi [ k ] + Vi [ j ] ) . start ( ) ;
      S += ( k - j ) ;
      i ++ ;
    }
    if ( i < K ) stdout . printf ( "Case #%i: IMPOSSIBLE\n" , x ) ;
    else stdout . printf ( "Case #%i: %i\n" , x , S ) ;
  }
}
