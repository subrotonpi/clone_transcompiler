public static void input ( Scanner s ) {
  long [ ] a = {
    1 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      char c = s . charAt ( i ) ;
      switch ( c ) {
        case 'A' : a [ 1 ] += a [ 0 ] ;
        break ;
        case 'B' : a [ 2 ] += a [ 1 ] ;
        break ;
        case 'C' : a [ 3 ] += a [ 2 ] ;
        break ;
        default : a = new long [ 3 ] ;
        for ( int j = 0 ;
        j < 3 ;
        j ++ ) a [ j ] = a [ j ] % 1000000007 ;
      }
    }
    System . out . println ( a [ 3 ] ) ;
  }
  