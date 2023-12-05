static final void setIn ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  final int [ ] li = map ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* li */
  final int [ ] li_ = map ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* lf */
  final float lf = map ( Float . parseFloat ( stdin . readLine ( ) ) ) ;
  /* ls */
  final String [ ] ns = stdin . readLine ( ) . split ( " " ) ;
  /* lc */
  final LinkedList < Integer > lc = new LinkedList < Integer > ( ns ) ;
  /* ni */
  final int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* nf */
  @ SuppressWarnings ( "unchecked" ) final int n = li [ 0 ] ;
  final int m = li [ 1 ] ;
  final int [ ] a = list ( li_ ) ;
  final int [ ] ans = new int [ m ] ;
  final int [ ] cnt_equal = new int [ m ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    cnt_equal [ a [ i + 1 ] ] += ( ( ( a [ i + 1 ] + m - a [ i ] ) % m ) - 1 ) ;
  }
  final int [ ] cnt_inner = new int [ 2 * m + 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    cnt_inner [ a [ i ] + 1 ] ++ ;
    cnt_inner [ a [ i ] + ( a [ i + 1 ] + m - a [ i ] ) % m ] -- ;
  }
  cnt_inner = list ( accumulate ( cnt_inner ) ) ;
  Arrays . sort ( cnt_inner ) ;
  int [ ] cnt_inner = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    cnt_inner [ i ] = cnt_inner [ i ] + cnt_inner [ i + m ] ;
  }
  int fav = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    ans [ 0 ] += Math . min ( ( a [ i + 1 ] + m - a [ i ] ) % m , 1 + ( a [ i + 1 ] + m - fav