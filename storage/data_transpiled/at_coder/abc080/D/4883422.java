public static final Scanner stdin = new Scanner ( System . in ) {
  private final Supplier < Integer > ni = ( ) -> Integer . parseInt ( ns . get ( ) ) ;
  private final Supplier < List < Integer >> na = ( ) -> Collections . singletonList ( Integer . parseInt ( ns . get ( ) ) ) ;
  private final Supplier < String > ns = ( ) -> stdin . nextLine ( ) ;
  private int n = na . get ( ) , c = 0 ;
  final List < Integer > [ ] stc = new ArrayList [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    stc [ i ] = na . get ( ) ;
  }
  Arrays . sort ( stc , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return ( o2 > o1 ) ? 2 : o1 ;
    }
  }
  ) ;
  final List < Integer > nstc = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( nstc . size ( ) > 0 ) && ( nstc [ i ] . get ( ) == 2 ) && ( nstc [ i ] . get ( ) == 0 ) ) {
      nstc . add ( stc [ i ] ) ;
    }
  }
  return nstc ;
}
