public static int [ ] getHighHigh ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , k = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < Integer > h = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    h . add ( a ) ;
  }
  ArrayList < Integer > high = h ;
  return high . toArray ( ) ;
}
