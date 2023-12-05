public static int num ( ) {
  int num = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > S = new LinkedList < String > ( ) ;
  for ( String n : S ) {
    if ( n . equals ( "I" ) ) {
      total ++ ;
    }
    else if ( n . equals ( "D" ) ) {
      total -- ;
    }
    if ( total > ans ) {
      ans = total ;
    }
  }
  System . out . println ( ans ) ;
  return num ;
}
