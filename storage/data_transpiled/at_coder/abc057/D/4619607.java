public static int conb ( int a , int b ) {
  int now = 1 ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    now = ( int ) ( now * ( a - i ) / ( i + 1 ) ) ;
  }
  return now ;
}
N = Integer . parseInt ( input . nextLine ( ) ) ;
A = Integer . parseInt ( input . nextLine ( ) ) ;
B = Integer . parseInt ( input . nextLine ( ) ) ;
List < Integer > V = new LinkedList < Integer > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) V . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
Collections . sort ( V , Collections . reverseOrder ( ) ) ;
int line = V . get ( A - 1 ) ;
if ( V . get ( 0 ) == line ) {
  int ans = 0 ;
  for ( int i = A ;
  i <= Math . min ( V . count ( V . get ( 0 ) ) , B ) ;
  i ++ ) ans += conb ( V . count ( V . get ( 0 ) ) , i ) ;
  System . out . println ( V . get ( 0 ) ) ;
  System . out . println ( ans ) ;
}
else if ( line > V . get ( A ) ) {
  System . out . println ( Arrays . toString ( V . subList ( 0 , A ) ) / A ) ;
  System . out . println ( 1 ) ;
}
else {
  int idx = V . indexOf ( line ) ;
  int cnt = V . count ( line ) ;
  System . out . println ( ( Arrays . toString ( V . subList ( 0 , idx ) ) + line * ( A - idx ) ) / A ) ;
  System . out . println ( conb ( cnt , A - idx ) ) ;
}
