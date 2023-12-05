static final void setIn ( ) {
  stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  map ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* li_ */
  map ( Integer . parseInt ( stdin . readLine ( ) ) - 1 ) ;
  /* lf */
  map ( Double . parseDouble ( stdin . readLine ( ) ) ) ;
  /* ls */
}
