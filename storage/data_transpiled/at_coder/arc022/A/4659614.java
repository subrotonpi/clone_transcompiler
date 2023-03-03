private static String [ ] S ( ) {
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( input . charAt ( i ) == 'I' ) {
      flag = true ;
      break ;
    }
  }
  if ( flag ) {
    flag = false ;
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      if ( input . charAt ( j ) == 'C' ) {
        flag = true ;
        break ;
      }
    }
  }
  return null ;
}
