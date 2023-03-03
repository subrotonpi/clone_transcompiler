public static int N = Integer . parseInt ( input ) {
  HashMap < Integer , Integer > dic = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    if ( ( a > 0 ) && ( dic . containsKey ( a ) ) ) {
      dic . put ( a , 1 ) ;
    }
  }
  int ans = 0 ;
  return ans ;
}
