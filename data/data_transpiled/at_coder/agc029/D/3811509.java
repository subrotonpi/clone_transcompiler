public static void dprint ( String ... value ) {
  if ( isdbg ) {
    System . out . println ( value ) ;
  }
  int H = Integer . parseInt ( input ( ) ) ;
  int W = Integer . parseInt ( input ( ) ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] XY = new int [ W ] [ H ] ;
  Map < Integer , List < Integer >> BL = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x1 = Integer . parseInt ( input ( ) ) ;
    int y1 = Integer . parseInt ( input ( ) ) ;
    if ( isdbg ) {
      XY [ x1 - 1 ] [ y1 - 1 ] = 1 ;
    }
    if ( BL . containsKey ( x1 - 1 ) ) {
      BL . get ( x1 - 1 ) . add ( y1 - 1 ) ;
    }
    else {
      BL . put ( x1 - 1 , new ArrayList < Integer > ( ) ) ;
    }
  }
  List < Entry < Integer , List < Integer >>> TL = new ArrayList < > ( BL . entrySet ( ) ) ;
  Collections . sort ( TL ) ;
  if ( isdbg ) {
    for ( int i = 0 ;
    i < W ;
    i ++ ) {
      for ( int j = 0 ;
      j < H ;
      j ++ ) {
        dprint ( XY [ i ] [ j ] , "" ) ;
      }
      dprint ( ) ;
    }
  }
  int maxr = 1 ;
  for ( int i = 0 ;
  i < H - 1 ;
  i ++ ) {
    if ( BL . containsKey ( i + 1 ) ) {
      List < Integer > l = BL . get ( i + 1 ) ;
      Collections . sort ( l ) ;
      for ( Integer ll : l ) {
        if ( maxr > ll ) {
          System . out . println ( i + 1 ) ;
          exit ( 0 ) ;
        }
        else if ( maxr == ll ) {
          maxr -- ;
          break ;
        }
        else {
          break ;
        }
      }
    }
    maxr ++ ;
  }
  System . out . println ( H ) ;
}
