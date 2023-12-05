static final class BinaryIndexedTree {
  private int [ ] data = new int [ size + 1 ] ;
  private int size = size ;
  @ Override public void add ( int i , int w ) {
    while ( i <= size ) {
      data [ i ] += w ;
      i += i & - i ;
    }
  }
  @ Override public int sum ( int i ) {
    int result = 0 ;
    while ( i > 0 ) {
      result += data [ i ] ;
      i -= i & - i ;
    }
    return result ;
  }
  @ Override public int [ ] accumulate ( int i ) {
    int N = Integer . parseInt ( input ( ) ) ;
    int K = Integer . parseInt ( input ( ) ) ;
    int [ ] B = new int [ N ] ;
    for ( int sa = 0 , sk = Integer . parseInt ( input ( ) ) ;
    sa < K ;
    sa ++ ) {
      B [ sa ] = i ;
    }
    return B ;
  }
}
