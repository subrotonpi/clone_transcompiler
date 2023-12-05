public static int query = 10 * 9 ;
System . out . println ( "? " + query ) ;
char res = input . charAt ( 0 ) ;
if ( res == 'Y' ) {
  query *= 2 ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    query = query / 10 ;
    if ( query == 0 ) break ;
    System . out . println ( "? " + query ) ;
    res = input . charAt ( 1 ) ;
    if ( res == 'N' ) break ;
  }
  if ( query > 0 ) System . out . println ( "! " + query * 5 ) ;
  else System . out . println ( "! 1" ) ;
}
else {
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    query = query / 10 ;
    System . out . println ( "? " + query ) ;
    res = input . charAt ( 1 ) ;
    if ( res == 'Y' ) break ;
  }
  int minN = query ;
  int maxN = query * 10 - 1 ;
  int cnt = 0 ;
  while ( cnt < 100 ) {
    query = ( minN + maxN ) / 2 ;
    if ( minN + 1 >= maxN ) {
      System . out . println ( "! " + maxN ) ;
      break ;
    }
    System . out . println ( "? " + query * 10 ) ;
    res = input . charAt ( 1 ) ;
    cnt ++ ;
    if ( res == 'N' ) minN = query ;
    else maxN = query ;
  }
}
return query ;
}
