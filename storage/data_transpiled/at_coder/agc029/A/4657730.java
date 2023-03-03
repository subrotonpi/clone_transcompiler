public static void input ( ) {
  int B = 0 ;
  int count = 0 ;
  for ( char s : S ) {
    if ( s == 'B' ) {
      B ++ ;
    }
    else if ( s == 'W' ) {
      count += B ;
    }
  }
  System . out . println ( count ) ;
}
