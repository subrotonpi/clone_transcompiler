public static void main ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  A = list ( map ( Integer . parseInt , input ( ) ) ) ;
  A . sort ( ) ;
  System . out . println ( sum ( A [ N : : 2 ] ) ) ;
}
