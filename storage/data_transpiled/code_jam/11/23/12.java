@ VisibleForTesting static Collection < Object [ ] > colourings ( int N , int F ) {
  int [ ] coling = new int [ N ] ;
  boolean [ ] has = new boolean [ F ] ;
  int bn ;
  boolean okay ;
  int i ;
  boolean bflavs [ ] = new int [ F ] ;
  do {
    for ( i = 0 ;
    i < F ;
    i ++ ) {
      coling [ i ] = 0 ;
    }
  }
  while ( true ) ;
  if ( ! okay ) continue ;
  bflavs [ bn ++ ] = true ;
  worked = true ;
  for ( i = 0 ;
  i < B ;
  i ++ ) {
    has [ i ] = false ;
  }
  if ( ! worked ) break ;
  System . out . println ( "Case #" + t + ": C" + bn ) ;
  System . out . println ( Arrays . toString ( bflavs ) ) ;
  coling [ 0 ] ++ ;
  boolean hasall = true ;
  for ( boolean h : has ) {
    if ( h == F ) {
      hasall = false ;
      break ;
    }
  }
  if ( hasall ) yield ( ) ;
  coling [ 0 ] ++ ;
  boolean done = false ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    if ( coling [ i ] == F ) {
      if ( i == N - 1 ) {
        done = true ;
        break ;
      }
      coling [ i ] = 0 ;
      coling [ i + 1 ] ++ ;
    }
  }
  if ( done ) break ;
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int t = 1 ;
  t <= 1 + T ;
  t ++ ) {
    N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    M = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int [ ] ws = new int [ M ] ;
    int [ ] we = new int [ M ] ;
    for ( int i = 0 ;
    i < ws . length ;
    i ++ ) ws [ i ] = ws [ i ] - 1 ;
    for ( int j = 0 ;
    j < we . length ;
    j ++ ) we [ j ] = we [ j ] ;
    List < Object > walls = new ArrayList < Object > ( ) ;
    walls . add ( new Object [ ] {
      N , M }
      ) ;
      List < Object > rooms = new ArrayList < Object > ( ) ;
      for ( Object wall : walls ) {
        for ( int ri = 0 ;
        ri < rooms . size ( ) ;
        ri ++ )