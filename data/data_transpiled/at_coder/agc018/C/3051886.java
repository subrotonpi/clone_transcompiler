static final String [ ] getStrings ( ) {
  final int inf = 10 ;
  final double eps = 1.0 / 10 ;
  final int mod = 10 ;
  final int [ ] xa = new int [ N ] ;
  final int [ ] ya = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    xa [ i ] = i ;
  }
  int r = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = ya [ i ] ;
    final int b = xa [ i ] ;
    final int tr = a + b ;
    if ( r < tr ) {
      r = tr ;
    }
  }
  System . out . println ( Main . class . getSimpleName ( ) ) ;
  final int [ ] dd = {
    ( - 1 ) , ( 0 ) , ( 1 ) , ( 1 ) , ( 0 ) , ( - 1 ) }
    ;
    final int [ ] ddn = {
      ( - 1 ) , ( - 1 ) , ( 0 ) , ( - 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( - 1 ) , ( - 1 ) , ( - 1 ) , ( - 1 ) }
      ;
      /* LI */
      final int [ ] LI = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        LI [ i ] = Integer . parseInt ( LI [ i ] ) ;
      }
      final int [ ] LI_ = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        LI_ [ i ] = Integer . parseInt ( LI_ [ i ] ) ;
      }
      final int [ ] LF = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        LF [ i ] = Float . parseFloat ( LI_ [ i ] ) ;
      }
      final int [ ] LS = new int [ N ] ;
      for ( int i = 0 ;
      