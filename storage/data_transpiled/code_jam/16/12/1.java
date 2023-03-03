public static final String [ ] getTimes ( ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( sys . argv [ 0 ] ) ) ;
  PrintWriter fout = new PrintWriter ( new FileWriter ( "p2.out" ) ) ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int tt = xrange ( T ) ;
  tt < N ;
  tt ++ ) {
    int N = Integer . parseInt ( fin . readLine ( ) ) ;
    Map < String , Integer > times = new HashMap < String , Integer > ( ) ;
    for ( int i = xrange ( 2 * N - 1 ) ;
    i < N ;
    i ++ ) {
      int [ ] info = Integer . parseInt ( fin . readLine ( ) ) . split ( " " ) ;
      for ( String s : info ) {
        if ( ! times . containsKey ( s ) ) {
          times . put ( s , 1 ) ;
        }
        else {
          times . get ( s ) ++ ;
        }
      }
    }
    List < String > ans = new ArrayList < String > ( ) ;
    for ( String s : times . keySet ( ) ) {
      if ( times . get ( s ) % 2 == 1 ) {
        ans . add ( s ) ;
      }
    }
    ans = StringUtils . sortByCommaSeparatedString ( ans ) ;
    fout . println ( "Case #" + ( tt + 1 ) + ": " + ans ) ;
  }
  return ans . toArray ( new String [ 0 ] ) ;
}
