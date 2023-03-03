@ input T static < T > void input ( ) {
  int [ ] [ ] left = new int [ T ] [ ] ;
  int [ ] [ ] startKeys = new int [ T ] [ ] ;
  int [ ] [ ] chests = new int [ T ] [ ] ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    int y = a [ i ] . length ;
    System . arraycopy ( a [ i ] , 0 , startKeys [ i ] , 0 , T ) ;
    System . arraycopy ( a [ i ] , 0 , startKeys [ i ] , 0 , T ) ;
  }
  {
    int [ ] x = new int [ 201 ] ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      x [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      x [ i ] += a [ i ] [ i ] ;
    }
  }
  {
    int [ ] need = new int [ T ] ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      need [ i ] = a [ i ] [ 1 ] ;
    }
    int [ ] nct = ct ( need ) ;
    int [ ] have = new int [ T ] ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      have [ i ] += keys [ i ] [ 2 ] ;
    }
    int [ ] kct = ct ( have ) ;
    for ( int q = 1 ;
    q < 201 ;
    q ++ ) {
      if ( kct [ q ] < nct [ q ] ) {
        return ;
      }
    }
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      if ( left [ i ] [ 1 ] != 0 ) {
        int [ ] x = solve ( removed ( keys , left [ i ] [ 1 ] ) + left [ i ] [ 2 ] , left , 0 , i + 1 , acc . add ( left [ i ] [ 0 ] ) ) ;
        if ( x . length != 0 ) {
          return ;
        }
      }
    }
  }
  for ( int testCase = 0 ;
  testCase < T ;
  testCase ++ ) {
    Arrays . sort ( keys ) ;
    int [ ] startKeys = new int [ T ] ;
    Arrays . sort ( starts ) ;
    int [ ] [ ] chests = new int [ T ] [ T ] ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      Arrays . fill ( chests [ i ] [ 0 ] ,