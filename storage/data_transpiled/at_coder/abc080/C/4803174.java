public static String solve ( String string ) {
  String n , * is = string . split ( " " ) ;
  n = Integer . parseInt ( n ) ;
  char [ ] f = is . toCharArray ( ) ;
  int [ ] p = new int [ 10 * n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) p [ i ] = Integer . parseInt ( new String ( f , 10 * i , 10 * ( i + 1 ) ) ) ;
  int ans = - n * 10 * 7 ;
  int [ ] intF = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) intF [ i ] = Integer . parseInt ( new String ( f , 10 * i , 10 * ( i + 1 ) , 2 ) ) ;
  for ( int o = 1 ;
  o <= 2 * 10 ;
  o ++ ) {
    int [ ] tmp = new int [ intF . length ] ;
    for ( int i = 0 ;
    i < tmp . length ;
    i ++ ) tmp [ i ] = Integer . parseInt ( new String ( intF [ i ] & _f ) + "" ) ;
    ans = Math . max ( ans , Arrays . stream ( tmp ) . mapToInt ( i -> p [ 11 * i + t ] ) . sum ( ) ) ;
  }
  return String . valueOf ( ans ) ;
}
