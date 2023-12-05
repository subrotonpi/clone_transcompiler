@ GwtIncompatible ( "java.util.concurrent.atomic.Scanner" ) public static < T > void main ( String [ ] args ) throws IOException {
  FileInputStream fis = new FileInputStream ( "B-large.in" ) ;
  FileOutputStream ff = new FileOutputStream ( "output" ) ;
  int readInt = Integer . parseInt ( fis . readLine ( ) ) ;
  int readIntArray = Integer . parseInt ( fis . readLine ( ) ) ;
  int T = readInt ;
  /* simulate the number of times */
  Map < Integer , int [ ] > result = new HashMap < > ( ) ;
  result . put ( 0 , pi ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Map < Integer , int [ ] > newresult = new HashMap < > ( ) ;
    for ( int s : result . keySet ( ) ) {
      int [ ] teams = result . get ( s ) ;
      for ( int ti = 0 ;
      ti < teams . length ;
      ti += 2 ) {
        if ( teams [ ti ] < teams [ ti + 1 ] ) {
          newresult . get ( 2 * s ) [ s ] = teams [ ti ] ;
          newresult . get ( 2 * s + 1 ) [ s + 1 ] = teams [ ti + 1 ] ;
        }
        else {
          newresult . get ( 2 * s + 1 ) [ s ] = teams [ ti ] ;
          newresult . get ( 2 * s + 1 ) [ s + 1 ] = teams [ ti + 1 ] ;
        }
      }
      result = newresult ;
    }
    int [ ] rtn = new int [ 2 * N ] ;
    for ( int i = 0 ;
    i < 2 * N ;
    i ++ ) {
      rtn [ result . get ( i ) [ 0 ] ] = i ;
    }
  }
  /* func */
  int r = 1 ;
  if ( n == 0 ) {
    return r ;
  }
  int S = 1 ;
  int L = 2 * ( N - 1 ) ;
  while ( true ) {
    if ( n < S ) {
      return r ;
    }
    S += L ;
    L /= 2 ;
    r *= 2 ;
  }
  /* func2 */
  int func2 = N2 - func ( N2 - n - 1 , N ) + 1 ;
  /* bi */
  int x1 = ( x1 + 1 ) / 2 ;
  int x2 = ( x2 + 1 ) / 2 ;
  if ( fn ( y , N ) > P ) {
    System . out . println ( bi ( P , N , x1