public static int [ ] [ ] solve ( ) {
  String s = scanner . nextLine ( ) ;
  int cases = Integer . parseInt ( s ) ;
  for ( int testCase = 0 ;
  testCase < cases ;
  testCase ++ ) {
    System . out . println ( "Case #" + ( testCase + 1 ) + ":" ) ;
    s = scanner . nextLine ( ) ;
    int [ ] seens = new int [ 128 ] ;
    for ( int i = 0 ;
    i < 128 ;
    i ++ ) {
      seens [ i ] = - 1 ;
    }
    int seen = 1 ;
    int [ ] [ ] x = new int [ 128 ] [ 128 ] ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      char ch = s . charAt ( i ) ;
      if ( seens [ ( int ) ch ] == - 1 ) {
        seens [ ( int ) ch ] = seen ;
        if ( seen == 1 ) {
          seen = 0 ;
        }
        else if ( seen == 0 ) {
          seen = 2 ;
        }
        else {
          seen = seen + 1 ;
        }
      }
      x = Arrays . copyOf ( x , x . length + 1 ) ;
    }
    if ( seen == 1 ) {
      seen = 2 ;
    }
    else if ( seen == 0 ) {
      seen = 2 ;
    }
    int z = 0 ;
    if ( 0 != x . length ) {
      System . out . println ( "" + 0 ) ;
    }
    else {
      while ( x . length > 0 ) {
        z = z * seen + x [ 0 ] ;
        x = Arrays . copyOfRange ( x , 1 , x . length ) ;
      }
      System . out . println ( "" + z ) ;
    }
  }
  return x ;
}
