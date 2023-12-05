public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > as_ = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    as_ . add ( Integer . parseInt ( input ) ) ;
  }
  if ( Math . pow ( as_ . size ( ) , n ) % n != 0 ) {
    System . out . println ( "-1" ) ;
  }
  else {
    int m = ( int ) ( Math . pow ( as_ . size ( ) , n ) / n ) ;
    int sum_ = 0 ;
    int count_ = 0 ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      sum_ += as_ . get ( i ) ;
      count_ ++ ;
      if ( sum_ == count_ * m ) {
        ans += count_ - 1 ;
        sum_ = 0 ;
        count_ = 0 ;
      }
    }
    System . out . println ( ans ) ;
  }
}
