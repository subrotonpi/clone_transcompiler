public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( String a : input . split ( " " ) ) {
    A . add ( Integer . parseInt ( a ) ) ;
  }
  Collections . sort ( A ) ;
  List < Integer > B = new ArrayList < > ( ) ;
  for ( int a = N - 1 ;
  a >= 0 ;
  a -- ) {
    B . add ( Math . abs ( a - b ) ) ;
  }
  Collections . sort ( B ) ;
  if ( A . equals ( B ) ) {
    System . out . println ( Math . pow ( 2 , N / 2 , 10 * 9 + 7 ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
}
