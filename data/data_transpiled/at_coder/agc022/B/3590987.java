@ Sys public static void Sys ( ) {
  d_in = new d_in ( ) ;
  int MAX = 30000 ;
  int N = d_in . nextInt ( ) ;
  int [ ] base = {
    3 , 25 , 2 , 35 , 55 }
    ;
    int [ ] cand = new int [ N ] ;
    for ( int i = 4 ;
    i <= MAX / 2 ;
    i += 2 ) {
      cand [ i ] = i ;
      cand [ i + 1 ] = MAX - i ;
    }
    for ( int i = 9 ;
    i <= MAX / 2 ;
    i += 6 ) {
      cand [ i ] = i ;
      cand [ i + 1 ] = MAX - i ;
    }
    List ans = new ArrayList ( ) ;
    if ( N < 5 ) {
      System . arraycopy ( base , 0 , ans , 0 , 3 ) ;
      if ( N == 4 ) ans . add ( MAX ) ;
    }
    else if ( N % 2 == 1 ) {
      System . arraycopy ( base , 0 , ans , 3 , N ) ;
      ans . add ( MAX ) ;
      ans . add ( cand [ 0 ] ) ;
    }
    System . out . println ( ans ) ;
  }
  