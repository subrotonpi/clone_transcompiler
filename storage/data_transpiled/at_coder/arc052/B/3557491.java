@ VisibleForTesting static double [ ] [ ] getStdOut ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> C = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  List < List < Integer >> P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    P . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int A = P . get ( i ) ;
    int B = P . get ( i ) ;
    double ans = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int X = C . get ( j ) ;
      int R = C . get ( j ) ;
      int H = C . get ( j ) ;
      if ( B <= X || X + H <= A ) {
        continue ;
      }
      ans += ( ( R * R ) * H * PI / 3 ) * ( Math . min ( H , ( X + H - A ) ) * Math . pow ( 3 - Math . max ( 0 , ( X + H - B ) ) * Math . pow ( 3 , 2 ) ) / H * H ) ;
    }
    System . out . println ( ans ) ;
  }
  return new double [ ] [ ] {
    {
    }
  }
  ;
}
