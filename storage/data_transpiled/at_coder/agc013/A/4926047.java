public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > As = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ct = 1 ;
  boolean inc = false ;
  boolean dec = false ;
  int bef = As . removeFirst ( ) ;
  for ( int Ai = 0 ;
  Ai < As . size ( ) ;
  Ai ++ ) {
    if ( ( ! inc ) && ( ! dec ) ) {
      if ( Ai < bef ) dec = true ;
      else if ( Ai > bef ) inc = true ;
    }
    else if ( inc ) {
      if ( Ai < bef ) {
        ct ++ ;
        inc = false ;
      }
    }
    else if ( dec ) {
      if ( Ai > bef ) {
        ct ++ ;
        dec = false ;
      }
    }
    bef = Ai ;
  }
  System . out . println ( ct ) ;
}
