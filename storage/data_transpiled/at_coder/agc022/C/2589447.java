public static int N = Integer . parseInt ( input ) {
  int [ ] a = Lists . newArrayList ( ) ;
  int [ ] b = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Set < Integer > kai = new HashSet < > ( ) ;
  int ans = 0 ;
  for ( int m = 0 ;
  m < N ;
  m ++ ) {
    for ( int i = 50 ;
    i > 0 ;
    i -- ) {
      kai . add ( i ) ;
    }
    List < Integer > amari = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < kai . size ( ) ;
    i ++ ) {
      int are = a [ m ] % kai . get ( i ) ;
      amari . add ( are ) ;
    }
    for ( int k = 0 ;
    k < amari . size ( ) ;
    k ++ ) {
      for ( int i = 0 ;
      i < kai . size ( ) ;
      i ++ ) {
        int are = amari . get ( k ) % kai . get ( i ) ;
        amari . add ( are ) ;
      }
    }
    if ( amari . contains ( b [ m ] ) ) {
      ann = 0 ;
    }
    else {
      ans = - 1 ;
    }
  }
  for ( int p = 50 ;
  p > 0 ;
  p -- ) {
    kai . remove ( p ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      List < Integer > amari = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < kai . size ( ) ;
      i ++ ) {
        int are = a [ j ] % kai . get ( i ) ;
        amari . add ( are ) ;
      }
      for ( int k = 0 ;
      k < amari . size ( ) ;
      k ++ ) {
        int are = amari . get ( k ) % kai . get ( i ) ;
        amari . add ( are ) ;
      }
    }
    if ( amari . contains ( b [ j ] ) ) {
      ann = 0 ;
    }
    else {
      kai . add ( p ) ;
    }
  }
  if ( ans == - 1 ) {
    System . out . println ( - 1 ) ;
  }
  else if ( a . equals ( b ) ) {
    System . out . println ( 0