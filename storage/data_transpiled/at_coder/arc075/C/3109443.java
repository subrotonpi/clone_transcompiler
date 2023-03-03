@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final List < Integer > diff = new ArrayList < > ( ) ;
  for ( int a : A ) {
    diff . add ( a - K ) ;
  }
  final List < Integer > list = Lists . newArrayList ( ) ;
  Collections . sort ( list ) ;
  class BinaryIndexedTree {
    private final int size {
      this . size = n ;
      this . bit = new int [ size + 1 ] ;
    }
    @ Override public int sum ( int i ) {
      int s = 0 ;
      while ( i > 0 ) {
        s += this . bit [ i ] ;
        i -= ( i & - i ) ;
      }
      return s ;
    }
    @ Override public void add ( int i , int x ) {
      while ( i <= size ) {
        this . bit [ i ] += x ;
        i += ( i & - i ) ;
      }
    }
  }
}
