public static void print ( InputStream in ) throws IOException {
  PrintWriter of = new PrintWriter ( new FileOutputStream ( "C-small.out" ) ) ;
  BufferedReader br = new BufferedReader ( new InputStreamReader ( in ) ) ;
  int cases = Integer . parseInt ( br . readLine ( ) ) ;
  int line = 1 ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    int i = 0 ;
    int j = 0 ;
    int c = 0 ;
    boolean ok = true ;
    while ( ok && i + j < n ) {
      for ( int ii = 0 ;
      ii < sz + 1 ;
      ii ++ ) {
        switch ( i + j ) {
          case 2 : ok = false ;
          break ;
          case 7 : ok = false ;
          break ;
          case 8 : ok = false ;
          break ;
          case 9 : ok = false ;
          break ;
          case 10 : ok = true ;
          break ;
          case 11 : ok = false ;
          break ;
          case 12 : ok = false ;
          break ;
          case 13 : ok = false ;
          break ;
          case 14 : ok = false ;
          break ;
          case 15 : ok = false ;
          break ;
          case 16 : ok = false ;
          break ;
          case 17 : ok = false ;
          break ;
          case 18 : ok = false ;
          break ;
          case 19 : ok = false ;
          break ;
          case 20 : ok = false ;
          break ;
          case 21 : ok = false ;
          break ;
          case 22 : ok = false ;
          break ;
          case 23 : ok = false ;
          break ;
          case 24 : ok = false ;
          break ;
          case 24 : ok = false ;
          break ;
          case 25 : ok = false ;
          break ;
          case 26 : ok = false ;
          break ;
          case 27 : ok = false ;
          break ;
          case 28 : ok = false ;
          break ;
          case 29 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          case 30 : ok = false ;
          break ;
          