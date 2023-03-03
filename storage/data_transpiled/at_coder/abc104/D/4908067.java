public static void input ( Scanner s ) {
  double [ ] a = {
    1 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      char c = s . charAt ( i ) ;
      if ( c == 'A' ) {
        a [ 1 ] += a [ 0 ] ;
      }
      else if ( c == 'B' ) {
        a [ 2 ] += a [ 1 ] ;
      }
      else if ( c == 'C' ) {
        a [ 3 ] += a [ 2 ] ;
      }
      else if ( c == '?' ) {
        a = new double [ 4 ] ;
        for ( int j = 1 ;
        j < 4 ;
        j ++ ) {
          a [ j ] += a [ j ] * 3 + a [ j - 1 ] ;
        }
      }
      a = new double [ 4 ] ;
      for ( int j = 0 ;
      j < 4 ;
      j ++ ) {
        a [ j ] = a [ j ] % 1000000007 ;
      }
    }
    System . out . println ( a [ 3 ] ) ;
  }
  