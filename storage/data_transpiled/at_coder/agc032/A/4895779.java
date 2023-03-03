public static int [ ] [ ] getTasks ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] barr = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) barr [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] cntb = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) cntb [ i ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) cntb [ i ] [ 0 ] = barr [ i ] [ 0 ] ;
  int [ ] task = new int [ N ] ;
  boolean ok = true ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    for ( int i = N ;
    i >= 0 ;
    i -- ) {
      if ( cntb [ i ] [ 1 ] + 1 == cntb [ i ] [ 0 ] ) {
        task [ n ] = cntb [ i ] [ 0 ] ;
        cntb [ i ] [ 0 ] = - 1 ;
        break ;
      }
      else if ( cntb [ i ] [ 0 ] > 0 && cntb [ i ] [ 1 ] + 1 < cntb [ i ] [ 0 ] ) {
        ok = false ;
      }
      else cntb [ i ] [ 1 ] -- ;
    }
  }
  if ( ok ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) System . out . println ( task [ i ] ) ;
  }
  else System . out . println ( - 1 ) ;
  return cntb ;
}
