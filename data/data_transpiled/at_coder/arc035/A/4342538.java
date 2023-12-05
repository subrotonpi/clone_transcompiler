static final String input ( ) {
  String s = input ( ) ;
  String rs = s . substring ( 0 , s . length ( ) - 1 ) ;
  boolean flag = false ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != rs . charAt ( i ) && s . charAt ( i ) != '*' && rs . charAt ( i ) != '*' ) flag = true ;
  }
  return ( flag == false ? "YES" : "NO" ) ;
}
