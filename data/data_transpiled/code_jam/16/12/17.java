static final String solve ( ) throws IOException {
  final BufferedReader fin = null ;
  final Scanner s = new Scanner ( new InputStreamReader ( System . in ) ) ;
  final String fname = "a.in" ;
  final PrintWriter fout = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( new FileOutputStream ( fname + ".out" ) ) ) ) ;
  final long t0 ;
  final int n = s . nextInt ( ) ;
  final int [ ] t = nums ( ) ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    t [ i ] = s . nextInt ( ) ;
    for ( int x = 0 ;
    x < t [ i ] ;
    x ++ ) {
      if ( s . next ( ) != null ) {
        cnts [ s [ i ] ] += 1 ;
      }
      else {
        cnts [ s [ i ] ] = 1 ;
      }
    }
  }
  final StringBuilder res = new StringBuilder ( ) ;
  for ( final Map . Entry < String , Integer > e : cnts . entrySet ( ) ) {
    if ( e . getValue ( ) % 2 == 1 ) {
      res . append ( e . getKey ( ) ) ;
    }
  }
  Collections . sort ( res ) ;
  return res . toString ( ) ;
}
