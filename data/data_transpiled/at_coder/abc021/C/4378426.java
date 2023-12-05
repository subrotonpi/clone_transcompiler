static final int [ ] [ ] getAdjacency ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int a , b ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] Adjacency = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    Adjacency [ x - 1 ] [ y - 1 ] = Adjacency [ y - 1 ] [ x - 1 ] = 1 ;
  }
  a = a - 1 ;
  b = b - 1 ;
  int [ ] [ ] walk = new int [ N ] [ 1 ] ;
  walk [ a ] = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    walk = Arrays . copyOf ( Adjacency , N ) ;
    if ( ( walk [ b ] != 0 ) && ( walk [ b ] [ 0 ] != 0 ) ) {
      System . out . println ( ( int ) ( walk [ b ] [ 0 ] % ( 1e9 + 7 ) ) ) ;
      break ;
    }
  }
  return walk ;
}
