@ GwtIncompatible ( "java.util.concurrent.atomic.LinkedList" ) public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  int k = Integer . parseInt ( input ( args [ 1 ] ) ) ;
  LinkedList < Integer > s = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s . add ( i ) ;
  }
  System . out . println ( Arrays . toString ( smallest ( k , s , s ) ) ) ;
}
