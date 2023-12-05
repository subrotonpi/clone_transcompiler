static private int numRecycledGreater ( int x , int ceiling , int digits ) throws IOException {
  final int count = 0 ;
  int power = ( int ) Math . pow ( 10 , digits - 1 ) ;
  int y = x / 10 + ( x % 10 ) * power ;
  Set < Integer > done = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < digits - 1 ;
  i ++ ) {
    if ( ! done . contains ( y ) ) {
      if ( y <= ceiling && y > x ) {
        count ++ ;
      }
      done . add ( y ) ;
    }
    y = y / 10 + ( y % 10 ) * power ;
  }
  return count ;
}
