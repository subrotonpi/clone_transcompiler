@ VisibleForTesting static String solve ( List < Set < Integer >> S ) {
  return new String ( ) {
    @ Override public Set < Integer > [ ] split ( String s ) {
      return Sets . newHashSet ( ) ;
    }
    @ Override public Set < Integer > get ( int i ) {
      return Sets . newHashSet ( ) ;
    }
    @ Override public int size ( ) {
      return S . size ( ) ;
    }
  }
  ;
}
