public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  List < List < Integer >> LR = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    LR . add ( Integer . parseInt ( input ) ) ;
  }
  List < List < Integer >> PQ = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    PQ . add ( Integer . parseInt ( input ) ) ;
  }
  final Matrix < Integer > trains = new Matrix < > ( N ) ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    for ( int r = 0 ;
    r < LR . size ( ) ;
    r ++ ) {
      trains . get ( l - 1 ) . set ( r - 1 ) ;
    }
  }
  Matrix < Integer > rowSum = trains . cumsum ( 1 ) ;
  Matrix < Integer > matrixSum = rowSum . cumsum ( 0 ) ;
  for ( int p = 0 ;
  p < PQ . size ( ) ;
  p ++ ) {
    for ( int q = 0 ;
    q < PQ . size ( ) ;
    q ++ ) {
      if ( p == 1 ) {
        System . out . println ( matrixSum . get ( q - 1 , q - 1 ) ) ;
      }
      else {
        System . out . println ( matrixSum . get ( q - 1 , q - 1 ) - matrixSum . get ( p - 2 , q - 1 ) ) ;
      }
    }
  }
}
