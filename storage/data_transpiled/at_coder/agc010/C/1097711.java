public static String readln ( char ch ) {
  java . util . List < String > res = new LinkedList < String > ( ) ;
  res . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  return res ;
}
int n = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] a = readln ( ' ' ) ;
Set < Integer > [ ] e = new Set [ n + 1 ] ;
for ( int i = 0 ;
i <= n ;
i ++ ) {
  int [ ] s = readln ( ' ' ) ;
  e [ s [ 0 ] ] . add ( s [ 1 ] ) ;
  e [ s [ 1 ] ] . add ( s [ 0 ] ) ;
}
int rt = 1 ;
int now = n ;
int [ ] v = new int [ n + 1 ] ;
for ( int i = 0 ;
i <= n ;
i ++ ) v [ i ] = 0 ;
int [ ] q = v . clone ( ) ;
q [ now ] = rt ;
v [ rt ++ ] = 1 ;
for ( int i = 1 ;
i <= n ;
i ++ ) {
  int s = q [ n - i + 1 ] ;
  for ( int p : e [ s ] ) {
    if ( v [ p ] == 0 ) {
      v [ p ] = 1 ;
      now = now - 1 ;
      q [ now ] = p ;
    }
  }
}
String res = "YES" ;
int [ ] up = new int [ n + 1 ] ;
for ( int i = 0 ;
i <= n ;
i ++ ) {
  int k = q [ i ] ;
  int sum ;
  if ( e [ k ] . size ( ) == 1 ) sum = a [ k - 1 ] ;
  else sum = a [ k - 1 ] * 2 ;
  up [ k ] = sum ;
  for ( int son : e [ k ] ) {
    up [ k ] = up [ k ] - up [ son ] ;
    if ( up [ son ] > a [ k - 1 ] && e [ k ] . size ( ) > 1 ) res = "NO" ;
  }
  if ( up [ k ] < 0 ) res = "NO" ;
  if ( e [ k ] . size ( ) > 1 && up [ k ] > a [ k - 1 ] ) res = "NO" ;
}
if ( up [ rt ] != 0 ) res = "NO" ;
System . out . println ( res ) ;
return