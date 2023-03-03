public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > Ai_to_num = new HashMap < > ( ) ;
  for ( int Ai : Ai_to_num . values ( ) ) {
    if ( Ai % 2 != 0 ) {
      ct ++ ;
    }
  }
  System . out . println ( ct ) ;
}
