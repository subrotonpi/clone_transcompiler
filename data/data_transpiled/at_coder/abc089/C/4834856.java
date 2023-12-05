static final int [ ] [ ] s ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < String >> s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s . add ( new ArrayList < > ( ) ) ;
  }
  List < Integer > delete = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    switch ( s . get ( i ) . get ( 0 ) ) {
      case 'M' : case 'A' : case 'R' : case 'C' : case 'H' : break ;
      default : delete . add ( i ) ;
    }
  }
  int diff = 0 ;
  for ( int i = 0 ;
  i < delete . size ( ) ;
  i ++ ) {
    s . remove ( delete . get ( i ) - diff ) ;
    diff ++ ;
  }
  int [ ] cand = {
    0 , 0 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < s . size ( ) ;
    i ++ ) {
      if ( s . get ( i ) . get ( 0 ) . equals ( "M" ) ) cand [ 0 ] ++ ;
      if ( s . get ( i ) . get ( 0 ) . equals ( "A" ) ) cand [ 1 ] ++ ;
      if ( s . get ( i ) . get ( 0 ) . equals ( "R" ) ) cand [ 2 ] ++ ;
      if ( s . get ( i ) . get ( 0 ) . equals ( "C" ) ) cand [ 3 ] ++ ;
      if ( s . get ( i ) . get ( 0 ) . equals ( "H" ) ) cand [ 4 ] ++ ;
    }
    int ans = 0 ;
    for ( int i = 0 ;
    i < 5 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 5 ;
      j ++ ) {
        if ( i == j ) break ;
        for ( int k = 0 ;
        k < 5 ;
        k ++ ) {
          if ( i == k ) break ;
          if ( j == k ) break ;
          ans += ( int ) ( cand [ i ] * cand [ j ] * cand [ k ] ) ;
        }
      }
    }
    System . out . println ( ans ) ;
  }
  