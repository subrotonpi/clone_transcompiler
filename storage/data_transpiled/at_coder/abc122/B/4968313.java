public static int input ( ) {
  int tmp_l = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case 'A' : case 'C' : case 'G' : case 'T' : tmp_l ++ ;
      if ( tmp_l > ans ) ans = tmp_l ;
      break ;
    }
    else tmp_l = 0 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
