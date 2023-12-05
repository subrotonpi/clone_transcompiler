@ VisibleForTesting static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  String s = input ;
  int [ ] [ ] H = new int [ N ] [ 2 ] ;
  int [ ] [ ] G = new int [ 2 * N ] [ 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    a -- ;
    b -- ;
    H [ a ] [ 0 ] = b ;
    H [ b ] [ 1 ] = a ;
    if ( s . charAt ( a ) == 'A' ) {
      if ( s . charAt ( b ) == 'A' ) {
        G [ a ] [ N + b ] = N + b ;
        G [ b ] [ N + a ] = N + a ;
      }
      else {
        G [ a + N ] [ N + b ] = b + N ;
        G [ b ] [ N + a ] = a ;
      }
    }
    else {
      if ( s . charAt ( b ) == 'A' ) {
        G [ a ] [ N + b ] = b ;
        G [ N + b ] [ N + a ] = N + b ;
      }
      else {
        G [ N + a ] [ N + b ] = b ;
        G [ N + b ] [ N + a ] = N + b ;
      }
    }
  }
  int [ ] K = new int [ 2 * N ] ;
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    for ( int p : G [ i ] ) {
      K [ p ] ++ ;
    }
  }
  Queue < Integer > q = new ArrayDeque < Integer > ( ) ;
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    if ( K [ i ] == 0 ) {
      int v1 = q . poll ( ) ;
      res [ i ] = v1 ;
      for ( int v2 : G [ v1 ] ) {
        K [ v2 ] -- ;
        if ( K [ v2 ] == 0 ) {
          q . poll ( ) ;
        }
      }
    }
  }
  if ( res . size ( ) == 2 * N ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
  }
}
