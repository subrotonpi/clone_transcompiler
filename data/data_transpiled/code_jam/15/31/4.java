@ functools . private static synchronized Fun < String , String > solve ( ) {
  final int R = Integer . parseInt ( R ) ;
  final int W = Integer . parseInt ( R ) ;
  if ( C % W == 0 ) {
    score += ( C / W ) ;
  }
  else {
    assert C % W != 0 ;
  }
  final Object [ ] cache = new Object [ R ] ;
  System . arraycopy ( R , 0 , cache , 0 , R ) ;
  final Object [ ] a = new Object [ R ] ;
  System . arraycopy ( a , 0 , a , 0 , R ) ;
  if ( ! a [ 0 ] . equals ( "" ) ) {
    cache [ C ] = new Object [ C ] ;
    System . arraycopy ( a , 0 , cache , 0 , C ) ;
  }
  System . arraycopy ( C , 0 , cache , 0 , C ) ;
  System . arraycopy ( a , 0 , cache , C ) ;
  System . arraycopy ( a , 0 , cache , C , W ) ;
  return new Fun < String , String > ( ) {
    @ Override public String apply ( String arg0 ) {
      return arg0 + " " + arg0 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg2 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg1 + " " + arg2 + " " + arg1