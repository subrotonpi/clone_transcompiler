public static int [ ] [ ] getIntegerArray ( int a , int b ) {
  int minab , maxab ;
  if ( a < b ) {
    minab = a ;
    maxab = b ;
  }
  else {
    minab = b ;
    maxab = a ;
  }
  int ans = 0 ;
  while ( maxab - minab >= 10 ) {
    ans ++ ;
    maxab -= 10 ;
  }
  int abd = maxab - minab ;
  switch ( abd ) {
    case 0 : System . out . println ( ans ) ;
    break ;
    case 1 : case 2 : case 3 : System . out . println ( ans + abd ) ;
    break ;
    case 4 : case 6 : case 9 : System . out . println ( ans + 2 ) ;
    break ;
    case 5 : System . out . println ( ans + 1 ) ;
    break ;
    case 7 : case 8 : System . out . println ( ans + 3 ) ;
    break ;
  }
  return new int [ ] [ ] {
  }
  ;
}
