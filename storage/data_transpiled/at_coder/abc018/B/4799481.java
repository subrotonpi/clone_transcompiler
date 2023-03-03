public static String input ( ) {
  String s = input ( ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = Integer . parseInt ( input ( ) ) ;
    int m = Integer . parseInt ( input ( ) ) ;
    StringBuffer r = new StringBuffer ( ) ;
    if ( l > 1 ) r . append ( s . substring ( 0 , l - 1 ) ) ;
    r . append ( s . substring ( l - 1 , m ) ) ;
    if ( m < s . length ( ) ) r . append ( s . substring ( m ) ) ;
    s = r . toString ( ) ;
  }
  System . out . println ( s ) ;
  return s ;
}
