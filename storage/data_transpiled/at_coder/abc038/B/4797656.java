{
  n = Arrays . asList ( new LinkedList < Integer > ( ) ) ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    if ( n [ 0 ] . get ( 0 ) == n [ 1 ] || n [ 0 ] . get ( 1 ) == n [ 1 ] ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  return n ;
}
