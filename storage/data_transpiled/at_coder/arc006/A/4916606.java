public static void main ( String [ ] args ) {
  int [ ] ee = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ll = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] eCounts = new int [ 10 ] ;
  int [ ] lCounts = new int [ 10 ] ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    eCounts [ ee [ i ] ] ++ ;
    lCounts [ ll [ i ] ] ++ ;
  }
  int matches = 0 ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    int k = Math . min ( eCounts [ i ] , lCounts [ i ] ) ;
    eCounts [ i ] -= k ;
    lCounts [ i ] -= k ;
    matches += k ;
  }
  switch ( matches ) {
    case 6 : System . out . println ( 1 ) ;
    break ;
    case 5 : if ( lCounts [ b ] > 0 ) System . out . println ( 2 ) ;
    else System . out . println ( 3 ) ;
    break ;
    case 4 : System . out . println ( 4 ) ;
    break ;
    case 3 : System . out . println ( 5 ) ;
    break ;
    default : System . out . println ( 0 ) ;
    break ;
  }
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( args ) ;
  }
}
