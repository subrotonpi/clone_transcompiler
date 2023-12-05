@ OperatorOperator ( OperatorType . EQUAL ) @ SchedulerSupport ( SchedulerType . NONE ) public static int [ ] [ ] input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Tuple [ ] > aaa = new ArrayList < > ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    aaa . add ( new Tuple [ ] {
      Integer . parseInt ( input ( ) ) }
      ) ;
    }
    List < Tuple [ ] > flatten = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      List < Tuple [ ] > list = new ArrayList < > ( ) ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        Tuple [ ] ab = list . get ( j ) ;
        int i = ab . length ;
        picked . add ( i ) ;
        ans += ab ;
      }
    }
    if ( picked . size ( ) == n ) {
      Tuple [ ] exclude = flatten . get ( n - 1 ) ;
      Tuple [ ] include = flatten . get ( n ) ;
      if ( exclude [ 1 ] . equals ( include [ 1 ] ) ) {
        int tmp1 = include [ 0 ] . compareTo ( exclude [ 0 ] ) ;
        int tmp2 = flatten . get ( n + 1 ) . compareTo ( exclude [ 0 ] ) ;
        ans += Math . min ( tmp1 , tmp2 ) ;
      }
      else {
        ans -= exclude [ 0 ] . compareTo ( include [ 0 ] ) ;
      }
    }
    ans = Math . min ( ans , Ints . checkedCast ( aaa . size ( ) ) ) ;
    System . out . println ( ans ) ;
    return aaa . toArray ( ) ;
  }
  