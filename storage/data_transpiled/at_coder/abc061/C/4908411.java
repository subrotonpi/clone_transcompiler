public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int count = 0 ;
  List < Integer > ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ab . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  ab = new ArrayList < > ( ab ) ;
  Collections . sort ( ab ) ;
  int i = 0 ;
  while ( count < k ) {
    int a = ab . get ( i ) ;
    int b = ab . get ( i ) ;
    count += b ;
    i ++ ;
    if ( count >= k ) {
      System . out . println ( a ) ;
      break ;
    }
  }
}
