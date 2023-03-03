public static final BIT < Integer > FACTORY = new BIT < Integer > ( ) {
  private int [ ] S = new int [ n + 1 ] ;
  private int N = n ;
  @ Override public Integer tot ( int k ) {
    int i = k ;
    int a = 0 ;
    while ( i > 0 ) {
      a += S [ i ] ;
      i -= ( i & - i ) ;
    }
    return a ;
  }
  @ Override public void inc ( int k , Integer v ) {
    int i = k ;
    while ( i <= N ) {
      S [ i ] += v ;
      i += ( i & - i ) ;
    }
  }
  @ Override public Integer [ ] reader ( BinaryInput inFile ) {
    int [ ] dummy = inFile . getInts ( ) ;
    return inFile . getInts ( ) ;
  }
  @ Override public int [ ] solver ( Integer [ ] nums ) {
    ArrayList < Integer > sn = new ArrayList < Integer > ( nums ) ;
    int n = nums . length ;
    HashMap < Integer , Integer > nl = new HashMap < Integer , Integer > ( ) ;
    for ( int i : xrange ( n ) ) {
      nl . put ( sn . get ( i ) , i ) ;
    }
    Arrays . sort ( nums ) ;
    nl = new HashMap < Integer , Integer > ( ) ;
    for ( int i : xrange ( n ) ) {
      nl . put ( nums [ i ] , i + 1 ) ;
    }
    BIT < Integer > bit = new BIT < Integer > ( n ) ;
    System . out . println ( n ) ;
    for ( int i : xrange ( n ) ) bit . inc ( i + 1 , 1 ) ;
    int lower = 1 ;
    int upper = n ;
    int tot = 0 ;
    for ( int i : xrange ( n ) ) {
      Integer v = nl . get ( i ) ;
      int cur = bit . tot ( v ) ;
      if ( ( cur - lower ) > ( upper - cur ) ) {
        tot += upper - cur ;
        bit . inc ( v + 1 , - 1 ) ;
        upper -- ;
      }
      else {
        tot += cur - lower ;
        bit . inc ( 1 , 1 ) ;
        bit . inc ( v , - 1 ) ;
        lower ++ ;
      }
    }
    return tot ;
  }
}
