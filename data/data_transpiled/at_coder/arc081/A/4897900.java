static final int [ ] getCounts ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Counter < Integer > counter = new ClassicCounter < > ( A ) ;
  int ans = 0 ;
  int ans_part = - 1 ;
  for ( int x = new ArrayList < > ( Collections . frequency ( counter . keySet ( ) , Integer . MAX_VALUE ) ) ;
  x -- ) {
    if ( ans_part == - 1 ) {
      if ( counter . getCount ( x ) >= 4 ) {
        ans = x * x ;
        break ;
      }
      else if ( 2 <= counter . getCount ( x ) <= 3 ) {
        ans_part = x ;
      }
    }
    else {
      if ( counter . getCount ( x ) >= 2 ) {
        ans = ans_part * x ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  return A . toArray ( ) ;
}
