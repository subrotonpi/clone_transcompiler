public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] p = inpl ( ) ;
  String H = "" ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( i != p [ i - 1 ] ) {
      H += '1' ;
    }
    else {
      H += '0' ;
    }
  }
  H = H . replace ( "00" , "1" ) ;
  int ans = N - H . length ( ) ;
  ans += H . indexOf ( '0' ) ;
  System . out . println ( ans ) ;
}
