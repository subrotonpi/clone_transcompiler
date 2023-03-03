public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] PY = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    PY [ i ] [ 0 ] = i ;
    PY [ i ] [ 1 ] = i ;
    PY [ i ] [ 2 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( PY , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  int [ ] cnt = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    cnt [ i ] = 0 ;
    for ( int m = 0 ;
    m < M ;
    m ++ ) {
      cnt [ i ] += 1 ;
      PY [ i ] [ 3 ] = cnt [ i ] ;
    }
  }
  Arrays . sort ( PY , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    System . out . println ( Integer . toString ( PY [ m ] [ 1 ] ) . zfill ( 6 ) + Integer . toString ( PY [ m ] [ 3 ] ) . zfill ( 6 ) ) ;
  }
  return N ;
}
