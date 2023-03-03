@ Nonnull public static < T > Iterable < T > iterable ( @ Nonnull final int i ) {
  return new Iterable < T > ( ) {
    @ Nonnull @ Override public Iterator < T > iterator ( ) {
      return new Iterator < T > ( ) {
        @ Override public boolean hasNext ( ) {
          return i < 0 ;
        }
        @ Override public T next ( ) {
          return i ;
        }
        @ Override public void remove ( ) {
        }
      }
      ;
    }
  }
  ;
}
