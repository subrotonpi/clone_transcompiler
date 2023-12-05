public static void f ( int n ) {
  char [ ] s = new char [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = 'o' ;
  }
  {
    char [ ] a = new char [ n ] ;
    for ( int k = 0 ;
    k < n ;
    k ++ ) {
      if ( s [ k ] == 'o' && a [ k ] == 1 ) {
        a [ k + 1 ] = a [ k - 1 ] ;
      }
      else if ( s [ k ] == 'o' && a [ k ] == - 1 ) {
        a [ k + 1 ] = a [ k - 1 ] * ( - 1 ) ;
      }
      else if ( s [ k ] == 'x' && a [ k ] == 1 ) {
        a [ k + 1 ] = a [ k - 1 ] * ( - 1 ) ;
      }
      else {
        a [ k + 1 ] = a [ k - 1 ] ;
      }
    }
  }
  int judge = - 1 ;
  for ( char [ ] e : new char [ ] [ ] {
    {
      1 , 1 }
      , {
        1 , - 1 }
        , {
          - 1 , 1 }
          , {
            - 1 , - 1 }
          }
          ) {
            if ( judge == - 1 ) {
              char [ ] a = new char [ n ] ;
              a [ 0 ] = e [ 0 ] ;
              a [ 1 ] = e [ 1 ] ;
              for ( int j = 1 ;
              j < n - 1 ;
              j ++ ) {
                f ( a [ j ] ) ;
              }
              if ( s [ 0 ] == 'o' && a [ 0 ] == 1 ) {
                if ( a [ 1 ] == a [ - 1 ] ) judge = 1 ;
              }
              else if ( s [ 0 ] == 'o' && a [ 0 ] == - 1 ) {
                if ( a [ 1 ] == a [ - 1 ] * ( - 1 ) ) judge = 1 ;
              }
              else if ( s [ 0 ] == 'x' && a [ 0 ] == 1 ) {
                if ( a [ + 1 ] == a [ - 1 ] * ( - 1 ) ) judge = 1 ;
              }
              else {
                if ( a [ 1 ] == a [ - 1 ] ) judge = 1 ;
              }
            }
          }
        }
        