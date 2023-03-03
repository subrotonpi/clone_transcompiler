@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final LinkedHashMap < Integer , Integer > map = new LinkedHashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    map . put ( i , i ) ;
  }
  for ( int j = 1 ;
  j < M ;
  j ++ ) {
  }
  return map ;
}
