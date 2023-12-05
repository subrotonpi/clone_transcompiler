public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l . add ( i ) ;
  }
  System . out . println ( min ( l ) ) ;
}
