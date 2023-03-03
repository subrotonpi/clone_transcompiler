public static void input ( ) {
  List l = new ArrayList ( map ( Integer . parseInt , input ( ) . split ( ) ) ) ;
  System . out . println ( l . get ( l . size ( ) - 1 ) - l . get ( 0 ) ) ;
}
