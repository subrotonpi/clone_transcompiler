public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    L . add ( input ) ;
  }
  Set < Integer > A = new HashSet < > ( ) ;
  for ( Integer l : new ArrayList < > ( L ) ) {
    if ( ! A . contains ( l ) ) {
      System . out . println ( l ) ;
      A . add ( l ) ;
    }
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( ! A . contains ( Integer . toString ( i ) ) ) {
      System . out . println ( Integer . toString ( i ) ) ;
    }
  }
}
