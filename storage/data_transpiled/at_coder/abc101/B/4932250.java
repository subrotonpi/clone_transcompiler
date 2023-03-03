public static String input ( ) {
  int N = input . nextInt ( ) ;
  int S = 0 ;
  for ( String n : N ) {
    S += Integer . parseInt ( n ) ;
  }
  N = Integer . parseInt ( N ) ;
  return ( N % S == 0 ? "Yes" : "No" ) ;
}
