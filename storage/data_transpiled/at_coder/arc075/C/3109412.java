@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int [ ] diff = new int [ A . length ] ;
  for ( int a : A ) {
    diff [ a ] = a - K ;
  }
  Arrays . sort ( diff ) ;
  class BinaryIndexedTree {
    private final int size ;
    private int [ ] bit = new int [ size + 1 ] ;
    @ Override public int sum ( int i ) {
      int s = 0 ;
      while ( i > 0 ) {
        s += bit [ i ] ;
        i -= ( i & - i ) ;
      }
      return s ;
    }
    @ Override public void add ( int i , int x ) {
      while ( i <= size ) {
        bit [ i ] += x ;
        i += ( i & - i ) ;
      }
    }
  }
}
