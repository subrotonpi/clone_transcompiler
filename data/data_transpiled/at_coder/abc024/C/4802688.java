public static int [ ] [ ] getN ( ) {
  int N = 0 ;
  int D = N ;
  int K = 0 ;
  LinkedList < LinkedList < Integer >> LR = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    LR . add ( new LinkedList < > ( ) ) ;
  }
  int [ ] tribePosition = new int [ K ] ;
  int [ ] destination = new int [ K ] ;
  int [ ] direction = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    tribePosition [ i ] = 0 ;
    destination [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( tribePosition [ i ] - destination [ i ] > 0 ) {
      direction [ i ] = 0 ;
    }
    else if ( tribePosition [ i ] - destination [ i ] < 0 ) {
      direction [ i ] = 1 ;
    }
  }
  int [ ] anDays = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    for ( int j = 0 ;
    j < K ;
    j ++ ) {
      if ( anDays [ j ] == 0 ) {
        if ( LR . get ( i ) . intValue ( ) <= tribePosition [ j ] && tribePosition [ j ] <= LR . get ( i ) . intValue ( ) ) {
          if ( LR . get ( i ) . intValue ( ) <= destination [ j ] && destination [ j ] <= LR . get ( i ) . intValue ( ) ) {
            anDays [ j ] = i + 1 ;
          }
          else if ( direction [ j ] > 0 ) {
            tribePosition [ j ] = LR . get ( i ) . intValue ( ) ;
          }
          else {
            tribePosition [ j ] = LR . get ( i ) . intValue ( ) ;
          }
        }
      }
    }
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    System . out . println ( anDays [ i ] ) ;
  }
  return new int [ K ] [ K ] ;
}
