@ GwtIncompatible ( "java.util.Scanner" ) public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean [ ] [ ] table = new boolean [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    table [ x - 1 ] [ y - 1 ] = true ;
    table [ y - 1 ] [ x - 1 ] = true ;
  }
  int res = 1 ;
  for ( int i = 1 ;
  i < 1 << n ;
  i ++ ) {
    int [ ] ps = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      ps [ j ] = ( i >> j ) & 1 ;
    }
    if ( ps . length <= 1 ) continue ;
    boolean complete = true ;
    Iterator < Integer > it = ps . iterator ( ) ;
    while ( it . hasNext ( ) ) {
      if ( ! table [ it . next ( ) ] ) {
        complete = false ;
        break ;
      }
    }
    if ( complete ) {
      res = Math . max ( res , ps . length ) ;
    }
  }
  System . out . println ( res ) ;
}
