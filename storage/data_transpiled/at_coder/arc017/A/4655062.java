public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  ArrayList < Integer > prime = new ArrayList < > ( 2 ) ;
  boolean pFlag = true ;
  for ( int i = 3 ;
  i <= ( int ) ( N * 0.5 ) ;
  i += 2 ) {
    boolean flag = true ;
    for ( int j = 0 ;
    j < prime . size ( ) ;
    j ++ ) {
      if ( prime . get ( j ) % j == 0 ) {
        flag = false ;
        break ;
      }
    }
  }
  System . out . println ( pFlag ? "YES" : "NO" ) ;
}
