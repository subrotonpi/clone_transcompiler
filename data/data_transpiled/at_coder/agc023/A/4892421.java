public static int getNum ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = new ArrayList < > ( ) ;
  l . add ( 0 ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    l . add ( l . get ( i ) + 1 ) ;
  }
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i : l ) {
    if ( ! map . containsKey ( i ) ) {
      map . put ( i , 1 ) ;
    }
  }
  int ans = 0 ;
  for ( int a : map . values ( ) ) {
    ans += a * ( a - 1 ) / 2 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
