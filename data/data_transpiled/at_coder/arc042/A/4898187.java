public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] aa = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    aa [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  boolean [ ] printeds = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    printeds [ i ] = false ;
  }
  for ( int a = 0 ;
  a < aa . length ;
  a ++ ) {
    if ( printeds [ a - 1 ] ) {
      continue ;
    }
    System . out . println ( aa [ a ] ) ;
    printeds [ a - 1 ] = true ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! printeds [ i ] ) {
      System . out . println ( i + 1 ) ;
    }
  }
  if ( getClass ( ) . isClassPresent ) {
    Class . forName ( "org.apache.commons.codec.binary.BinaryEncoder" ) ;
  }
}
