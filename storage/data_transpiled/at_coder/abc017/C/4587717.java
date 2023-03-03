public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ M + 1 ] ;
  int sSum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ l - 1 ] += s ;
    A [ r ] -= s ;
    sSum += s ;
  }
  final int [ ] B = new int [ N ] ;
  System . arraycopy ( A , 0 , B , 0 , B . length ) ;
  return B [ 0 ] ;
}
