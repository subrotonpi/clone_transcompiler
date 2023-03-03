public static void inpl ( ) {
  return new LinkedList < Integer > ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  inpl ( A ) ;
  int tmp = 1 ;
  int size = A [ 0 ] ;
  for ( int a = 1 ;
  a < A . length ;
  a ++ ) {
    tmp = tmp * ( a <= 2 * size ) + 1 ;
    size += a ;
  }
  System . out . println ( tmp ) ;
}
