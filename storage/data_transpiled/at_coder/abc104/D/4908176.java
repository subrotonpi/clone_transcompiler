public static void input ( ) {
  String s = input ( ) ;
  long [ ] a = {
    1 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( s . charAt ( i ) == 'A' ) a [ 1 ] += a [ 0 ] ;
      else if ( s . charAt ( i ) == 'B' ) a [ 2 ] += a [ 1 ] ;
      else if ( s . charAt ( i ) == 'C' ) a [ 3 ] += a [ 2 ] ;
      else a = new long [ 3 ] ;
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) a [ j ] = a [ j ] % 1000000007 ;
    }
    System . out . println ( a [ 3 ] ) ;
  }
  