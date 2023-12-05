public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  List < List < Integer >> B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A . add ( Collections . singletonList ( input . split ( " " ) [ 0 ] ) ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    B . add ( Collections . singletonList ( input . split ( " " ) [ 1 ] ) ) ;
  }
  for ( List < Integer > a : A ) {
    List < Integer > D = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      D . add ( new Integer ( Math . abs ( a . get ( 0 ) - B . get ( i ) . get ( 0 ) ) + Math . abs ( a . get ( 1 ) - B . get ( i ) . get ( 1 ) ) ) , i + 1 ) ;
    }
    D = new ArrayList < > ( D ) ;
    Collections . sort ( D ) ;
    System . out . println ( D . get ( 0 ) . intValue ( ) ) ;
  }
}
