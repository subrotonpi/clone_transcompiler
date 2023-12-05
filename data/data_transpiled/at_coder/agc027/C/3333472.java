@ VisibleForTesting static String readString ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int [ ] [ ] connectLabel = new int [ N ] [ ] ;
  Queue < Integer > queue = new LinkedList < > ( ) ;
  Set < Integer > deletedSet = new HashSet < > ( ) ;
  int [ ] [ ] G = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    G [ a ] [ b ] = b ;
    G [ b ] [ a ] = a ;
    connectLabel [ a ] [ 1 - ( S . charAt ( b ) == 'A' ? 1 : 0 ) ] ++ ;
    connectLabel [ b ] [ 1 - ( S . charAt ( a ) == 'A' ? 1 : 0 ) ] ++ ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( 0 == connectLabel [ i ] [ i ] ) {
      queue . add ( i ) ;
    }
  }
  while ( queue . size ( ) > 0 ) {
    int n = queue . poll ( ) ;
    if ( deletedSet . contains ( n ) ) {
      continue ;
    }
    for ( int v : G [ n ] ) {
      connectLabel [ v ] [ 1 - ( S . charAt ( n ) == 'A' ? 1 : 0 ) ] -- ;
      if ( ( v != 'A' ) && ( v != 'A' ) && ( v != 'A' ) ) {
        queue . add ( v ) ;
      }
    }
    deletedSet . add ( n ) ;
  }
  System . out . println ( deletedSet . size ( ) != N ? "Yes" : "No" ) ;
  return "" ;
}
