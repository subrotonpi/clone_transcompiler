static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int P = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] Z = new int [ N ] [ R ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int z = Integer . parseInt ( input . nextLine ( ) ) ;
    Z [ x - 1 ] [ y ] = ( y - 1 ) ;
  }
  @ SuppressWarnings ( "unused" ) int ans = 0 ;
  for ( int C = 0 ;
  C < N ;
  C ++ ) {
    int [ ] man = new int [ M ] ;
    for ( int c = 0 ;
    c < C ;
    c ++ ) {
      for ( int z : Z [ c ] ) man [ z [ 0 ] ] += z [ 1 ] ;
    }
    Arrays . sort ( man , Collections . reverseOrder ( ) ) ;
    ans = Math . max ( ans , Arrays . asList ( man ) . subList ( 0 , Q ) ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
