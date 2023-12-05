public static void main ( String [ ] args ) {
  List < Integer > A = new ArrayList < > ( ) ;
  for ( String s : input . split ( " " ) ) {
    A . add ( Integer . parseInt ( s ) ) ;
  }
  System . out . println ( max ( A ) - min ( A ) ) ;
  if ( Class . isAnnotationPresent ( Integer . class ) ) {
    Main . main ( A . toArray ( new Integer [ 0 ] ) ) ;
  }
}
