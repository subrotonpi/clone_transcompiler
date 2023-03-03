public static int N = Integer . parseInt ( input ) {
  List < Integer > a_ = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a_ . add ( i ) ;
  }
  List < Integer > aG = new ArrayList < > ( ) ;
  for ( int i : a_ ) {
    if ( i % 2 == 0 ) {
      count ++ ;
      i = i / 2 ;
    }
  }
  return count ;
}
