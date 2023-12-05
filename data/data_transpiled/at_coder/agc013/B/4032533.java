private static void print ( int n , int m ) {
  int [ ] a = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  HashMap < Integer , Set < Integer >> map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    map . put ( i , map . get ( i ) . stream ( ) . filter ( j -> j >= 0 ) . collect ( Collectors . toSet ( ) ) ) ;
    map . put ( j , map . get ( j ) . stream ( ) . filter ( i -> i >= 0 ) . collect ( Collectors . toSet ( ) ) ) ;
  }
  List < Integer > path = a [ 0 ] . stream ( ) . collect ( Collectors . toList ( ) ) ;
  Set < Integer > sp = new HashSet < > ( path ) ;
  while ( map . get ( path . size ( ) - 1 ) . stream ( ) . anyMatch ( sp :: contains ) ) {
    Integer t = map . get ( path . size ( ) - 1 ) . stream ( ) . filter ( sp :: contains ) . findFirst ( ) . orElse ( null ) ;
  }
  System . out . println ( path . size ( ) ) ;
  System . out . println ( ( int ) path ) ;
}
