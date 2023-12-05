@ VisibleForTesting static LinkedHashMap < Integer , Integer > inpl ( ) {
  final int H = Integer . parseInt ( input . nextLine ( ) ) ;
  final int W = Integer . parseInt ( input . nextLine ( ) ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 0 ) {
    System . out . println ( H ) ;
    System . exit ( 0 ) ;
  }
  final LinkedHashMap < Integer , Integer > A = new LinkedHashMap < > ( ) ;
  final LinkedHashMap < Integer , Integer > B = new LinkedHashMap < > ( ) ;
  final LinkedHashMap < Integer , Integer > C = new LinkedHashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . put ( i , i ) ;
  }
  return C ;
}
