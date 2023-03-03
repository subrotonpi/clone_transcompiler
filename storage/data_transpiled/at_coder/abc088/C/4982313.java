{
  s = Arrays . asList ( new LinkedList < Integer > ( ) ) ;
  t = new int [ 3 ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    t [ i ] = new int [ ] {
      s [ i ] [ 0 ] - s [ i ] [ 1 ] , s [ i ] [ 0 ] - s [ i ] [ 2 ] }
      ;
    }
    if ( t [ 0 ] == t [ 1 ] && t [ 0 ] == t [ 2 ] ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  