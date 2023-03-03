public static void N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  A = list ( map ( N , input ( ) ) ) ;
  A = new ArrayList ( A ) ;
  System . out . println ( A . get ( A . size ( ) - 1 ) - A . get ( 0 ) ) ;
}
