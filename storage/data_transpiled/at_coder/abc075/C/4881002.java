public static int [ ] [ ] readInput ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = input . readInt ( ) ;
  LinkedList < Integer > brighes = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    brighes . add ( Integer . parseInt ( input . readLine ( ) ) - 1 ) ;
  }
  LinkedList < HashSet < Integer >> neighbor = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    neighbors . add ( new HashSet < > ( ) ) ;
  }
  for ( LinkedList < Integer > brighe : brighes ) {
    int v1 = brighe . getFirst ( ) ;
    int v2 = brighe . getSecond ( ) ;
    neighbor . get ( v1 ) . add ( v2 ) ;
    neighbor . get ( v2 ) . add ( v1 ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] brighe = brighe . getSecond ( ) ;
    int [ ] v = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int a = i ;
      v [ j ] = 0 ;
      for ( int b : neighbor . get ( a ) ) {
        if ( v [ b ] != 1 ) {
          stack [ j ] = b ;
        }
      }
    }
    if ( v [ brighe . getSecond ( ) ] == 0 ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return v ;
}
