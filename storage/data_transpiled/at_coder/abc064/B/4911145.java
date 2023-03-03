public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  As = list ( map ( N , Integer . parseInt ( input ( ) ) ) ) ;
  return N - ( max ( As ) - min ( As ) ) ;
}
