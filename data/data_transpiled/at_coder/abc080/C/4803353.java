public static String solve ( String string ) {
  int n = Integer . parseInt ( string ) ;
  final int ... is = is . length ;
  final String f = Arrays . copyOfRange ( is , 0 , 10 * n ) ;
  final String p = Arrays . copyOfRange ( is , 10 * n , is . length ) ;
  final int [ ] intF = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    intF [ i ] = Integer . parseInt ( f . substring ( 10 * i , 10 * ( i + 1 ) ) , 2 ) ;
  }
  return String . valueOf ( Math . max ( Arrays . stream ( intF ) . mapToInt ( o -> p . substring ( 11 * i + Integer . valueOf ( o & _f ) . indexOf ( "1" ) ) ) . sum ( ) , Integer . valueOf ( 2 * n ) ) . toArray ( ) [ 0 ] ) ;
}
