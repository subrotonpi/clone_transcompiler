@ VisibleForTesting static String runTest ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final HashMap < Integer , Integer > gapCounts = new HashMap < > ( ) ;
  gapCounts . put ( N , 1 ) ;
  gapCounts . put ( N , 1 ) ;
  final List < Integer > gapQueue = new ArrayList < > ( ) ;
  gapQueue . add ( - N ) ;
  do {
    final int gapSize = - heapSize ( gapQueue ) ;
    assert gapSize > 0 ;
    final int gapCount = gapCounts . get ( gapSize ) ;
    gapQueue . remove ( gapSize ) ;
    if ( K <= gapCount ) {
      return gapSize / 2 + " " + ( gapSize - 1 ) / 2 ;
    }
    else {
      K -= gapCount ;
      final int left = ( gapSize - 1 ) / 2 ;
      final int right = gapSize / 2 ;
      assert left <= right && right < gapSize && left + right + 1 == gapSize ;
      for ( int e = left ;
      e <= right ;
      e ++ ) {
        if ( ! gapCounts . containsKey ( e ) ) {
          gapCounts . put ( e , 0 ) ;
          heapSize ( gapQueue , - e ) ;
        }
        gapCounts . put ( e , gapCount ) ;
      }
    }
  }
  while ( gapQueue . size ( ) > 1 ) ;
  for ( int i = 1 ;
  i <= Integer . MAX_VALUE ;
  i ++ ) {
    System . out . println ( "Case #" + i + ": " + runTest ( ) ) ;
  }
  return "" ;
}
