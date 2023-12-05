public static String input ( ) {
  N = input ( ) ;
  n = Integer . parseInt ( N ) ;
  sn = sum ( list ( list ( N ) ) ) ;
  return ( n % sn == 0 ? "Yes" : "No" ) ;
}
