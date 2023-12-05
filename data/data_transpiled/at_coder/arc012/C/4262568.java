{
  square = new char [ 29 ] [ 5 ] [ 5 ] ;
  for ( int i = 0 ;
  i < 19 ;
  i ++ ) {
    square [ i ] [ 0 ] = '.' ;
  }
  char [ ] [ ] result = new char [ 29 ] [ 5 ] ;
  int i = 0 ;
  int l = 4 ;
  char [ ] backward = new char [ 5 ] [ 24 ] , forward = new char [ 5 ] [ 24 ] ;
  for ( int i = 0 ;
  i < 5 ;
  i ++ ) {
    result [ i ] [ i ] = 'x' ;
  }
  char [ ] result = new char [ 5 ] [ 24 ] ;
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    result [ i ] [ i ] = '.' ;
  }
  char [ ] result = new char [ 5 ] [ 24 ] ;
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    result [ i ] [ i ] = 'x' ;
  }
  char [ ] result = new char [ 5 ] ;
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    result [ i ] [ i ] = '.' ;
  }
  char [ ] result = new char [ 5 ] ;
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    result [ i ] [ i ] = 'x' ;
  }
  char [ ] result = new char [ 5 ] ;
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    result [ i ] [ i ] = '.' ;
  }
  char [ ] result = new char [ 5 ] ;
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    result [ i ] [ i ] = '.' ;
  }
  char [ ] result = new char [ 5 ] ;
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    result [ i ] [ i ] = '.' ;
  }
  System . out . println ( result ) ;
  return result ;
}
