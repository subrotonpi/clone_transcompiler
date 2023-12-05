public static int n = Integer . parseInt ( input ) {
  int ans = 0 ;
  List < Integer > li = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    li . add ( new Integer ( a ) ) ;
  }
  int size = li . size ( ) ;
  Iterator < Integer > iter = li . iterator ( ) ;
  while ( iter . hasNext ( ) ) {
    ans += ( b - ( ( a + ans ) % b ) ) % b ;
  }
  System . out . println ( ans ) ;
  return size ;
}
