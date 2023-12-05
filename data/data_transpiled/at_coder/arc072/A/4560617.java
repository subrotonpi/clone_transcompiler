public static int N ( ) {
  int [ ] A = Integer . parseInt ( input . nextLine ( ) ) ;
  int now = 0 ;
  int evenCount = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    now += A [ i ] ;
    if ( i % 2 == 0 && now <= 0 ) {
      evenCount += 1 - now ;
      now = 1 ;
    }
    else if ( i % 2 == 1 && now >= 0 ) {
      evenCount += Math . abs ( - 1 - now ) ;
      now = - 1 ;
    }
  }
  now = 0 ;
  int odCount = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    now += A [ i ] ;
    if ( i % 2 == 0 && now >= 0 ) {
      odCount += Math . abs ( - 1 - now ) ;
      now = - 1 ;
    }
    else if ( i % 2 == 1 && now <= 0 ) {
      odCount += 1 - now ;
      now = 1 ;
    }
  }
  System . out . println ( Math . min ( evenCount , odCount ) ) ;
  return 0 ;
}
