public static void main ( String input ) {
  int r = Integer . parseInt ( input ) ;
  int s1 = r * r ;
  int s2 = ( r + 1 ) * ( r + 1 ) ;
  int ans = s1 ;
  int p = 100 ;
  while ( p < s2 ) {
    int s = ( ( s1 - 1 ) / p + 1 ) * p ;
    if ( s < s2 ) {
      ans = ( s1 - 1 ) / p + 1 ;
      p = p * 100 ;
    }
    else {
      break ;
    }
  }
  System . out . println ( ans ) ;
}
