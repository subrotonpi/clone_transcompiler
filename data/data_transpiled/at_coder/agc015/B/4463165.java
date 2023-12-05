static final void read ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  {
    final int li = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int li_ = Integer . parseInt ( stdin . readLine ( ) ) - 1 ;
    final float lf = Float . parseFloat ( stdin . readLine ( ) ) ;
    final int ls = stdin . read ( ) ;
    final String ns = stdin . readLine ( ) . replaceAll ( "\\s+" , "" ) ;
    final int lc = Collections . nCopies ( ns , 0 ) ;
    final int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
    final float nf = Float . parseFloat ( stdin . readLine ( ) ) ;
    final String s = ns ;
    final int n = s . length ( ) ;
    int ans = 0 ;
    for ( int idx = 0 ;
    idx < n ;
    idx ++ ) {
      final char si = s . charAt ( idx ) ;
      if ( si == 'U' ) {
        ans += ( n - idx - 1 ) + 2 * idx ;
      }
      else {
        ans += 2 * ( n - idx - 1 ) + idx ;
      }
    }
    System . out . println ( ans ) ;
  }
}
