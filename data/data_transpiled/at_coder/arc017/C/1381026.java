static final double [ ] [ ] range ( int i , int j ) {
  int inf = i * j ;
  int mod = i * j ;
  /* LI */
  int [ ] [ ] li = new int [ N ] [ ] ;
  /* LI_ */
  int [ ] [ ] li = new int [ N ] [ ] ;
  /* LF */
  for ( int j = 0 ;
  j < N ;
  j ++ ) li [ j ] = Integer . parseInt ( li [ j ] ) ;
  /* LS */
  for ( int j = 0 ;
  j < N ;
  j ++ ) li [ j ] [ j ] = Integer . parseInt ( li [ j ] [ j ] ) ;
  /* I */
  for ( int j = 0 ;
  j < N ;
  j ++ ) li [ j ] [ j ] = Integer . parseInt ( li [ j ] [ j ] ) ;
  /* F */
  for ( int j = 0 ;
  j < N ;
  j ++ ) li [ j ] [ j ] = Float . parseFloat ( li [ j ] [ j ] ) ;
  /* S */
  int N = li [ N ] [ j ] ;
  int X = li [ N ] [ j ] ;
  TreeSet < Integer > W = new TreeSet < Integer > ( ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) W . add ( li [ j ] [ j ] ) ;
  TreeMap < Integer , Integer > map = new TreeMap < Integer , Integer > ( ) ;
  map . put ( 0 , 1 ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    int c = W . size ( ) ;
    TreeMap < Integer , Integer > t = new TreeMap < Integer , Integer > ( ) ;
    for ( int k : map . keySet ( ) ) {
      if ( k + c > X ) continue ;
      t . put ( k + c , v ) ;
    }
    for ( int k : t . keySet ( ) ) map . put ( k , v ) ;
  }
  TreeMap < Integer , Integer > d2 = new TreeMap < Integer , Integer > ( ) ;
  d2 . put ( 0 , 1 ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    int c = W . size ( ) ;
    TreeMap < Integer , Integer > t = new TreeMap < Integer , Integer > ( ) ;
    for ( int k : d2 . keySet ( ) ) {
      if ( k + c > X ) continue ;
      t .