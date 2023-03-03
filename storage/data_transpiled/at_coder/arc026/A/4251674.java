public static void main ( String N , String A , String B ) {
  int c = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( c < 5 ) {
      ans += B ;
      c ++ ;
    }
    else {
      ans += A ;
    }
  }
  System . out . println ( ans ) ;
}
