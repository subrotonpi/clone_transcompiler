public static int N = Integer . parseInt ( input ) {
  int [ ] A = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] counter = new int [ 100001 ] ;
  for ( int a : A ) {
    if ( a > 0 ) {
      counter [ a - 1 ] ++ ;
      counter [ a ] ++ ;
      counter [ a + 1 ] ++ ;
    }
    else {
      counter [ a ] ++ ;
      counter [ a + 1 ] ++ ;
    }
  }
  System . out . println ( max ( counter ) ) ;
  return 0 ;
}
