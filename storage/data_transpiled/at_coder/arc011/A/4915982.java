public static void main ( String [ ] args ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = 0 ;
  while ( N >= m ) {
    int a = N / m ;
    int b = N / m ;
    N = a * n + b ;
    res += a * m ;
  }
  res += N ;
  System . out . println ( res ) ;
}
