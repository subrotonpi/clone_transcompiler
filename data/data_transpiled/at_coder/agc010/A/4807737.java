public static int N = Integer . parseInt ( input ) {
  List < Integer > list = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list . add ( i ) ;
  }
  int count = 0 ;
  for ( int a : list ) {
    if ( a % 2 != 0 ) {
      count ++ ;
    }
  }
  if ( count % 2 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return count ;
}
