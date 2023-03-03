public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int count = ( new HashSet < Integer > ( a ) ) . size ( ) ;
  if ( count % 2 == 0 ) {
    count -- ;
  }
  System . out . println ( count ) ;
}
