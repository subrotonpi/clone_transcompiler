static final String getLine2 ( ) {
  String line1 = System . in . readLine ( ) ;
  String line2 = System . in . readLine ( ) ;
  int [ ] components = new int [ 2 ] ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    components [ i ] = Integer . parseInt ( line2 . trim ( ) ) ;
  }
  int count = 0 ;
  while ( Arrays . binarySearch ( components , 0 , count ) < 0 ) {
    count ++ ;
    components = new int [ components . length ] ;
    for ( int i = 0 ;
    i < components . length ;
    i ++ ) {
      components [ i ] = components [ i ] / 2 ;
    }
  }
  return line1 ;
}
