public static int N = Integer . parseInt ( input ) {
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int res = - 1 ;
  for ( List < Integer > l : L ) {
    int tmp = 0 ;
    for ( int i = 0 ;
    i < 5 ;
    i ++ ) {
      if ( i == 4 ) {
        tmp += l . get ( i ) * 110 / 900 ;
      }
      else {
        tmp += l . get ( i ) ;
      }
    }
    res = Math . max ( res , tmp ) ;
  }
  System . out . println ( res ) ;
  return res ;
}
