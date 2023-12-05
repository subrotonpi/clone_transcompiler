public static boolean isYes ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt1 = 0 ;
  int cnt2 = 0 ;
  int cnt4 = 0 ;
  for ( int d : map . values ( ) ) {
    if ( d % 4 == 0 ) {
      cnt4 ++ ;
      continue ;
    }
    if ( d % 2 == 0 ) {
      cnt2 ++ ;
      continue ;
    }
    cnt1 ++ ;
  }
  boolean res = true ;
  if ( cnt2 > 0 ) {
    res = ( cnt1 <= cnt4 ) ;
  }
  else {
    res = ( cnt1 <= ( cnt4 + 1 ) ) ;
  }
  if ( res ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return res ;
}
