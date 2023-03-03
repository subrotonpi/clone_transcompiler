static final void setIn ( int [ ] a , boolean rev ) {
  final int [ ] in = new int [ ] {
    10 * 5 }
    ;
    System . setIn ( in ) ;
    {
      int li = Integer . parseInt ( in [ 0 ] ) ;
      int li_ = Integer . parseInt ( in [ 1 ] ) ;
      float lf = Float . parseFloat ( in [ 2 ] ) ;
      int ls = Integer . parseInt ( in [ 3 ] ) ;
      int ns = Integer . parseInt ( in [ 4 ] ) ;
      int lc = Integer . parseInt ( in [ 5 ] ) ;
      int ni = Integer . parseInt ( in [ 6 ] ) ;
      float nf = Float . parseFloat ( in [ 8 ] ) ;
      @ SuppressWarnings ( "unchecked" ) final class BIT {
        int size = size + 1 ;
        int [ ] bitree = new int [ size ] ;
        @ Override public void addval ( int idx : int val ) {
          while ( idx < size ) {
            bitree [ idx ] += val ;
            idx += idx & ( - idx ) ;
          }
        }
        @ Override public int getsum ( int idx : int val ) {
          int ret = 0 ;
          while ( idx > 0 ) {
            ret += bitree [ idx ] ;
            idx -= idx & ( - idx ) ;
          }
          return ret ;
        }
        @ Override public void reset ( ) {
          bitree = new int [ size ] ;
        }
      }
      private int [ ] val2ord ( @ Nonnull List < ? extends Integer > a , boolean rev ) {
        Map < Integer , Integer > dic = new HashMap < > ( ) ;
        for ( int i = 0 ;
        i < a . length ;
        i ++ ) {
          dic . put ( ai , i ) ;
        }
        return a . get ( dic . get ( ai ) ) ;
      }
    }
    {
      int n = li ;
      int k = li ;
      int [ ] a = Arrays . copyOf ( a , n ) ;
      int [ ] acc = Arrays . copyOf ( a , n + 1 ) ;
      int [ ] b = Arrays . copyOf ( acc , acc . length ) ;
      for ( int i = 0 ;
      i < b . length ;
      i ++ ) {
        int acci = acc [ i ] ;
        int c = val2ord ( b ) ;
        BIT bitree = new BIT ( n + 1 ) ;
        int ans = 0 ;
        for ( int ci : c ) {
          bitree . addval ( ci + 1 , 1 ) ;
          ans += bitree . getsum ( ci + 1 ) - 1 ;
        }
        System .