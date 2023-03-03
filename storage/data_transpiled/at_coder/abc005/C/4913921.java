static final int getLimit ( ) {
  int limit = Integer . parseInt ( input . nextLine ( ) ) ;
  int max = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > takoyaki = Lists . newArrayList ( ) ;
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  int customer = Lists . newArrayList ( ) ;
  for ( int j : customer ) {
    index = takoyaki . indexOf ( j ) ;
    if ( index . size ( ) == 0 ) {
      System . out . println ( ) ;
    }
    takoyaki . remove ( index . get ( 0 ) ) ;
  }
  System . out . println ( "yes" ) ;
}
