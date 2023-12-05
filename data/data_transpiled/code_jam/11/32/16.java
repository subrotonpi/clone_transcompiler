static final Scanner input = new Scanner ( System . in ) {
  @ Override public int next ( ) {
    final int T = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int t = 0 ;
    t < xrange ( T ) ;
    t ++ ) {
      final int [ ] D = Arrays . stream ( input . nextLine ( ) . split ( "\\s+" ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
      final int L = D [ 0 ] ;
      final int B = D [ 1 ] ;
      final int N = D [ 2 ] ;
      final int C = D [ 3 ] ;
      final int [ ] D_ = D [ 4 ] ;
      final int len = D . length ;
      final int J = ( int ) ( N / C ) ;
      for ( int j = 0 ;
      j < J ;
      j ++ ) {
        len += D_ . length ;
      }
      for ( int i = 0 ;
      i < N - len ;
      i ++ ) {
        len += D_ [ i ] ;
      }
      int cur = 0 ;
      for ( int f = 0 ;
      f < xrange ( len ) ;
      f ++ ) {
        if ( cur + 2 * len > B ) break ;
        cur += 2 * len ;
      }
      final int [ ] F = new int [ L ] ;
      F [ 0 ] = ( cur + 2 * len - B ) / 2 ;
      System . arraycopy ( D , ( f + 1 ) * len , F , 1 , L ) ;
      System . out . println ( "Case #" + ( t + 1 ) + ": " + ( 2 * sum ( D ) - sum ( Arrays . copyOf ( F , L ) ) ) ) ;
    }
    return L ;
  }
}
