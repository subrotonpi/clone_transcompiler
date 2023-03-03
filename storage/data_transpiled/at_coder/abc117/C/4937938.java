public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) X [ i ] = i ;
  if ( N >= M ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  Arrays . sort ( X ) ;
  int [ ] d = new int [ M - 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) d [ i ] = X [ i ] - 1 ;
  return d ;
}
