static public double [ ] findsol ( int K , int C , int S ) throws IOException {
  final int K , C , S ;
  int [ ] a ;
  int flag = 0 ;
  for ( int ii = 0 ;
  ii < S ;
  ++ ii ) {
    final int [ ] tmp = new int [ C ] ;
    for ( int jj = 0 ;
    jj < C ;
    ++ jj ) {
      int x = ii * C + jj ;
      if ( ( x >= K ) && ( x <= K ) ) {
        x = K - 1 ;
        flag = 1 ;
      }
      tmp [ jj ] = x ;
    }
    int tmp2 = 0 ;
    for ( int jj = 0 ;
    jj < tmp . length ;
    ++ jj ) tmp2 = K * tmp2 + tmp [ jj ] ;
    a [ 0 ] = tmp2 + 1 ;
    if ( ( flag == 1 ) && ( tmp [ jj ] == ' ' ) ) {
      break ;
    }
  }
  return a ;
}
