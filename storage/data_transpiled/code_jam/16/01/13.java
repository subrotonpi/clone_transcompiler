public static final String getDigsFileName ( ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( sys . argv [ 0 ] ) ) ;
  PrintWriter fout = new PrintWriter ( new FileWriter ( "p1.out" ) ) ;
  /* find digs */
  List < Integer > l = new ArrayList < Integer > ( ) ;
  while ( N > 0 ) {
    l . add ( N % 10 ) ;
    N /= 10 ;
  }
  /* find the first digit in the list */
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int tt : xrange ( T ) ) {
    int N = Integer . parseInt ( fin . readLine ( ) ) ;
    int ans = 0 ;
    if ( N == 0 ) {
      ans = "INSOMNIA" ;
    }
    else {
      Set < Integer > digs = new HashSet < Integer > ( ) ;
      digs . addAll ( findDigs ( N ) ) ;
      int i = 1 ;
      while ( digs . size ( ) != 10 ) {
        i ++ ;
        digs . addAll ( findDigs ( i * N ) ) ;
      }
      ans = i * N ;
    }
    fout . println ( "Case #" + ( tt + 1 ) + ": " + ans ) ;
  }
  return fout . toString ( ) ;
}
