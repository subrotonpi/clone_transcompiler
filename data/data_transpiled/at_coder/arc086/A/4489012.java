@ VisibleForTesting static void main ( String [ ] args ) {
  if ( args . length == 0 ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int k = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > a = new ArrayList < > ( ) ;
    for ( String s : input . nextLine ( ) . split ( " " ) ) {
      a . add ( Integer . parseInt ( s ) ) ;
    }
    System . out . println ( Arrays . toString ( a . toArray ( ) ) ) ;
  }
}
