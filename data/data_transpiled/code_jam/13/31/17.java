public static final int T = Integer . parseInt ( readLine ( ) ) {
  final String consonants = "bcdfghjklmnpqrstvwxyz" ;
  /* Check that consonants are not in consonants */
  int T = Integer . parseInt ( readLine ( ) ) ;
  String [ ] line ;
  int i = 0 ;
  int numConseCons = 0 ;
  while ( i < L ) {
    if ( ! consonants . contains ( line [ i ] ) ) {
      numConseCons = 0 ;
    }
    else {
      numConseCons ++ ;
      if ( numConseCons >= n ) {
        return true ;
      }
    }
    i ++ ;
  }
  /* Check that consonants are in consonants */
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    line = Arrays . asList ( readLine ( ) . split ( " " ) ) ;
    String name = line [ 0 ] ;
    int n = Integer . parseInt ( line [ 1 ] ) ;
    int [ ] A = new int [ name . length ( ) ] ;
    int [ ] B = new int [ name . length ( ) ] ;
    for ( int i = 0 ;
    i <= name . length ( ) ;
    i ++ ) {
      if ( consonants . contains ( name . charAt ( i ) ) ) {
        if ( i == 0 ) {
          B [ i ] = 1 ;
        }
        else {
          B [ i ] = B [ i - 1 ] + 1 ;
        }
      }
      else {
        B [ i ] = 0 ;
      }
    }
    if ( n == 1 && consonants . contains ( name . charAt ( i ) ) ) {
      A [ 0 ] = 1 ;
    }
    for ( int i = 1 ;
    i <= name . length ( ) ;
    i ++ ) {
      if ( B [ i ] < n ) {
        A [ i ] = A [ i - 1 ] ;
      }
      else {
        A [ i ] = i - n + 2 ;
      }
    }
    int res = 0 ;
    for ( int i = 0 ;
    i < name . length ( ) ;
    i ++ ) {
      res += A [ i ] ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
  }
  return T ;
}
