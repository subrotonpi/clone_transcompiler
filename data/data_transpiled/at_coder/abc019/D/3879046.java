static final void setIn ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
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
  String [ ] ns = stdin . readLine ( ) . split ( " " ) ;
  /* lc */
  Collections . sort ( ns ) ;
  /* lc */
}
