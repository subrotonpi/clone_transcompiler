@ WorkerThread public static void paint ( String s , String d , String c ) {
  queue = new ArrayDeque < > ( ) ;
  queue . add ( new Pair < > ( d , s ) ) ;
  while ( queue . size ( ) > 0 ) {
    int remains = queue . peekLast ( ) ;
    int v = 0 ;
    if ( painted [ v ] >= remains ) {
      continue ;
    }
    if ( colors [ v ] == 0 ) {
      colors [ v ] = c ;
    }
    painted [ v ] = remains ;
    if ( remains > 0 ) {
      queue . addAll ( ( remains - 1 , u ) -> {
        for ( String u : links [ v ] ) {
          if ( u . length ( ) > 0 ) {
            colors [ v ] = u . charAt ( 0 ) ;
          }
        }
      }
      ) ;
    }
  }
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  links = new HashSet [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    links [ i ] = null ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    links [ a ] . add ( b ) ;
    links [ b ] . add ( a ) ;
  }
  int q = Integer . parseInt ( input ( ) ) ;
  Queue < Integer > queries = new ArrayDeque < > ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    queries . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  colors = new int [ n + 1 ] ;
  painted = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i < colors . length ;
  i ++ ) {
    colors [ i ] = 0 ;
  }
  for ( int i = 1 ;
  i < painted . length ;
  i ++ ) {
    colors [ i ] = - 1 ;
  }
  while ( queries . size ( ) > 0 ) {
    paint ( ( Integer ) queries . poll ( ) ) ;
  }
  for ( int i = 1 ;
  i < colors . length ;
  i ++ ) {
    System . out . println ( colors [ i ] ) ;
  }
}
