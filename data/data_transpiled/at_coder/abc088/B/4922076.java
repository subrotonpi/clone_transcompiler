public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ) ) ;
  }
  int A = Integer . parseInt ( a . get ( n ) ) ;
  int B = Integer . parseInt ( a . get ( n ) ) ;
  System . out . println ( Math . abs ( A - B ) ) ;
}
