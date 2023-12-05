public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  String s = input . substring ( 0 , n ) ;
  boolean flag = true ;
  if ( s . length ( ) > n && s . charAt ( n ) != '-' ) flag = false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == '-' ) flag = false ;
  }
  for ( int i = n + 1 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '-' ) flag = false ;
  }
  if ( flag ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
}
