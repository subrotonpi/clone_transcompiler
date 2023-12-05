static final int [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > B = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  List < Integer > B_index = new ArrayList < > ( ) ;
  for ( int _index : B ) {
    B_index . add ( ( _index ) ) ;
  }
  complete . sort ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int val = B_index . get ( i ) ;
    final int left = val - bisect . binarySearch ( complete , _index ) ;
    final int right = N - left - i - 1 ;
    ans += Math . min ( left , right ) ;
    bisect . insort ( complete , _index ) ;
  }
  System . out . println ( ans ) ;
}
