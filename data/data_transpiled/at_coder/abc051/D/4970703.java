private static Map < Integer , Map < Integer , List < Integer >>> generateGraph ( List < Pair < Integer , Integer >> inputList ) {
  Map < Integer , Map < Integer , List < Integer >>> graph = new HashMap < > ( ) ;
  for ( Pair < Integer , Integer > pair : inputList ) {
    if ( ! pair . first . equals ( pair . second ) ) {
      graph . put ( pair . first , new HashMap < > ( ) ) ;
    }
    if ( ! pair . second . equals ( pair . first ) ) {
      graph . put ( pair . second , new HashMap < > ( ) ) ;
    }
    graph . get ( pair . first ) . put ( pair . second , pair . second ) ;
    List < Integer > sideSorted = new ArrayList < > ( ) ;
    for ( Pair < Integer , Integer > pair : pair . second ) {
      sideSorted . add ( pair . first ) ;
    }
    sideSorted . add ( pair . first ) ;
    graph . get ( pair . second ) . put ( pair . first , pair . second ) ;
  }
  int count = 0 ;
  if ( className . equals ( "java.util.HashMap" ) ) {
    Integer input1 = input . get ( ) ;
    int vertexCount = Integer . parseInt ( input1 ) ;
    List < Integer > list = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < vertexCount ;
    i ++ ) {
      Integer vertex1 = Integer . parseInt ( input1 . get ( i ) . first ) ;
      Integer vertex2 = Integer . parseInt ( input2 . get ( i ) . second ) ;
      List < Integer > list = new ArrayList < > ( ) ;
      for ( int j = 0 ;
      j < vertex1 ;
      j ++ ) {
        Integer side = Integer . parseInt ( input1 . get ( j ) . first ) ;
        list . add ( side ) ;
      }
      list . add ( new Integer ( vertex1 ) ) ;
      list . add ( new Integer ( vertex2 ) ) ;
      list . add ( new Integer ( vertex2 ) ) ;
    }
    count ++ ;
    for ( int side : sideSorted ) {
      if ( ! list . contains ( side ) ) {
        count ++ ;
      }
    }
    return graph ;
  }
  return null ;
}
