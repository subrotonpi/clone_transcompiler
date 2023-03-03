@ VisibleForTesting static Statistics statistics ( int n , int r ) {
  final int n = n ;
  final int a = n ;
  if ( Math . abs ( a - n ) >= 6 ) System . out . println ( "Yay!" ) ;
  else System . out . println ( ":(" ) ;
  exit ( 0 ) ;
  return new Statistics ( ) {
    @ Override public void j ( int q ) {
      if ( q == 1 ) System . out . println ( "Yay!" ) ;
      else System . out . println ( ":(" ) ;
    }
  }
  ;
}
