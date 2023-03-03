static final void main ( String [ ] args ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final Counter < Integer > c = new ClassicCounter < Integer > ( A ) ;
  int ans = 0 ;
  for ( final Map . Entry < Integer , Integer > pair : c . entrySet ( ) ) {
    if ( pair . getValue ( ) % 2 == 1 ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
