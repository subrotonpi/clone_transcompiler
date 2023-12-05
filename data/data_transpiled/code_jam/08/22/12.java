@ VisibleForTesting static final UnionFind < Integer > solve ( int start , int end ) throws IOException {
  Stream < Integer > data = Stream . of ( Integer . valueOf ( System . getProperty ( "test.data" ) ) . split ( " " ) ) . map ( Integer :: valueOf ) ;
  @ Override public Stream < Integer > stream ( ) {
    return data . map ( Integer :: valueOf ) . map ( Integer :: valueOf ) ;
  }
  @ Override public Stream < Integer > stream ( ) {
    return data . map ( Integer :: valueOf ) . map ( s -> s . toString ( ) ) ;
  }
  private Stream < Integer > stream ( ) {
    Stream < Integer > sets = stream ( ) ;
    Stream < Integer > lookup = stream ( ) ;
    int numCases = pop_int ( data ) ;
    for ( int caseNum = 1 ;
    caseNum <= numCases ;
    caseNum ++ ) {
      int start = pop_case ( data ) ;
      int end = pop_case ( data ) ;
      int prime = pop_case ( data ) ;
      int answer = solve ( start , end , prime ) ;
      System . out . printf ( "Case #%d: %s%n" , caseNum , answer ) ;
    }
    return Stream . of ( set ( ) ) ;
  }
  @ Override public Stream < Integer > stream ( ) {
    return stream ( ) ;
  }
  @ Override public Stream < Integer > stream ( ) {
    return stream ( ) ;
  }
  @ Override public Stream < Integer > stream ( ) {
    return stream ( ) ;
  }
  @ Override public Stream < Integer > stream ( ) {
    return stream ( ) ;
  }
  @ Override public Stream < Integer > stream ( ) {
    return stream ( ) ;
  }
  @ Override public Stream < Integer > stream ( ) {
    return stream ( ) ;
  }
  @ Override public int size ( ) {
    return 2 ;
  }
}
