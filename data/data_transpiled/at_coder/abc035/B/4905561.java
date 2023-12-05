static void input ( ) {
  int t = Integer . parseInt ( input . readLine ( ) ) ;
  int x = 0 ;
  int y = 0 ;
  int unk = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( s . charAt ( i ) == 'L' ) && ( t == 1 ) ) x -- ;
    else if ( ( s . charAt ( i ) == 'R' ) && ( t == 2 ) ) x ++ ;
    else if ( ( s . charAt ( i ) == 'U' ) && ( t == 3 ) ) y ++ ;
    else if ( ( s . charAt ( i ) == 'D' ) && ( t == 4 ) ) unk ++ ;
  }
  int dist = Math . abs ( x ) + Math . abs ( y ) ;
  if ( ( t == 1 ) && ( s . charAt ( i ) == 'L' ) ) dist += unk ;
  else dist = Math . max ( dist - unk , s . length ( ) % 2 ) ;
  System . out . println ( dist ) ;
}
