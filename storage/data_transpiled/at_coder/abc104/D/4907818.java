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
        case '?' : long [ ] tmp = new long [ 4 ] ;
        for ( int j = 0 ;
        j < 4 ;
        j ++ ) tmp [ j ] = a [ j ] ;
        a [ 0 ] = tmp [ 0 ] * 3 ;
        for ( int j = 0 ;
        j < 3 ;
        j ++ ) tmp [ j ] = a [ j ] ;
      }
    }
    System . out . println ( a [ 3 ] ) ;
  }
  