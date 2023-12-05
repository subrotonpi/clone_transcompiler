@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static String solve ( int N , int K ) {
  List < Integer > blocks = new ArrayList < > ( ) ;
  Map < Integer , Integer > counts = Maps . newHashMap ( ) ;
  heapifyBlocks ( blocks , - N ) ;
  counts . put ( N , 1 ) ;
  int L = 0 , R = 0 ;
  int ub = 0 ;
  while ( blocks . size ( ) > 0 ) {
    int block = - heapifyBlocks ( blocks , N ) ;
    int count = counts . get ( block ) ;
    ub += count ;
    L = ( block - 1 ) / 2 ;
    R = block / 2 ;
    if ( K <= ub ) {
      return String . format ( "%d %d" , R , L ) ;
    }
    if ( L > 0 ) {
      if ( counts . containsKey ( L ) ) {
        counts . get ( L ) + = count ;
      }
      else {
        heapifyBlocks ( blocks , - L ) ;
        counts . put ( L , count ) ;
      }
    }
    if ( R > 0 ) {
      if ( counts . containsKey ( R ) ) {
        counts . get ( R ) + = count ;
      }
      else {
        heapifyBlocks ( blocks , - R ) ;
        counts . put ( R , count ) ;
      }
    }
  }
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int caseNumber = 1 ;
  caseNumber <= T ;
  caseNumber ++ ) {
    N = Integer . parseInt ( input ( ) ) ;
    K = Integer . parseInt ( input ( ) ) ;
    System . out . println ( String . format ( "Case #%d:" , caseNumber ) + " " + solve ( N , K ) ) ;
  }
  return String . format ( "%d %d" , T , K ) ;
}
