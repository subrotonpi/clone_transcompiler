public static int input ( ) {
  int t = 0 ;
  int s = 0 ;
  for ( char c : S ) {
    if ( c == 'T' && s == 0 ) {
      t ++ ;
    }
    else if ( c == 'T' ) {
      s -- ;
    }
    else {
      s ++ ;
    }
  }
  return s + t ;
}
