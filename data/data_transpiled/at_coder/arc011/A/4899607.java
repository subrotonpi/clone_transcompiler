public static int m ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int result = N ;
  int s = N ;
  while ( s >= m ) {
    int x = s / m ;
    s += x * n ;
    result += x * n ;
  }
  System . out . println ( result ) ;
  return result ;
}
