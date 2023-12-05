public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > [ ] tree = new List [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    tree [ i ] = new ArrayList < Integer > ( ) ;
  }
  int [ ] degree = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    degree [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    a -- ;
    b -- ;
    tree [ a ] . add ( b ) ;
    tree [ b ] . add ( a ) ;
    degree [ a ] ++ ;
    degree [ b ] ++ ;
  }
  Queue < Integer > leaf = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( degree [ i ] == 1 ) {
      leaf . add ( i ) ;
    }
  }
  char [ ] color = new char [ n ] ;
  boolean first = false ;
  while ( leaf . size ( ) > 0 ) {
    int v = leaf . remove ( ) ;
    if ( degree [ v ] == 0 ) {
      first = true ;
      continue ;
    }
    degree [ v ] = 0 ;
  }
  System . out . println ( first ? "First" : "Second" ) ;
}
