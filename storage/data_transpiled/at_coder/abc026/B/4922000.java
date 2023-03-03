@ VisibleForTesting static Statistics statistics ( int n , int r ) {
  final int n = n ;
  final double [ ] a = new double [ n ] ;
  Arrays . sort ( a , Collections . reverseOrder ( ) ) ;
  double s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) System . out . println ( "Yay!" ) ;
    else System . out . println ( ":(" ) ;
    exit ( 0 ) ;
  }
  return new Statistics ( ) {
    @ Override public void j ( int q ) {
      if ( q == 1 ) System . out . println ( "Yay!" ) ;
      else System . out . println ( ":(" ) ;
      exit ( 0 ) ;
    }
    @ Override public void ct ( int x , int y ) {
      if ( x > y ) System . out . println ( "+" ) ;
      else System . out . println ( "-" ) ;
    }
  }
  ;
}
