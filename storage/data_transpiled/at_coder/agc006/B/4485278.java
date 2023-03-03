public static void print ( int n , int x ) {
  int [ ] A = new int [ 2 * n ] ;
  for ( int i = 1 ;
  i <= 2 * n ;
  i ++ ) A [ i ] = i ;
  if ( x == 1 || x == 2 * n - 1 ) System . out . println ( "No" ) ;
  else {
    System . out . println ( "Yes" ) ;
    if ( n == 2 ) {
      System . out . print ( ( String ) A [ 0 ] + "\n" ) ;
    }
    else {
      int [ ] T ;
      if ( x == 2 ) {
        T = new int [ ] {
          3 , 2 , 1 , 4 }
          ;
        }
        else {
          T = new int [ ] {
            x - 1 , x , x + 1 , x - 2 }
            ;
          }
          List < String > S = new ArrayList < String > ( Arrays . asList ( A ) ) ;
          S . removeAll ( T ) ;
          List < String > ans = new ArrayList < String > ( ) ;
          for ( int i = 0 ;
          i < n - 2 ;
          i ++ ) {
            ans . add ( S . get ( i ) + T . get ( i ) ) ;
          }
          System . out . print ( ans + "\n" ) ;
        }
      }
    }
    