static final int solve ( ) {
  int tn = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int ti = 0 ;
  ti < xrange ( tn ) ;
  ti ++ ) {
    String s = System . console ( ) . readLine ( ) ;
    Map < Character , Integer > map = new HashMap < > ( ) ;
    for ( char c : s . toCharArray ( ) ) {
      if ( ! map . containsKey ( c ) ) {
        map . put ( c , 1 ) ;
      }
      else {
        map . get ( c ) ++ ;
      }
    }
    int [ ] x = new int [ 10 ] ;
    x [ 0 ] = map . get ( 'Z' ) ;
    x [ 2 ] = map . get ( 'W' ) ;
    x [ 4 ] = map . get ( 'U' ) ;
    x [ 6 ] = map . get ( 'X' ) ;
    x [ 8 ] = map . get ( 'G' ) ;
    x [ 1 ] = map . get ( 'O' ) - x [ 0 ] - x [ 2 ] - x [ 4 ] ;
    x [ 3 ] = map . get ( 'R' ) - x [ 0 ] - x [ 4 ] ;
    x [ 5 ] = map . get ( 'F' ) - x [ 4 ] ;
    x [ 7 ] = map . get ( 'S' ) - x [ 6 ] ;
    x [ 9 ] = map . get ( 'I' ) - map . get ( 'F' ) + x [ 4 ] - x [ 6 ] - x [ 8 ] ;
    String sol = new String ( new char [ ] {
      ( char ) ( '0' + i ) * x [ i ] }
      ) ;
      System . out . println ( "Case #" + ( ti + 1 ) + ": " + sol ) ;
    }
    return tn ;
  }
  