public static int inf = 9999999999 ;
int N = Integer . parseInt ( input ) , Ma = Integer . parseInt ( input ) , Mb = Integer . parseInt ( input ) ;
HashMap < Integer , Integer > [ ] d = new HashMap [ N + 1 ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  Iterator < Integer > it = d [ i ] . keySet ( ) . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    int j = it . next ( ) ;
    int k = j + a ;
    d [ i ] . put ( j , k ) ;
  }
  d [ i + 1 ] . put ( a , b ) ;
  d [ i ] . put ( b , Math . min ( c , d [ i ] . getOrDefault ( ( a , b ) , inf ) ) ) ;
  it = d [ i ] . keySet ( ) . iterator ( ) ;
}
int ans = inf ;
while ( it . hasNext ( ) ) {
  if ( it . hasNext ( ) ) {
    ans = Math . min ( ans , d [ i ] . get ( j ) ) ;
  }
}
if ( ans == inf ) {
  ans = - 1 ;
}
System . out . println ( ans ) ;
return ans ;
}
