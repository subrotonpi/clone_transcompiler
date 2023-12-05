static private final double mod = 1000000007 ;
String S = input ( ) ;
long n = 1 ;
long a = 0 ;
long ab = 0 ;
long abc = 0 ;
for ( int i = 0 ;
i < S . length ( ) ;
i ++ ) {
  String s = S . substring ( i , i + 1 ) ;
  if ( s . contains ( "A" ) ) {
    a += n ;
  }
  if ( s . contains ( "B" ) ) {
    ab += a ;
  }
  if ( s . equals ( "C" ) ) {
    abc += ab ;
  }
  if ( s . contains ( "?" ) ) {
    n = 3 * n ;
    a = 3 * a + n ;
    ab = 3 * ab + a ;
    abc = 3 * abc + ab ;
  }
  n %= mod ;
  a %= mod ;
  ab %= mod ;
  abc %= mod ;
}
System . out . println ( abc % mod ) ;
return 1 ;
}
