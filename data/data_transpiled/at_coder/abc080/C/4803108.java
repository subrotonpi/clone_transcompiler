@ VisibleForTesting static String solve ( String string ) {
  final int n = Integer . parseInt ( string ) ;
  final int ... is = string . split ( " " ) ;
  final char [ ] f = is . clone ( ) ;
  final char [ ] p = is . clone ( ) ;
  int ans = - n * 10 * 7 ;
  final int [ ] intF = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    intF [ i ] = Integer . parseInt ( new String ( Arrays . copyOfRange ( f , 10 * i , 10 * ( i + 1 ) ) , 2 ) ) ;
  }
  for ( int o = 1 ;
  o <= 2 * 10 ;
  o ++ ) {
    final int [ ] tmp = new int [ intF . length ] ;
    for ( int i = 0 ;
    i < tmp . length ;
    i ++ ) {
      tmp [ i ] = Integer . parseInt ( "" + ( o & _f ) + "" ) ;
    }
    ans = Math . max ( ans , Arrays . stream ( tmp ) . mapToInt ( x -> x ) . sum ( ) ) ;
  }
  return String . valueOf ( ans ) ;
}
