static final void warshall_floyd ( int [ ] [ ] dist , int n ) {
  Scanner input = new Scanner ( System . in ) ;
  float inf = Float . MAX_VALUE ;
  /* Warshall floyd */
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( i == j ) {
          dist [ i ] [ j ] = 0 ;
        }
        else if ( dist [ i ] [ j ] > dist [ i ] [ k ] + dist [ k ] [ j ] ) {
          dist [ i ] [ j ] = dist [ i ] [ k ] + dist [ k ] [ j ] ;
        }
      }
    }
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Edge > edges = new ArrayList < > ( ) ;
  int [ ] [ ] ad = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ad [ i ] [ i ] = inf ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
    edges . add ( new Edge ( a , b , c ) ) ;
    ad [ a ] [ b ] = c ;
    ad [ b ] [ a ] = c ;
  }
  warshall_floyd ( ad , N ) ;
  int ans = M ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    int b = edges . get ( a ) ;
    if ( a > b ) {
      a = b ;
      b = a ;
    }
    for ( int s = 0 ;
    s < N ;
    s ++ ) {
      for ( int e = s + 1 ;
      e < N ;
      e ++ ) {
        if ( ad [ s ] [ a ] + c + ad [ b ] [ e ] == ad [ s ] [ e ] ) {
          ans -- ;
          break ;
        }
      }
      else {
        continue ;
      }
      break ;
    }
  }
  System . out . println ( ans ) ;
}
