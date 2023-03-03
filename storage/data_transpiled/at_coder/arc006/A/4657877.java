public static List < Integer > input ( ) {
  List < Integer > E = new ArrayList < > ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    E . add ( Integer . parseInt ( s ) ) ;
  }
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    L . add ( Integer . parseInt ( s ) ) ;
  }
  int cnt = 0 ;
  for ( int i : L ) {
    if ( E . contains ( i ) ) {
      cnt ++ ;
    }
  }
  if ( cnt == 6 ) {
    System . out . println ( 1 ) ;
  }
  else if ( cnt < 3 ) {
    System . out . println ( 0 ) ;
  }
  else {
    if ( L . contains ( B ) && cnt == 5 ) {
      cnt ++ ;
    }
    System . out . println ( 8 - cnt ) ;
  }
  return L ;
}
