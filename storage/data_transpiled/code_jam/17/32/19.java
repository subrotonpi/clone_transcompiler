static final int [ ] [ ] getUpperCases ( ) {
  int [ ] [ ] c ;
  int [ ] [ ] bestHoles ;
  int L ;
  int nAc = 0 , s = 0 ;
  for ( t = 0 ;
  t < L ;
  t ++ ) {
    int [ ] c = t [ s ] ;
    int [ ] s = t [ s ] ;
    int f = - 1 ;
    if ( avail [ 1 ] < avail [ 2 ] ) f = 1 ;
    else f = 2 ;
    if ( ! avail [ f ] < l ) l2 = avail [ f ] ;
    if ( b != f ) s += l2 . length ;
    for ( ;
    ;
    ) {
      Aj [ s ] = l2 ;
    }
    for ( ;
    ;
    ) {
      Ac [ s ] [ f ] = 0 ;
    }
  }
  int [ ] [ ] c = new int [ 1440 ] [ ] ;
  for ( int i = 0 ;
  i < c . length ;
  ) {
    if ( c [ i ] == last ) continue ;
    ++ switches ;
    best = - 1 ;
    System . out . println ( "Case #" + ( L + 1 ) + ": " + switches ) ;
  }
  for ( int i = 0 ;
  i < c . length ;
  ++ i ) {
    c [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < c . length ;
  ++ i ) {
    c [ i ] = 2 ;
  }
  int [ ] [ ] con = new int [ 1440 ] [ ] ;
  int [ ] availp = new int [ 1441 ] ;
  do {
    int n0 = Integer . parseInt ( con [ 0 ] [ i ] ) ;
    int n1 = Integer . parseInt ( con [ 0 ] [ i ] ) ;
    int n2 = Integer . parseInt ( con [ 0 ] [ i ] ) ;
    int [ ] avail = new int [ ] {
      null , 720 - n1 , 720 - n2 }
      ;
      if ( avail == availp ) ++ availp ;
      bestHoles = new int [ ] {
        1440 , null , null }
        ;
        last = - 1 ;
        fz = - 1 ;
        int zeroes = 0 ;
        for ( int i = 0 ;
        i < 1441 ;
        ++ i ) {
          int c = con [ i ] [ i ] ;
          if ( c == 0 ) {
            if ( zeroes == 0 ) fz = i ;
            ++ zeroes ;
            continue ;
          }
          if ( zeroes > 0 && zeroes < bestHoles [ 0 ] ) bestHoles [ zeroes ]