public static int f ( int x ) {
  int res = 0 ;
  while ( x > 0 ) {
    res += x % 10 ;
    x /= 10 ;
  }
  return res ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
List < Integer > ans = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < N ;
i = i - 154 ) {
  int j = i + 1 ;
  if ( j + f ( j ) == N ) {
    ans . add ( j ) ;
  }
}
System . out . println ( ans . size ( ) ) ;
for ( Integer x : ans ) {
  System . out . println ( x ) ;
}
