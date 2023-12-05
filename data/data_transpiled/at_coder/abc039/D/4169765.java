static final void print ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  map ( Integer :: parseInt , stdin . readLine ( ) . split ( " " ) ) ;
  /* li */
  map ( Integer :: parseInt , stdin . readLine ( ) . split ( " " ) ) ;
  /* li */
  map ( Integer :: parseInt , stdin . readLine ( ) . split ( " " ) ) ;
  /* lf */
  map ( Double :: parseDouble , stdin . readLine ( ) . split ( " " ) ) ;
  /* ls */
  String [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  /* ns */
  String [ ] ns = stdin . readLine ( ) . split ( " " ) ;
  /* lc */
  List < String > lc = new LinkedList < String > ( ) ;
  /* ni */
  int ni = stdin . readInt ( ) ;
  /* nf */
  float h = li . intValue ( ) ;
  /* h */
  int w = stdin . readInt ( ) ;
  char [ ] [ ] s = new char [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    s [ i ] = lc . get ( ) ;
  }
  /* ni */
  int ni = stdin . readInt ( ) ;
  /* ni */
  int nf = stdin . readInt ( ) ;
  /* h */
  int h = stdin . readInt ( ) ;
  int w = stdin . readInt ( ) ;
  char [ ] [ ] s = new char [ w ] [ h ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    s [ i ] = lc . get ( ) ;
  }
  /* ni */
  int ni = stdin . readInt ( ) ;
  /* ni */
  int ni = stdin . readInt ( ) ;
  /* nf */
  float h = stdin . readFloat ( ) ;
  /* nl */
  int [ ] [ ] black = new int [ w ] [ h ] ;
  /* white */
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( s [ i ] [ j ] == '#' ) {
        black [ i ] [ j ] = '.' ;
      }
      else {
        white [ i ] [ j