static final void setIn ( ) {
  stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  map ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* li */
  map ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* li */
  map ( Integer . parseInt ( stdin . readLine ( ) ) - 1 ) ;
  /* lf */
  map ( Double . parseDouble ( stdin . readLine ( ) ) ) ;
  /* ls */
  String [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  /* ns */
  String [ ] ns = stdin . readLine ( ) . trim ( ) ;
  /* lc */
  Collections . sort ( ns ) ;
  /* ni */
  int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* nf */
  @ SuppressWarnings ( "unchecked" ) int n = ( int ) ns . length ;
  /* n */
  int [ ] cnt = s . toArray ( ) ;
  int ans = 1 ;
  int mod = 10 * 9 + 7 ;
  for ( Map . Entry < Integer , Integer > e : cnt ) {
    ans *= ( e . getValue ( ) + 1 ) ;
    ans %= mod ;
  }
  ans -- ;
  if ( ans < 0 ) ans += mod ;
  System . out . println ( ans ) ;
}
