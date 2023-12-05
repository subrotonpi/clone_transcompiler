public static final String getStdOut ( ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( sys . argv [ 0 ] ) ) ;
  PrintWriter fout = new PrintWriter ( "p3.out" ) ;
  fin . readLine ( ) ;
  int N = Integer . parseInt ( fin . readLine ( ) ) ;
  int J = Integer . parseInt ( fin . readLine ( ) ) ;
  fout . println ( "Case #1:" ) ;
  /* Convert the list to a number */
  int [ ] convBase = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int ret = 1 + base * ( N - 1 ) ;
    ret += Integer . pow ( 2 , i ) ;
  }
  /* Convert the list to a number */
  int [ ] lcp = new int [ N ] ;
  for ( int n : xrange ( 2 , Math . min ( n , 1000 ) ) ) {
    for ( int m : xrange ( n , 1000 ) ) {
      if ( n % m == 0 ) {
        return m ;
      }
    }
  }
  /* Convert the list to a number */
  int [ ] ans = new int [ N ] ;
  ans [ 3 ] = 2 ;
  ans [ 4 ] = 3 ;
  ans [ 5 ] = 2 ;
  ans [ 7 ] = 2 ;
  ans [ 9 ] = 2 ;
  ans [ 10 ] = 3 ;
  int [ ] cur = {
    1 , 2 , 3 , 4 }
    ;
    while ( J > 0 ) {
      int j = 3 ;
      for ( int i : xrange ( cur . length - 1 ) ) {
        if ( cur [ i ] + 1 == cur [ i + 1 ] ) {
          continue ;
        }
        else {
          j = i ;
          break ;
        }
      }
      cur [ j ] ++ ;
      for ( int i : xrange ( j ) ) {
        cur [ i ] = i + 1 ;
      }
      ans [ 2 ] = lcp [ convBase [ 2 ] ] ;
      ans [ 6 ] = lcp [ convBase [ 6 ] ] ;
      ans [ 8 ] = lcp [ convBase [ 8 ] ] ;
      if ( ans [ 2 ] < 0 || ans [ 6 ] < 0 || ans [ 8 ] < 0 ) {
        continue ;
      }
      else {
        J -- ;
        fout . print ( Integer . toString ( convBase [ 10 ] ) + " " ) ;
        for ( int i : xrange ( 2 , 10 ) ) {
          fout