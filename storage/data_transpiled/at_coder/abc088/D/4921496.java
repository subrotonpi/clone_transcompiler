@ VisibleForTesting static int [ ] [ ] createDistance ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < String >> G = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) G . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  int firstBlack = Integer . parseInt ( input . nextLine ( ) ) ;
  Queue < Integer > que = new ArrayDeque < > ( ) ;
  int [ ] [ ] dist = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) dist [ i ] [ 0 ] = - 1 ;
  dist [ 0 ] [ 0 ] = 0 ;
  Direction direction [ ] = {
    new Direction ( 0 , 1 ) , new Direction ( 0 , - 1 ) , new Direction ( 1 , 0 ) , new Direction ( - 1 , 0 ) }
    ;
    while ( que . size ( ) > 0 ) {
      int nh = que . poll ( ) ;
      int nw = que . poll ( ) ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        int dh = direction [ i ] . ordinal ( ) ;
        int dw = direction [ i ] . ordinal ( ) ;
        if ( ! ( ( 0 <= nh + dh && dh < H ) & ( 0 <= nw + dw && dw < W ) ) ) continue ;
        if ( G . get ( nh + dh ) . get ( nw + dw ) . equals ( "#" ) ) continue ;
        if ( dist [ nh + dh ] [ nw + dw ] > 0 ) continue ;
        dist [ nh + dh ] [ nw + dw ] = dist [ nh ] [ nw ] + 1 ;
        que . add ( new Integer [ ] {
          nh + dh , nw + dw }
          ) ;
        }
      }
      if ( dist [ dist . length - 1 ] [ - 1 ] != - 1 ) System . out . println ( H * W - dist [ dist . length - 1 ] [ - 1 ] - firstBlack - 1 ) ;
      else System . out . println ( - 1 ) ;
      return dist ;
    }
    