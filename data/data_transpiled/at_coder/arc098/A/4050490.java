public static int n = Integer . parseInt ( input ) {
  String s = input ;
  int ans = s . length ( ) ;
  int wc = 0 ;
  int ec = s . indexOf ( 'E' ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( s . charAt ( i ) == 'E' ) && ( ec > ans + wc ) ) {
      ans = ec + wc ;
    }
    if ( ( s . charAt ( i ) == 'W' ) && ( wc < 0 ) ) {
      wc ++ ;
    }
  }
  return ans ;
}
