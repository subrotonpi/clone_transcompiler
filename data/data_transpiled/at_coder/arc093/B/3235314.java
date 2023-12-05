public static String [ ] [ ] split ( String input , int a , int b ) {
  if ( a < b ) {
    String [ ] [ ] ans = new String [ 100 ] [ 100 ] ;
    for ( int i = 0 ;
    i < ans . length ;
    i ++ ) ans [ i ] [ 0 ] = "." ;
    int ichi = ( a - 1 ) / 50 ;
    int matsu = ( a - 1 ) % 50 ;
    for ( int i = 0 ;
    i < ichi ;
    i ++ ) {
      if ( i % 2 == 0 ) for ( int j = 0 ;
      j < 100 ;
      j += 2 ) ans [ i ] [ j ] = "#" ;
      else {
        for ( int j = 1 ;
        j < matsu ;
        j += 2 ) ans [ i ] [ j ] = "." ;
      }
    }
    for ( int j = 0 ;
    j < richi ;
    j += 2 ) ans [ 99 - 2 * richi ] [ j ] = "." ;
    System . out . println ( 100 + " " + ans [ i ] ) ;
    System . out . println ( ( String [ ] ) ans [ i ] ) ;
    System . out . println ( "\n" ) ;
    for ( int i = 0 ;
    i < 100 ;
    i += 2 ) ans [ i ] [ 0 ] = "#" ;
    for ( int j = 1 ;
    j < matsu ;
    j += 2 ) ans [ i ] [ 1 ] = "." ;
    for ( int j = 0 ;
    j < richi ;
    j += 2 ) ans [ i ] [ 2 ] = "." ;
    for ( int j = 0 ;
    j < richi ;
    j += 2 ) ans [ i ] [ 0 ] = "#" ;
    for ( int j = 1 ;
    j < richi ;
    j += 2 ) ans [ i ] [ 1 ] = "#" ;
    for ( int j = 0 ;
    j < richi ;
    j += 2 ) ans [ i ] [ 2 ] = "." ;
    for ( int j = 0 ;
    j < richi ;
    j += 2 ) ans [ i ] [ 0 ] = "#" ;
    for ( int j = 0 ;
    j < richi ;
    j += 2 ) ans [ i ] [ 1 ] = "#" ;
    for ( int j = 0 ;
    j < richi ;
    j += 2 ) ans [ i ] [ 2