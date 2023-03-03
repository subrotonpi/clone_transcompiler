static int [ ] solve ( ) {
  final int [ ] powerTable = new int [ size ] ;
  for ( int i = 0 ;
  i < powerTable . length ;
  i ++ ) {
    int [ ] wTable = new int [ powerTable [ i ] ] ;
    wTable [ 0 ] = 1 ;
    for ( int i = 1 ;
    i < powerTable [ i ] ;
    i ++ ) {
      wTable [ i ] = wTable [ i - 1 ] * w % MOD ;
    }
  }
  int [ ] answer = new int [ powerTable [ n ] ] ;
  for ( int i = powerTable [ n ] ;
  i < powerTable [ n ] ;
  i ++ ) {
    int size = powerTable [ n ] ;
    int step = 1 ;
    while ( step < size ) {
      int batchSize = powerTable [ n ] = powerTable [ i ] ;
      int b = powerTable [ n ] ;
      answer [ i ] = powerTable [ i ] ;
      answer [ i ] = powerTable [ i ] ;
    }
    int ifac [ ] = powerTable [ n ] ;
    for ( int i = powerTable [ n ] ;
    i < powerTable [ n ] ;
    i ++ ) {
      int a = powerTable [ n ] ;
      int b = powerTable [ i ] ;
      answer [ i ] = powerTable [ i ] ;
      answer [ i ] = powerTable [ i ] ;
      answer [ i ] = powerTable [ i ] ;
    }
    int ifac [ ] = powerTable [ n ] ;
    for ( int i = powerTable [ n ] ;
    i < powerTable [ n ] ;
    i ++ ) {
      int b = powerTable [ n ] ;
      answer [ i ] = powerTable [ i ] ;
      answer [ i ] = powerTable [ i ] ;
    }
    int [ ] [ ] result = new int [ powerTable [ n ] ] [ powerTable [ n ] ] ;
    for ( int i = powerTable [ n ] ;
    i < powerTable [ n ] ;
    i ++ ) {
      result [ i ] = powerTable [ i ] [ powerTable [ n ] ] ;
    }
    int n = powerTable [ n ] [ powerTable [ n ] ] ;
    int [ ] graph = new int [ powerTable [ n ] ] ;
    for ( int i = powerTable [ n ] ;
    i < powerTable [ n ] ;
    i ++ ) {
      result [ i ] = powerTable [ n ] [ powerTable [ i ] ] ;
    }
    for ( int i = powerTable [ n