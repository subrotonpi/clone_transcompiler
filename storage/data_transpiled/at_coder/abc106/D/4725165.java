public static int [ ] [ ] getSumVector ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  int [ ] [ ] sumV = new int [ 505 ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int l = Integer . parseInt ( input ) ;
    int r = Integer . parseInt ( input ) ;
    sumV [ l ] [ r ] ++ ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    for ( int j = 1 ;
    j <= N ;
    j ++ ) {
      sumV [ i ] [ j ] += sumV [ i - 1 ] [ j ] ;
      sumV [ i ] [ j ] += sumV [ i ] [ j - 1 ] ;
      sumV [ i ] [ j ] -= sumV [ i - 1 ] [ j - 1 ] ;
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int p = Integer . parseInt ( input ) ;
    int q = Integer . parseInt ( input ) ;
    int ans = sumV [ q ] [ q ] ;
    ans -= sumV [ q ] [ p - 1 ] ;
    ans -= sumV [ p - 1 ] [ q ] ;
    ans += sumV [ p - 1 ] [ p - 1 ] ;
    System . out . println ( ans ) ;
  }
  return sumV ;
}
