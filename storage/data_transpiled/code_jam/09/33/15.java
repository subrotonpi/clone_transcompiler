static final String getBetterName ( ) throws IOException {
  final BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final PrintWriter fout = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
  final int l = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase < l ;
  testCase ++ ) {
    final int P = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    final int Q = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    final int [ ] frees = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    final HashMap < Integer , Integer > cache = new HashMap < Integer , Integer > ( ) ;
    {
      int lrange = 0 ;
      int rrange = 0 ;
      if ( lid == 0 ) {
        lrange = 1 ;
      }
      else {
        lrange = frees [ lid - 1 ] + 1 ;
      }
      if ( rid == frees . length - 1 ) {
        rrange = P ;
      }
      else {
        rrange = frees [ rid + 1 ] - 1 ;
      }
      return rrange - lrange + 1 ;
    }
  }
  {
    return null ;
  }
}
