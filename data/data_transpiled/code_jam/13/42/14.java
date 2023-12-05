@ Test ( description = "B-large" ) public static String code ( ) throws IOException {
  String in = code + ".in" ;
  String out = code + ".out" ;
  /* Take the first two sides of the file and return the result */
  int pos = 0 ;
  for ( int i : xrange ( n ) ) {
    if ( s > 0 ) {
      pos += 2 * ( n - i - 1 ) ;
      s = ( s - 1 ) / 2 ;
    }
  }
  /* Take the second two sides of the file and return the result */
  int pos = 0 ;
  for ( int i : xrange ( n ) ) {
    if ( w > 0 ) {
      w = ( w - 1 ) / 2 ;
    }
    else {
      pos += 2 * ( n - i - 1 ) ;
    }
  }
  /* Solve the first two sides of the file */
  if ( p == 2 * n ) return p - 1 ;
  int low = 0 , high = 2 * n - 1 ;
  while ( high - low > 1 ) {
    int mid = ( low + high ) / 2 ;
    if ( willWin ( n , mid ) < p ) low = mid ;
    else high = mid ;
  }
  /* Return the result */
  int will = low ;
  low = 0 ;
  high = 2 * n - 1 ;
  while ( high - low > 1 ) {
    int mid = ( low + high ) / 2 ;
    if ( mayWin ( n , 2 * n - mid - 1 ) < p ) low = mid ;
    else high = mid ;
  }
  /* Return the result */
  String [ ] lines = new String [ c ] ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    lines [ i ] = lines [ i ] . trim ( ) ;
  }
  int c = Integer . parseInt ( lines [ 0 ] ) ;
  PrintWriter pw = new PrintWriter ( out ) ;
  int lineno = 1 ;
  for ( int i = 1 ;
  i <= c ;
  i ++ ) {
    int n = Integer . parseInt ( lines [ lineno ] ) ;
    int p = Integer . parseInt ( lines [ lineno ] ) ;
    int r = solve ( n , p ) ;
    lineno ++ ;
    String msg = "Case #" + i + ": " + r + " " + msg ;
    pw . println