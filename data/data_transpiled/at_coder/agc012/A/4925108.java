public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > list = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  Collections . sort ( list ) ;
  int result = 0 ;
  for ( int i = list . size ( ) - 1 ;
  i >= 0 ;
  i -= 2 ) {
    result += list . get ( i ) ;
  }
  System . out . println ( result ) ;
  return result ;
}
