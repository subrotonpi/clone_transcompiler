public static int [ ] ints ( int n , int x ) {
  int cnt = 0 ;
  int short = Math . min ( x , n - x ) ;
  int long = Math . max ( x , n - x ) ;
  cnt += n ;
  while ( true ) {
    int c = long % short ;
    int a = c / short ;
    if ( c == 0 ) {
    }
    else {
      cnt += c ;
    }
  }
}
