@ VisibleForTesting static Iterable < Integer > init ( ) {
  int numPow2 = 2 * ( As . size ( ) - 1 ) ;
  int [ ] data = new int [ numPow2 + 1 ] ;
  Arrays . fill ( data , 0 ) ;
  return new Iterable < Integer > ( ) {
    @ Override public Iterator < Integer > iterator ( ) {
      return new Iterator < Integer > ( ) {
        int i = 0 ;
        @ Override public boolean hasNext ( ) {
          return i < numPow2 ;
        }
        @ Override public Integer next ( ) {
          ++ i ;
          while ( i <= numPow2 ) {
            data [ i ++ ] += A ;
            iA += i & - iA ;
          }
          return i ;
        }
        @ Override public void remove ( ) {
          ++ i ;
        }
      }
      ;
    }
    @ Override public Integer next ( ) {
      ++ i ;
      int ans = 0 ;
      while ( i > 0 ) {
        ans += data [ i -- ] ;
        iA -= i & - iA ;
      }
      return ans ;
    }
  }
  ;
}
