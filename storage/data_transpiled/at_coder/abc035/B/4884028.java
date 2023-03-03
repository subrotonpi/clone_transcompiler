public static void input ( ) {
  S = input . nextLine ( ) ;
  T = Integer . parseInt ( input . nextLine ( ) ) ;
  String S1 = S . replace ( "?" , "" ) ;
  int ds = S . length ( ) - S1 . length ( ) ;
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < S1 . length ( ) ;
  i ++ ) {
    switch ( S1 . charAt ( i ) ) {
      case 'U' : y ++ ;
      break ;
      case 'D' : y -- ;
      break ;
      case 'R' : x ++ ;
      break ;
      case 'L' : x -- ;
      break ;
    }
  }
  if ( T == 1 ) {
    System . out . println ( Math . abs ( x ) + Math . abs ( y ) + ds ) ;
  }
  else {
    System . out . println ( Math . max ( S . length ( ) % 2 , Math . abs ( x ) + Math . abs ( y ) - ds ) ) ;
  }
}
