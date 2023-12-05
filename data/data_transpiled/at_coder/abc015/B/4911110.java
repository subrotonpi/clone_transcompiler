@ VisibleForTesting static Statistics statistics ( int n , int r ) {
  final int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int num = 0 ;
  int s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] > 0 ) System . out . println ( "Yay!" ) ;
    else System . out . println ( ":(" ) ;
    exit ( 0 ) ;
  }
  return new Statistics ( ) {
    @ Override public void j ( int q ) {
      if ( q == 1 ) System . out . println ( "Yay!" ) ;
      else System . out . println ( ":(" ) ;
    }
  }
  ;
}
