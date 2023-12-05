public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < List < Integer >> line = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    List < Integer > k = new LinkedList < > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      k . add ( input . nextInt ( ) ) ;
    }
    line . add ( k ) ;
  }
  List < List < Integer >> ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    List < Integer > stack = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      stack . add ( line . get ( j ) . get ( i ) ) ;
    }
    Collections . reverse ( stack ) ;
    ans . add ( stack ) ;
  }
  for ( List < Integer > i : ans ) {
    System . out . println ( i . toString ( ) ) ;
  }
}
