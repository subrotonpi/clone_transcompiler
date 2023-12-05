public static void input ( Scanner s ) {
  long [ ] a = {
    1 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      char c = s . charAt ( i ) ;
      switch ( c ) {
        case 'A' : a [ 1 ] = ( a [ 1 ] + a [ 0 ] ) % 1000000007 ;
        break ;
        case 'B' : a [ 2 ] = ( a [ 2 ] + a [ 1 ] ) % 1000000007 ;
        break ;
        case 'C' : a [ 3 ] = ( a [ 3 ] + a [ 2 ] ) % 1000000007 ;
        break ;
        case '?' : long [ ] tmp = new long [ 4 ] ;
        for ( int j = 0 ;
        j < tmp . length ;
        j ++ ) tmp [ j ] = a [ j ] ;
        a = new long [ 4 ] ;
      }
    }
    System . out . println ( a [ 3 ] % 1000000007 ) ;
  }
  