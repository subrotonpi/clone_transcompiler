static final int [ ] getMatchingValues ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] s = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = input . nextLine ( ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] t = new String [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) t [ i ] = input . nextLine ( ) ;
  Counter < String > c = new Counters ( s ) . minus ( t ) ;
  if ( c . isEmpty ( ) ) System . out . println ( 0 ) ;
  else System . out . println ( c . getMostSignificantBits ( ) [ 0 ] . getValue ( ) ) ;
  return s ;
}
