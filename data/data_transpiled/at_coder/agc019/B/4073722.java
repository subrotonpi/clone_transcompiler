static final void setIn ( ) {
  final InputStream stdin = System . in ;
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
  String [ ] ns = stdin . readLine ( ) . trim ( ) . split ( " " ) ;
  /* lc */
  Collections . sort ( ns ) ;
  /* ni */
  int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* nf */
  @ SuppressWarnings ( "unchecked" ) final List < Integer > a = ( List < Integer > ) ns ;
  int n = a . size ( ) ;
  final Map < Integer , Integer > cnt = a . entrySet ( ) ;
  int eqs = 0 ;
  for ( Map . Entry < Integer , Integer > e : cnt . entrySet ( ) ) {
    eqs += e . getValue ( ) * ( e . getValue ( ) - 1 ) / 2 ;
  }
  System . out . println ( 1 + n * ( n - 1 ) / 2 - eqs ) ;
}
