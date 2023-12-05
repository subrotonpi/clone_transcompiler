public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > b = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > ans = new ArrayList < > ( ) ;
  while ( b . size ( ) > 0 ) {
    int check = - 1 ;
    for ( int i = 0 ;
    i < b . size ( ) ;
    i ++ ) {
      if ( b . get ( i ) == i + 1 ) {
        check = i ;
      }
    }
    if ( check == - 1 ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
    ans . add ( check + 1 ) ;
    b . clear ( ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( ans . get ( n - i - 1 ) ) ;
  }
  return ans . toArray ( new Integer [ n ] ) ;
}
