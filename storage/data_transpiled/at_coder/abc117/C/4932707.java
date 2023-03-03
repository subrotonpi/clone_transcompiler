public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N >= M ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( X ) ;
  int Y = 0 ;
  for ( int i = 0 ;
  i < M - N ;
  i ++ ) Y [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  return Y ;
}
