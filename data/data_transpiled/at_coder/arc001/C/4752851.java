public static int [ ] [ ] getA ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int offset = 100 ;
  int [ ] table = new int [ 300 ] ;
  for ( int i = 0 ;
  i < table . length ;
  i ++ ) {
    table [ i ] = 40 ;
  }
  table [ A + offset ] = 0 ;
  do {
    List < Integer > l = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < table . length ;
    i ++ ) {
      if ( table [ i ] != 40 ) {
        l . add ( i ) ;
      }
    }
    for ( int i : l ) {
      for ( int x = 1 ;
      x <= 5 ;
      x ++ ) {
        if ( table [ B + offset ] != 40 ) {
          System . out . println ( table [ B + offset ] ) ;
          quit ( ) ;
        }
        table [ i + x ] = Math . min ( table [ i + x ] , table [ i ] + 1 ) ;
        table [ i - x ] = Math . min ( table [ i - x ] , table [ i ] + 1 ) ;
      }
    }
  }
  while ( A + offset < 300 ) ;
  return table ;
}
