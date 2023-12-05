static final void print ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  final int [ ] li = map ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* li */
  final int [ ] li = map ( Integer . parseInt ( li [ 0 ] ) - 1 ) ;
  /* li */
  final int [ ] lf = map ( Float . parseFloat ( stdin . readLine ( ) ) ) ;
  /* ls */
  final String [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  /* ns */
  final String [ ] ns = stdin . readLine ( ) . split ( " " ) ;
  /* lc */
  final List < String > lc = new LinkedList < String > ( ) ;
  /* ni */
  final int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* nf */
  float nf = Float . parseFloat ( stdin . readLine ( ) ) ;
  @ SuppressWarnings ( "unused" ) final int n = li [ 0 ] ;
  final int c = li [ 1 ] ;
  final List < Integer > x = new ArrayList < Integer > ( ) ;
  final List < Integer > v = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int xi = li [ i ] ;
    final int vi = li [ i ] ;
    x . add ( xi ) ;
    v . add ( vi ) ;
  }
  final int [ ] cw_dist = new int [ n + 1 ] ;
  cw_dist [ 0 ] = x . size ( ) ;
  final int [ ] value_cum = new int [ n + 1 ] ;
  System . arraycopy ( li [ 1 ] , 0 , value_cum , 0 , n ) ;
  final int [ ] cw_value = new int [ n + 1 ] ;
  for ( int dist = cw_dist . length - 1 ;
  dist < cw_dist . length ;
  dist ++ ) cw_value [ dist ] = dist - dist ;
  cw_max = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) cw_max [ i ] = Math . max ( cw_max [ n - 1 ] , cw_value [ i ] ) ;
  final int [ ] ccw_dist = new int [ n + 1 ] ;
  for ( int i = 0 ;
  