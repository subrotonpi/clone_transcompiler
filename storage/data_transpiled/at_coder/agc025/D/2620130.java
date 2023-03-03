@ VisibleForTesting static Iterable < Integer > judge ( int D ) {
  return new Iterable < Integer > ( ) {
    int N = 1 ;
    @ Override public Iterator < Integer > iterator ( ) {
      return new Iterator < Integer > ( ) {
        int n = 1 ;
        while ( D % 4 == 0 ) {
          n *= 2 ;
          D /= 4 ;
        }
        @ Override public Integer next ( ) {
          return ~ ( D / n + D / n ) % 2 ;
        }
        @ Override public Integer next ( ) {
          return ~ ( D / n ) % 2 ;
        }
      }
      ;
    }
  }
  ;
}
