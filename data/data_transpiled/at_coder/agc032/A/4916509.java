public static int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = 0 ;
  Stack < Integer > number = new Stack < Integer > ( ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    for ( int i = b . length - 1 ;
    i >= 0 ;
    i -- ) {
      if ( ( i + 1 ) == b [ i ] && a [ i ] == 0 ) {
        -- i ;
        a [ i ] = b [ i ] ;
        number . push ( b [ i ] ) ;
        -- i ;
        break ;
      }
    }
  }
  if ( ( ! a . isEmpty ( ) ) && ( ! number . isEmpty ( ) ) ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) System . out . println ( number . pop ( ) ) ;
  }
  if ( ( a . isEmpty ( ) ) && ( ! number . isEmpty ( ) ) ) System . out . println ( - 1 ) ;
  return a ;
}
