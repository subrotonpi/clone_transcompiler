private static String solve ( String string ) {
  String n , * is = string . substring ( 0 , string . length ( ) - 1 ) ;
  n = Integer . parseInt ( n ) ;
  char [ ] f = new char [ 10 * n ] ;
  int [ ] p = new int [ 10 * n ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( new String ( f , 10 * i , 10 * ( i + 1 ) , 2 ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( new String ( f , 10 * i , 2 ) ) ;
  }
  return String . valueOf ( Math . max ( Integer . valueOf ( p [ 11 * i + Integer . valueOf ( o & _f ) . intValue ( ) ) . intValue ( ) ) , Integer . valueOf ( intF [ 11 * i ] ) ) ;
}
