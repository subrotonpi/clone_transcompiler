public static void main ( String [ ] args ) {
  int na = Integer . parseInt ( input . nextLine ( ) ) ;
  int nb = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > an = new HashSet < Integer > ( ) ;
  Set < Integer > bn = new HashSet < Integer > ( ) ;
  for ( Integer i : na ) {
  }
  for ( Integer i : bn ) {
  }
  Set < Integer > intersection = an . stream ( ) . filter ( i -> i != i ) . collect ( toSet ( ) ) ;
  Set < Integer > union = an . stream ( ) . filter ( i -> i != i ) . collect ( toSet ( ) ) ;
  System . out . println ( intersection . size ( ) / union . size ( ) ) ;
}
