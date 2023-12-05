public static int N = Integer . parseInt ( input ) {
  List < Integer > list = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( Integer . parseInt ( list . get ( 0 ) ) % 2 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return list . get ( 0 ) ;
}
