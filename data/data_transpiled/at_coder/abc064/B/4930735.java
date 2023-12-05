public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  List l = new ArrayList ( map ( N , Integer . parseInt ( input ( ) ) ) ) ;
  return ( l . get ( l . size ( ) - 1 ) - l . get ( 0 ) ) ;
}
