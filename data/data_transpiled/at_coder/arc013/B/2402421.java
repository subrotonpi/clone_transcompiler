public static int inpl ( ) {
  return map . get ( input ( ) ) ;
  int C = Integer . parseInt ( input ( ) ) ;
  int a = 0 , b = 0 , c = 0 ;
  for ( ;
  ;
  ) {
    int N = inpl ( ) ;
    int M = inpl ( ) ;
    int L = inpl ( ) ;
    a = Math . max ( a , N ) ;
    b = Math . max ( b , M ) ;
    c = Math . max ( c , L ) ;
  }
  System . out . println ( a * b * c ) ;
}
