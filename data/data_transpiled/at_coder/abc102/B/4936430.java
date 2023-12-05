public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  A = list ( map ( N , input ( ) ) ) ;
  return A . max ( ) - A . min ( ) ;
}
