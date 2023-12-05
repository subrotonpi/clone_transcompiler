public static int [ ] [ ] convert ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Lists . newArrayList ( ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    a [ a [ i ] - 1 ] = i ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    a [ a [ i ] ] = revSwap . get ( a [ i ] ) ;
  }
  int [ ] swap = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    swap [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    swap [ i ] = i ;
  }
  int [ ] memoCycle = new int [ n ] ;
  int [ ] memoPos = new int [ n ] ;
  int [ ] [ ] li = new int [ n ] [ n ] ;
  int cnCycle = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cnPos = 0 ;
    int num = i ;
    do {
      if ( memoCycle [ num ] == 0 ) {
        break ;
      }
      else {
        memoCycle [ num ] = cnCycle ;
        memoPos [ num ] = cnPos ;
        li [ cnCycle ] [ num ] ++ ;
        num = swap [ num ] ;
        cnCycle ++ ;
      }
    }
    while ( num != 0 ) ;
    cnCycle ++ ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int lenCycle = li [ memoCycle [ i ] ] . length ;
    int pos = ( d + memoPos [ i ] ) % lenCycle ;
    System . out . println ( li [ memoCycle [ i ] ] [ pos ] + 1 ) ;
  }
  return li ;
}
