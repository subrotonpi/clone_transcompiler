static void print ( int N , int M ) {
  int [ ] A = new int [ M ] , B = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = a ;
    B [ i ] = b ;
  }
  HashMap < Integer , HashSet < Integer >> map = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    map . put ( i , new HashSet < > ( ) ) ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int a = A [ i ] ;
    int b = B [ i ] ;
    map . get ( a ) . add ( b ) ;
    map . get ( b ) . add ( a ) ;
  }
  for ( int n = 1 ;
  n <= N ;
  n ++ ) {
    HashSet < Integer > s = new HashSet < > ( ) ;
    for ( Integer f1 : map . get ( n ) ) {
      s = s . stream ( ) . filter ( map . get ( f1 ) :: contains ) . collect ( Collectors . toSet ( ) ) ;
    }
    s = s . removeAll ( map . get ( n ) ) . stream ( ) . collect ( Collectors . toSet ( ) ) ;
    System . out . println ( s . size ( ) ) ;
  }
}
