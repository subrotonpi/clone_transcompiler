static final int dp ( int i ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int j = 1 ;
  j < N ;
  j ++ ) a [ j ] = - 1 ;
  a [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  for ( int j = 1 ;
  j < N ;
  j ++ ) G [ a [ j ] ] [ j ] = j ;
  /*if (G[i].length == 0) {
  }*/
  PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) ;
  for ( int j : G [ i ] ) {
    q . add ( j ) ;
  }
  int k = 1 ;
  int res = 0 ;
  while ( ( q . size ( ) > 0 ) && ( res < 0 ) ) {
    int x = - q . poll ( ) ;
    res = Math . max ( res , x + k ++ ) ;
  }
  return res ;
}
