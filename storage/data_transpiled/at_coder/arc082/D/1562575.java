static final double [ ] [ ] a ( int i , int k , int [ ] a , int [ ] [ ] b , int [ ] [ ] c , int [ ] [ ] a ) {
  int [ ] [ ] a = new int [ 10 ] [ 7 ] ;
  int inf = 10 * 20 ;
  int [ ] [ ] gosa = 1.0 / 10 * 10 ;
  int [ ] [ ] mod = 10 * 9 + 7 ;
  {
    int [ ] [ ] tt = new int [ 3 ] [ 3 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      int [ ] ai = a [ j ] ;
      int e = ai [ 0 ] ;
      tt [ 0 ] = ai [ 4 ] ;
      if ( e - ai [ 2 ] <= 0 ) tt [ 3 ] = ai [ 3 ] ;
      else tt [ 1 ] = ai [ 1 ] ;
      if ( ti % 2 == 0 ) tt [ 0 ] -= c [ 5 ] ;
      else tt [ 2 ] += c [ 5 ] ;
      if ( tt [ 0 ] > e ) tt [ 0 ] = e ;
    }
    rr [ 0 ] = tt [ 0 ] ;
    System . arraycopy ( a , 0 , a , 1 , 3 ) ;
  }
  {
    int [ ] [ ] tt = new int [ 3 ] [ 3 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      int [ ] ai = a [ j ] ;
      int e = ai [ 0 ] ;
      int [ ] tt = ai [ 1 ] ;
      if ( e > 0 ) tt [ 0 ] = e - ai [ 2 ] ;
      else tt [ 1 ] = e - ai [ 3 ] ;
      if ( tt [ 0 ] < e ) tt [ 0 ] = e ;
      else tt [ 2 ] = e ;
    }
    System . arraycopy ( a , 0 , tt , 0 , 3 ) ;
  }
  {
    int [ ] [ ] tt = new int [ 3 ] [ 3 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      int [ ] ai = a [ j ] ;
      int e = ai [ 0 ] ;
      if ( e > 0 ) tt [ 0 ] = e - ai [ 3 ] ;
      else tt [ 0 ] += e - ai [ 1 ] ;
      if ( tt [ 0 ] > e ) tt [ 0 ] = e ;
    }
    rr [ 0 ] = tt [ 0 ] ;
  }
  System . out . println ( main ( ) ) ;
}
