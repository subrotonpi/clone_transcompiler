public static Map < Pair < Integer , Integer > , Double > solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> LR = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    LR . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < List < Integer >> PQ = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    PQ . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final int [ ] [ ] trains = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    trains [ i ] [ 0 ] = 0 ;
  }
  for ( int l = 0 ;
  l < LR . length ;
  l ++ ) {
    for ( int r = 0 ;
    r < LR [ l ] . length ;
    r ++ ) {
      trains [ l - 1 ] [ r - 1 ] ++ ;
    }
  }
  final Matrix matrix = new Matrix ( ) ;
  final Matrix rowSum = matrix . getInverse ( ) ;
  final Matrix matrixSum = rowSum . getInverse ( ) ;
  final Map < Pair < Integer , Integer > , Double > answer = new HashMap < > ( ) ;
  for ( int p = 0 ;
  p < PQ . length ;
  p ++ ) {
    final int q = PQ [ p ] [ 0 ] ;
    if ( ! answer . containsKey ( new Pair < > ( p , q ) ) ) {
      if ( p == 1 ) {
        answer . put ( new Pair < > ( p , q ) , matrixSum . get ( q - 1 , q - 1 ) ) ;
      }
      else {
        answer . put ( new Pair < > ( p , q ) , matrixSum . get ( q - 1 , q - 1 ) - matrixSum . get ( p - 2 , q - 1 ) ) ;
      }
    }
    System . out . println ( answer . get ( new Pair < > ( p , q ) ) ) ;
  }
  return answer ;
}
