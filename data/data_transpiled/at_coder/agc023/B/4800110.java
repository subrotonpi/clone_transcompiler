static int N = Integer . parseInt ( input ) {
  int [ ] [ ] S = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] [ i ] = input . nextInt ( ) ;
  }
  /*for(int i=0; i<N; i++){
  for(int j=i+1; j<N; j++){
  if(S[i][j]!=S[j][i]){return0;}}}*/
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cnt += check ( S , i , S [ i ] [ 0 ] , 0 , 0 ) ;
  }
  System . out . println ( cnt * N ) ;
  return cnt ;
}
