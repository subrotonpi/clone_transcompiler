public static int N = Integer . parseInt ( input ) {
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  @ SuppressWarnings ( "unchecked" ) Counter < Integer > counter = A . stream ( ) . collect ( ) ;
  int odd = 0 ;
  int eve = 0 ;
  int ans = 0 ;
  for ( Integer k : counter . keySet ( ) ) {
    if ( k % 2 == 0 ) {
      eve ++ ;
    }
    else {
      odd ++ ;
    }
  }
  return eve ;
}
