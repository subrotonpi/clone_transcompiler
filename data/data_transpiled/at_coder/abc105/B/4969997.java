public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean [ ] dp = new boolean [ 101 ] ;
  dp [ 0 ] = true ;
  dp [ 4 ] = true ;
  dp [ 7 ] = true ;
  for ( int i = 4 ;
  i < 101 ;
  i ++ ) {
    if ( i + 7 <= 100 ) {
      dp [ i + 7 ] = dp [ i + 7 ] || dp [ i ] ;
    }
    if ( i + 4 <= 100 ) {
      dp [ i + 4 ] = dp [ i + 4 ] || dp [ i ] ;
    }
  }
  if ( dp [ N ] ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
