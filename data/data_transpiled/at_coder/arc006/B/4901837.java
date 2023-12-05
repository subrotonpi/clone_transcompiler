public static int N = Integer . parseInt ( input ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > A = new ArrayList < > ( L ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    A . add ( Collections . singletonList ( input ) ) ;
  }
  String B = Collections . singletonList ( input ) ;
  int ans = B . indexOf ( 'o' ) ;
  for ( int i = A . size ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    if ( ans != 0 && a . charAt ( ans - 1 ) == '-' ) {
      ans -= 2 ;
    }
    else {
    }
  }
  return ans ;
}
