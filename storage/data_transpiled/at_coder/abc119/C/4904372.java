static void solve ( int N , int A , int B , int C ) {
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L [ i ] = Integer . parseInt ( input ( ) ) ;
  int MIN = 99999999999 ;
  {
    if ( k == N ) {
      if ( ! ( an == 0 || bn == 0 || cn == 0 ) ) {
        MIN = Math . min ( MIN , Math . abs ( A - a ) + Math . abs ( B - b ) + Math . abs ( C - c ) + 10 * ( an + bn + cn - 3 ) ) ;
      }
      return ;
    }
    else {
      solve ( a + L [ k ] , b , c , an + 1 , bn , cn , k + 1 ) ;
      solve ( a , b , c + L [ k ] , an , bn , cn + 1 , k + 1 ) ;
    }
  }
}
