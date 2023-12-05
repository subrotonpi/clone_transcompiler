public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int ans = 0 ;
  List < Integer > li = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    li . add ( new Integer ( a ) ) ;
  }
  Iterator it = li . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    ans += ( b - ( ( a + ans ) % b ) ) % b ;
  }
  System . out . println ( ans ) ;
}
