static final Scanner IO = new Scanner ( System . in ) {
  private String fname ;
  private long t0 ;
  private long fnums [ ] = 0L ;
  private long fnums [ ] = 0L ;
  private long fnums [ ] = 0L ;
  private long fnums [ ] = 0L ;
  private long fnums [ ] = 0L ;
  private long fnums [ ] = 0L ;
  private String [ ] [ ] arrstr = new long [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    e = nums [ i ] ;
    e [ i ] = i - 1 ;
  }
  private long [ ] [ ] invs = new long [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    invs [ e [ i ] ] = new long [ n ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    invs [ e [ i ] ] [ i ] = i ;
  }
  int i ;
  long res = 0 ;
  /* depth */
  res = 0 ;
  for ( int v = 0 ;
  v < n ;
  v ++ ) {
    if ( ! invs [ v ] [ i ] ) {
      res = 0 ;
      for ( int u : invs [ v ] ) {
        if ( u == ignore ) continue ;
        res = Math . max ( res , depth ( u , - 1 ) + 1 ) ;
      }
    }
  }
  int sum = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! invs [ i ] [ i ] ) {
      int t = 0 ;
      int v = i ;
      ArrayList < Integer > vers = new ArrayList < Integer > ( ) ;
      while ( ! invs [ v ] [ i ] . equals ( e [ v ] ) ) {
        step [ v ] = t ++ ;
        vers . add ( v ) ;
        v = e [ v ] [ i ] ;
      }
      if ( ! invs [ v ] [ i ] . equals ( e [ v ] ) ) continue ;
      int le = t - invs [ v ] [ i ] ;
      vers = vers . subList ( vers . size ( ) - le , vers . size ( ) ) ;
      res = Math . max ( res , vers . size ( ) ) ;
      if ( vers . size ( ) == 2 ) {
        sum += 2 + fnums [ vers . get ( 0 ) ] [ i ] + fnums [ vers . get ( 1 ) ] ;
        