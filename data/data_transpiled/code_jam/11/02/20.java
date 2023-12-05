static private int listFind ( String list , String item ) {
  for ( int i = 0 ;
  i < list . length ( ) ;
  i ++ ) {
    if ( list . charAt ( i ) == item ) return i ;
  }
  return - 1 ;
}
