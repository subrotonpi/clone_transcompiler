static final int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] b = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int check = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( b [ i ] > i + 1 ) {
      check = 1 ;
    }
  }
  if ( check == 1 ) {
    System . out . println ( - 1 ) ;
    System . exit ( 0 ) ;
  }
  List < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans . add ( i + 1 - b [ i ] , b [ i ] ) ;
  }
  Collections . reverse ( ans ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( ans . get ( i ) ) ;
  }
  return ans . toArray ( new Integer [ 0 ] ) ;
}
