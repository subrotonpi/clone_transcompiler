public static void main ( String input ) {
  int N , A , B ;
  if ( N <= 5 ) {
    res = B * N ;
  }
  else {
    res = B * 5 ;
    res += ( N - 5 ) * A ;
  }
  System . out . println ( res ) ;
}
