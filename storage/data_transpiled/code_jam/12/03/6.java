static private int [ ] recycleList ( Object param ) {
  final Set < Integer > list = new HashSet < Integer > ( ) ;
  String x = param . toString ( ) ;
  for ( int i = 0 ;
  i < x . length ( ) ;
  i ++ ) {
    if ( x . charAt ( i ) != '0' ) {
      list . add ( Integer . parseInt ( x ) ) ;
    }
    x = x . substring ( 1 ) + x . substring ( 0 ) ;
  }
  return ( Math . min ( list . size ( ) , list . size ( ) ) ) ;
}
