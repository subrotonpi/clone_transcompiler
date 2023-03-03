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
    List < Tuple [ ] > flatten = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int ab = 0 ;
      ab < n ;
      ab ++ ) {
        Tuple [ ] a = aaa . get ( i ) ;
        if ( flag && picked . contains ( a ) ) {
          flag = false ;
        }
        picked . add ( a ) ;
        ans += a . length ;
      }
    }
    Collections . sort ( flatten ) ;
    boolean flag = true ;
    Set < Integer > picked = new HashSet < > ( ) ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      Tuple [ ] a = flatten . get ( i ) ;
      if ( flag && picked . contains ( a ) ) {
        flag = false ;
      }
      picked . add ( a ) ;
      ans += a . length ;
    }
    if ( flag ) {
      Tuple [ ] exclude = flatten . get ( n - 1 ) ;
      ans += exclude . length ;
    }
    return picked . toArray ( ) ;
  }
  