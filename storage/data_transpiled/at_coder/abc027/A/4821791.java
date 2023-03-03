@ Parameters public static List < Integer > parameters ( ) {
  List < Integer > a = newArrayList ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    a . add ( Integer . parseInt ( s ) ) ;
  }
  Collections . sort ( a ) ;
  if ( a . get ( 0 ) == a . get ( 1 ) ) {
    System . out . println ( a . get ( 2 ) ) ;
  }
  else {
    System . out . println ( a . get ( 0 ) ) ;
  }
  return a ;
}
