static final void main ( String [ ] args ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  final int [ ] li = ArrayUtil . fromIntegers ( stdin . readLine ( ) . split ( " " ) ) ;
  /* li */
  final int [ ] li_ = ArrayUtil . fromIntegers ( stdin . readLine ( ) . split ( " " ) ) ;
  /* lf */
  final double [ ] lf = ArrayUtil . fromDoubles ( stdin . readLine ( ) . split ( " " ) ) ;
  /* ls */
  final String [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  /* ns */
  final String [ ] ns = stdin . readLine ( ) . split ( " " ) ;
  /* lc */
  final LinkedList < String > lc = new LinkedList < String > ( ) ;
  lc . add ( ns [ 0 ] ) ;
  lc . add ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  lc . add ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
  lc . add ( Float . parseFloat ( stdin . readLine ( ) ) ) ;
  final int [ ] ni = new int [ n + 1 ] ;
  final int [ ] b = new int [ li . length ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] = li [ i ] ;
  final int [ ] searched = new int [ li . length ] ;
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) {
    b [ i ] = 0 ;
  }
  int cur = a ;
  final List < Integer > order = new ArrayList < Integer > ( ) ;
  for ( ;
  ;
  ) {
    cur = b [ cur ] ;
    if ( searched [ cur ] ) {
      final int lpst = order . indexOf ( cur ) ;
      header = order . subList ( 0 , lpst ) ;
      loop = order . subList ( lpst , order . size ( ) ) ;
      break ;
    }
    else {
      searched [ cur ] = 1 ;
      order . add ( cur ) ;
    }
  }
  if ( header != null ) {
    if ( k <= header . length ) {
      System . out . println ( order . get ( k - 1 ) ) ;
    }
    else {
      k -= header . length ;
      System . out . println ( loop [ ( k - 1 ) % loop . length ] ) ;
    }
    