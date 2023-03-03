@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  return new Iterable < Integer > ( ) {
    @ Override public Iterator < Integer > iterator ( ) {
      return new Iterator < Integer > ( ) {
        int x1 = 0 , y1 = 0 ;
        int x2 = 0 , y2 = 0 ;
        int x3 = 0 , y3 = 0 ;
        return Math . abs ( x1 * y2 + x2 * y3 + x3 * y1 - y1 * x2 - y2 * x3 - y3 * x1 ) ;
      }
      ;
    }
  }
  ;
}
