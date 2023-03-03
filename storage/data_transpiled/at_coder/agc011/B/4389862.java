static final void setIn ( ) {
  stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  map ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* li_ */
  map ( Integer . parseInt ( stdin . readLine ( ) ) - 1 ) ;
  /* lf */
  map ( Float . parseFloat ( stdin . readLine ( ) ) ) ;
  /* ls */
  String [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  /* ns */
  String [ ] ns = stdin . readLine ( ) . split ( " " ) ;
  /* lc */
  list ( ns ) ;
  /* ni */
  int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* nf */
  @ SuppressWarnings ( "unused" ) int n = ni ;
  int [ ] a = list ( li ) ;
  Arrays . sort ( a ) ;
  int [ ] acc = list ( acc ) ;
  int ans = 0 ;
  for ( int i = a . length - 1 ;
  i >= 0 ;
  i -- ) {
    int ai = a [ i ] ;
    int acci = acc [ i ] ;
    if ( 2 * acci >= ai ) {
      ans ++ ;
    }
    else {
      break ;
    }
  }
  System . out . println ( ans + 1 ) ;
}
