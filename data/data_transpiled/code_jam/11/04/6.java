@ VisibleForTesting static Iterable < Integer > rins ( ) {
  return new Iterable < Integer > ( ) {
    @ Override public Iterator < Integer > iterator ( ) {
      return new Scanner ( System . in ) . useDelimiter ( " " ) . next ( ) . iterator ( ) ;
    }
  }
  ;
}
