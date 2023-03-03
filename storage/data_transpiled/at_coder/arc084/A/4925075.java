static final int [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  List < Integer > B = Lists . newArrayList ( ) ;
  List < Integer > C = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
    B . add ( i ) ;
    C . add ( i ) ;
  }
  Collections . sort ( A ) ;
  Collections . sort ( B ) ;
  Collections . sort ( C ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int count_a = Arrays . binarySearch ( A , B ) ;
    int count_c = N - Arrays . binarySearch ( C , B ) ;
    ans += count_a * count_c ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
