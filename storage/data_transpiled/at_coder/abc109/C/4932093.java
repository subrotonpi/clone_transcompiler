static final void solve ( int N , int X , @ NonNull List < Integer > x ) {
  Collections . sort ( x ) ;
  int gMax = 0 ;
  int last = 0 ;
  int begin = 0 ;
  if ( Math . abs ( X - x . get ( 0 ) ) > 0 ) {
    last = Math . abs ( X - x . get ( 0 ) ) ;
    gMax = last ;
  }
  else {
    begin = 1 ;
    last = x . get ( 1 ) - x . get ( 0 ) ;
    gMax = last ;
  }
  for ( int i = begin ;
  i < N - 1 ;
  i ++ ) {
    int next = x . get ( i + 1 ) - x . get ( i ) ;
    gMax = Math . gcd ( gMax , next ) ;
  }
  System . out . println ( gMax ) ;
  return ;
}
