static final int [ ] getUpperCaseValues ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  Counter < Integer > counter = new ClassicCounter < Integer > ( A ) ;
  List < Integer > Y = new ArrayList < Integer > ( Collections . list ( counter . keySet ( ) ) ) ;
  int ans = - 1 ;
  if ( max ( Y ) - min ( Y ) <= 2 ) {
    ans = N ;
  }
  else {
    List < Integer > Y_all = Arrays . asList ( Y ) ;
    for ( int i = min ( Y ) ;
    i <= max ( Y ) ;
    i ++ ) {
      Y_all . add ( counter . get ( i ) ) ;
    }
    for ( int i = 0 ;
    i < Y_all . size ( ) - 2 ;
    i ++ ) {
      ans = Math . max ( sum ( Y_all , i , i + 3 ) , ans ) ;
    }
  }
  System . out . println ( ans ) ;
  return Y_all ;
}
