static final String solve ( ) throws IOException {
  final BufferedReader fin = new BufferedReader ( new FileReader ( sys ) ) ;
  final PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "p3.out" ) ) ) ;
  int [ ] [ ] blocks = new int [ 2 ] [ 2 ] ;
  int [ ] dists = new int [ 2 ] [ 2 ] ;
  int i ;
  int D = 0 ;
  for ( int j = 0 ;
  j < 2 ;
  j ++ ) {
    int yd = Math . max ( b1 [ j ] - b2 [ j ] , b2 [ j ] - b1 [ j ] ) ;
    int xd = Math . max ( b1 [ j ] - b2 [ j ] , b2 [ j ] - b1 [ j ] ) ;
    return Math . max ( xd , yd ) - 1 ;
  }
  int [ ] mindist = new int [ 2 ] [ 2 ] ;
  for ( i = 0 ;
  j < 2 ;
  i ++ ) {
    vis [ i ] = false ;
  }
  int [ ] dist = new int [ 2 ] ;
  for ( j = 0 ;
  j < 2 ;
  j ++ ) {
    dist [ j ] = 10000 ;
  }
  dist [ 0 ] = 0 ;
  Stream < Integer > Q = new Stream < Integer > ( ) ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    Q . add ( dist [ j ] ) ;
  }
  heapify ( Q ) ;
  while ( Q . hasNext ( ) ) {
    int u = heapify ( Q ) . next ( ) ;
    if ( vis [ u ] ) continue ;
    else if ( u == n - 1 ) break ;
    else {
      vis [ u ] = true ;
    }
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int v = heapify ( Q ) . next ( ) ;
      if ( ! vis [ v ] && dist [ u ] + adj [ u ] [ v ] < dist [ v ] ) {
        dist [ v ] = dist [ u ] + adj [ u ] [ v ] ;
        heapify ( Q ) ;
      }
    }
  }
  return dist [ n - 1 ] ;
}
