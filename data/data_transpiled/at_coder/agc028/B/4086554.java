@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > A = Lists . newArrayList ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    A . add ( Integer . parseInt ( s ) ) ;
  }
  final int mod = 10 * 9 + 7 ;
  return new Iterable < Integer > ( ) {
    public Iterator < Integer > iterator ( ) {
      int i = 1 , x1 = 0 , y1 = a , m = a ;
      int x2 = 0 , y2 = 1 , n = b ;
      while ( m % n != 0 ) {
        int q = m / n ;
        x1 = x2 ;
        y1 = m ;
        m = x2 ;
        x2 = y2 ;
        y2 = n ;
        n = x1 - q * x2 ;
        x1 = y1 - q * y2 ;
        y1 = m - q * n ;
      }
      return new Iterator < Integer > ( ) {
        @ Override public boolean hasNext ( ) {
          return n > 0 ;
        }
        @ Override public Integer next ( ) {
          return n ;
        }
      }
      ;
    }
  }
  ;
}
