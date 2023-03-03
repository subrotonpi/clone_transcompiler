public static double A = input ( ) {
  double tmp , B = input ( ) , K = input ( ) , L = input ( ) ;
  int cnt = 0 ;
  double ans = Double . MAX_VALUE ;
  do {
    if ( K >= L * cnt ) tmp = ( K - L * cnt ) * A + cnt * B ;
    else tmp = cnt * B ;
    ans = Math . min ( ans , tmp ) ;
    if ( L * cnt > K ) break ;
    cnt ++ ;
  }
  while ( true ) ;
  return ans ;
}
