public static int N = Integer . parseInt ( input ) {
  int min_ = 100000 ;
  for ( int i = 1 ;
  i <= N / 2 ;
  i ++ ) {
    int j = N - i ;
    int sum_i = 0 ;
    int sum_j = 0 ;
    int tmp_i = i ;
    int tmp_j = j ;
    while ( tmp_i > 0 ) {
      sum_i += tmp_i % 10 ;
      tmp_i = tmp_i / 10 ;
    }
    while ( tmp_j > 0 ) {
      sum_j += tmp_j % 10 ;
      tmp_j = tmp_j / 10 ;
    }
    min_ = Math . min ( min_ , sum_i + sum_j ) ;
  }
  return min_ ;
}
