static final < T > SegmentTree < T > create ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int L = input . nextInt ( ) ;
  final List < T > a = new ArrayList < T > ( N ) ;
  final int [ ] tree = new int [ L ] ;
  final int def = input . nextInt ( ) ;
  final BinaryOperator < T > op = new BinaryOperator < T > ( ) {
    int realSize = input . nextInt ( ) ;
    int eleSize = eleSize = 1 << Math . ceil ( Math . log2 ( realSize ) ) ;
    int [ ] tree = tree = new int [ eleSize * 2 ] ;
    Arrays . fill ( tree , def ) ;
    int def = input . nextInt ( ) ;
    op . apply ( op ) ;
    for ( int i = eleSize - 1 ;
    i > 0 ;
    i -- ) {
      tree [ i ] = op . apply ( tree [ i << 1 ] , tree [ ( i << 1 ) + 1 ] ) ;
    }
  }
  ;
  SegmentTree < T > seg = new SegmentTree < T > ( ) {
    int i = 0 , l = 0 , r = 0 , c = 0 ;
    @ Override public T getValue ( int x , int y ) {
      int l = x + eleSize , r = y + eleSize ;
      T [ ] tree = tree [ i ] , result = def , op = op . apply ( tree [ ( i << 1 ) + 1 ] ) ;
      while ( l < r ) {
        if ( ( l & 1 ) != 0 ) {
          result = op . apply ( tree [ l ++ ] , result ) ;
        }
        if ( ( r & 1 ) != 0 ) {
          r -- ;
          result = op . apply ( tree [ r ++ ] , result ) ;
        }
        l = l >> 1 ;
        r = r >> 1 ;
      }
      return result ;
    }
    @ Override public void setValue ( int i , T value ) {
      int k = i + eleSize ;
      tree [ k ] = value ;
      seg . update ( k ) ;
    }
    @ Override public void update ( int i ) {
      op . apply ( i , i ) ;
    }
  }
  ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  L = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new ArrayList < T > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( seg . getValue ( i