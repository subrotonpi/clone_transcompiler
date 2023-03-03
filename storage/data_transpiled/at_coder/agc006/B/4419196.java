public static void print ( int n , int x ) {
  if ( x == 1 || x == 2 * n - 1 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
    int [ ] mid = {
      x - 1 , x , x + 1 }
      ;
      if ( x != 2 * n - 2 ) {
        mid = new int [ n ] ;
        mid [ 0 ] = x + 2 ;
      }
      if ( x != 2 ) {
        mid [ 1 ] = x - 2 ;
      }
      int [ ] hoge = Arrays . copyOf ( mid , 2 * n ) ;
      hoge [ 0 ] = i ;
      hoge [ 1 ] = i ;
      hoge [ 2 ] = i ;
      int ans = hoge [ n - 2 ] + mid [ n - 2 ] + hoge [ n - 2 ] ;
      System . out . print ( ( String ) ans ) ;
    }
  }
  