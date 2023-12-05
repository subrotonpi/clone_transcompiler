static int readInteger ( ) throws IOException {
  return Integer . parseInt ( readLine ( ) ) ;
  /* read list of integers */
  int [ ] M = map ( in -> in . readInt ( ) ) ;
  /* solve the number of numbers */
  int N = readInteger ( ) ;
  int [ ] M = readList ( Integer . MAX_VALUE ) ;
  int res1 = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( M [ i ] < M [ i - 1 ] ) {
      res1 += M [ i - 1 ] - M [ i ] ;
    }
  }
  int v = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( M [ i ] < M [ i - 1 ] ) {
      v = Math . max ( v , M [ i - 1 ] - M [ i ] ) ;
    }
  }
  int res2 = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    res2 += Math . min ( v , M [ i ] ) ;
  }
  /* return */
  return res1 + " " + res2 ;
}
