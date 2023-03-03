public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String a = input . substring ( 0 , n ) ;
  String b = input . substring ( n ) ;
  int c = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a . charAt ( i - 1 * i ) == b . charAt ( i ) ) {
      c = i ;
    }
  }
  if ( a . equals ( b ) ) {
    c = n ;
  }
  System . out . println ( 2 * n - c ) ;
}
