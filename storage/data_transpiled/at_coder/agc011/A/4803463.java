public static void main ( String input , int n , int c , int k ) {
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
  }
  List < Integer > people = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    people . add ( Integer . parseInt ( input . substring ( i , i + 1 ) ) ) ;
  }
  int start = people . get ( 0 ) ;
  int cnt = 1 ;
  int ans = 1 ;
  for ( int i = 1 ;
  i < people . size ( ) ;
  i ++ ) {
    if ( start - people . get ( i ) <= k && people . get ( i ) >= start - k && cnt < c ) {
      cnt ++ ;
    }
    else {
      cnt = 1 ;
      ans ++ ;
      start = people . get ( i ) ;
    }
  }
  System . out . println ( ans ) ;
}
