public static void input ( ) {
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int ct = N ;
  int rem = 0 ;
  while ( N >= m ) {
    ct += ( N / m ) * n ;
    rem = N % m ;
    N = ( N / m ) * n + rem ;
  }
  System . out . println ( ct ) ;
}
