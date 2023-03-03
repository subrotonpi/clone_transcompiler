static final int N = Integer . parseInt ( input ) {
  final int Q = input . nextInt ( ) ;
  final int MAXX = 20010 ;
  final int [ ] mem = new int [ MAXX ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int r = input . nextInt ( ) ;
    int h = input . nextInt ( ) ;
    for ( int j = 0 ;
    j < h ;
    j ++ ) {
      mem [ x + j ] += ( r * ( h - j ) / h ) * ( h - j ) * ( h - j ) - ( r * ( h - j - 1 ) / h ) * ( h - j - 1 ) ;
    }
  }
  int [ ] cums = new int [ MAXX ] ;
  for ( int i = 0 ;
  i < MAXX ;
  i ++ ) {
    cums [ i ] = cums [ i ] + mem [ i ] ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    System . out . println ( ( cums [ b ] - cums [ a ] ) * Math . PI / 3 ) ;
  }
  return N ;
}
