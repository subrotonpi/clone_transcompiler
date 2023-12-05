public static int getInt ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , K = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = 0 ;
  for ( int b = 1 ;
  b <= N ;
  b ++ ) {
    res += Math . max ( b - K , 0 ) * ( N / b ) ;
    res += Math . max ( N % b - K + 1 , 0 ) ;
  }
  if ( K == 0 ) {
    res -= N ;
  }
  System . out . println ( res ) ;
  return res ;
}
