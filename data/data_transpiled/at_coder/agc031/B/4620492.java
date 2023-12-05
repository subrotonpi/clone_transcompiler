public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int dp = 1 ;
  int [ ] prev = new int [ max ( c ) ] ;
  return prev ;
}
