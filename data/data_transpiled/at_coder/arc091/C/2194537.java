public static int [ ] [ ] solve ( int N , int A , int B ) {
  if ( ! ( A + B - 1 <= N && N <= A * B ) ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  if ( B == 1 ) {
    System . out . println ( ( int [ ] ) ( 1 + A ) ) ;
    exit ( ) ;
  }
  int n = ( N - A ) / ( B - 1 ) ;
  int m = ( N - A ) % ( B - 1 ) ;
  Stack < Integer > stack = new Stack < > ( ) ;
  stack . push ( 1 ) ;
  stack . push ( A + 1 ) ;
  int ldsCnt = 1 ;
  while ( stack . peek ( ) <= N ) {
    int l = ldsCnt > m ? n : n + 1 ;
    stack . push ( stack . peek ( ) + l ) ;
    ldsCnt ++ ;
  }
  List < Integer > ans = new ArrayList < > ( ) ;
  while ( stack . size ( ) > 1 ) {
    ans . addAll ( Arrays . asList ( stack . peek ( ) ) ) ;
    stack . pop ( ) ;
  }
  return ans . toArray ( ) ;
}
