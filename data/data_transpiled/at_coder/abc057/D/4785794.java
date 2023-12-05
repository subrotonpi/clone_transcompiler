public static int comb ( int n , int r ) {
  r = Math . min ( r , n - r ) ;
  int result = 1 ;
  for ( int i = n - r + 1 ;
  i <= n ;
  i ++ ) {
    result *= i ;
  }
  for ( int i = 1 ;
  i <= r ;
  i ++ ) {
    result /= i ;
  }
  return result ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int A = Integer . parseInt ( input . nextLine ( ) ) ;
int B = Integer . parseInt ( input . nextLine ( ) ) ;
List < Integer > V = new LinkedList < Integer > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) V . add ( i ) ;
Collections . sort ( V , Collections . reverseOrder ( V ) ) ;
int ave = Integer . parseInt ( V . get ( 0 ) ) / A ;
int pat = 0 ;
int note = 0 ;
int cnt = 0 ;
for ( int i = A - note ;
i <= B ;
i ++ ) {
  if ( i > cnt ) break ;
  pat += comb ( cnt , i ) ;
}
return ave ;
}
