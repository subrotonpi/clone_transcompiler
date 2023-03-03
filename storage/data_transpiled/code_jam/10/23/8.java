static final String getWordString ( ) throws IOException {
  System . setProperty ( "line.separator" , " " ) ;
  BufferedReader fin = new BufferedReader ( new FileReader ( "input.txt" ) ) ;
  PrintWriter fout = new PrintWriter ( new FileWriter ( "output.txt" ) ) ;
  int N = 510 ;
  int MOD = 100003 ;
  int [ ] line = new int [ N ] ;
  line [ 0 ] = - 1 ;
  int [ ] [ ] mC = new int [ N ] [ N ] ;
  for ( int i : xrange ( N ) ) mC [ i ] [ 0 ] = line . clone ( ) ;
  int [ ] [ ] mAns1 = new int [ N ] [ N ] ;
  for ( int i : xrange ( N ) ) mAns1 [ i ] = line . clone ( ) ;
  /* C */
  if ( k > n ) return 0 ;
  if ( k < 0 ) return 0 ;
  if ( n < 0 ) return 0 ;
  if ( mC [ n ] [ k ] == - 1 ) {
    if ( n == k ) mC [ n ] [ k ] = 1 ;
    else if ( k == 0 ) mC [ n ] [ k ] = 1 ;
    else mC [ n ] [ k ] = ( C ( n - 1 , k - 1 ) + C ( n - 1 , k ) ) % MOD ;
  }
  /* ans */
  if ( mAns1 [ n ] [ s ] == - 1 ) {
    if ( s >= n ) mAns1 [ n ] [ s ] = 0 ;
    else if ( s == n - 1 ) mAns1 [ n ] [ s ] = 1 ;
    else if ( s == 1 ) mAns1 [ n ] [ s ] = 1 ;
    else {
      int res = 0 ;
      for ( int s1 : xrange ( 1 , s ) ) res = ( res + ans1 ( s , s1 ) * C ( n - s - 1 , s - s1 - 1 ) ) % MOD ;
      mAns1 [ n ] [ s ] = res % MOD ;
    }
  }
  /* ans */
  int nt = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
  for ( int t : xrange ( nt ) ) {
    int n = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    System . out . println ( fout . next ( ) + "Case #" + ( t + 1