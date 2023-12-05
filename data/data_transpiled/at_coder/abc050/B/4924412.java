public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > T = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > tmp = Lists . newArrayList ( ) ;
    tmp . add ( T . get ( p - 1 ) ) ;
    tmp . add ( x ) ;
    ans . add ( sum ( tmp ) ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    System . out . println ( ans . get ( i ) ) ;
  }
  return ans . toArray ( new Integer [ 0 ] ) ;
}
