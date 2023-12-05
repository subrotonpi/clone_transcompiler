public static List < Integer > primelist ( int N ) throws IOException {
  List < Integer > ps = new ArrayList < Integer > ( 2 ) ;
  int cur = 3 ;
  for ( ;
  cur < 3 && cur < N ;
  cur ++ ) {
    for ( ;
    ;
    ) {
      int prime = ps . get ( cur ) ;
      if ( prime * prime > cur ) {
        ps . add ( cur ) ;
        break ;
      }
      if ( cur % prime == 0 ) break ;
    }
  }
  /* Run the list of numbers */
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  PrintWriter g = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
  int num = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int i = 0 ;
  i < num ;
  i ++ ) {
    g . print ( "Case #" + ( i + 1 ) + ": " ) ;
    int n = Integer . parseInt ( br . readLine ( ) ) ;
    List < Integer > times = new ArrayList < Integer > ( ) ;
    for ( int p : plist ) {
      if ( p ^ 2 > n ) break ;
      else {
        int count = 0 ;
        int m = n / p ;
        while ( m >= p ) {
          m = m / p ;
          count = count + 1 ;
        }
        if ( count > 0 ) times . add ( count ) ;
      }
    }
    if ( times . size ( ) > 0 ) g . println ( Integer . toBinaryString ( times . size ( ) + 1 ) ) ;
    else if ( n == 1 ) g . println ( "0\n" ) ;
    else g . println ( "1\n" ) ;
  }
  br . close ( ) ;
  g . close ( ) ;
  return ps ;
}
