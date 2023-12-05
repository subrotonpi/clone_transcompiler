static int recycle ( int N , int A , int B ) {
  String n = Integer . toString ( N ) ;
  int r = 0 ;
  List < Integer > S = new ArrayList < Integer > ( ) ;
  for ( int k = 1 ;
  k < n . length ( ) ;
  k ++ ) {
    if ( n . charAt ( k ) >= n . charAt ( 0 ) ) {
      int p = Integer . parseInt ( n . substring ( k ) + n . substring ( 0 , k ) ) ;
      if ( ( p > N ) && ( p <= B ) && ! S . contains ( p ) ) {
        S . add ( p ) ;
        r ++ ;
      }
    }
  }
  return r ;
}
