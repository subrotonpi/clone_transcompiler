public static void main ( String [ ] args ) {
  int na = Integer . parseInt ( input . nextLine ( ) ) ;
  int nb = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = Collections . singletonList ( new Integer ( na ) ) ;
  List < Integer > b = Collections . singletonList ( new Integer ( nb ) ) ;
  System . out . println ( new HashSet < Integer > ( a ) . stream ( ) . filter ( a :: contains ) . count ( ) / new HashSet < Integer > ( a + b ) . stream ( ) . filter ( b :: contains ) . count ( ) ) ;
}
