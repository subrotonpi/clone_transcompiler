static final void setIn ( ) {
  final InputStream stdin = System . in ;
  System . setIn ( stdin ) ;
  {
    final int li = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int li_ = Integer . parseInt ( stdin . readLine ( ) ) - 1 ;
    final float lf = Float . parseFloat ( stdin . readLine ( ) ) ;
    final int ls = stdin . read ( ) ;
    final String ns = stdin . readLine ( ) . replaceAll ( "\\s+" , "" ) ;
    final int lc = Collections . frequency ( ns , Integer . parseInt ( stdin . readLine ( ) ) ) ;
    final int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
    final float nf = Float . parseFloat ( stdin . readLine ( ) ) ;
    @ SuppressWarnings ( "unchecked" ) final int n = ni ;
    final List < Integer > a = Collections . nCopies ( li , n ) ;
    final Map < Integer , Float > cnt = new HashMap < > ( a ) ;
    int ans = 0 ;
    for ( Map . Entry < Integer , Float > e : cnt . entrySet ( ) ) {
      if ( e . getValue ( ) < k ) {
        ans += e . getValue ( ) ;
      }
      else if ( e . getValue ( ) > k ) {
        ans += ( e . getValue ( ) - k . getKey ( ) ) ;
      }
    }
    System . out . println ( ans ) ;
  }
}
