public static int dsum ( int n ) {
  int ret = 0 ;
  while ( n > 0 ) {
    ret += n % 10 ;
    n /= 10 ;
  }
  return ret ;
}
n = Integer . parseInt ( input . nextLine ( ) ) ;
String s = "9" + Integer . toString ( n ) ;
int ans = 0 ;
for ( int i = 0 ;
i < Integer . toString ( n ) . length ( ) ;
i ++ ) {
  for ( int x = 0 ;
  x < 10 ;
  x ++ ) {
    String a = s . substring ( 0 , i ) + Integer . toString ( x ) + s . substring ( i + 1 ) ;
    if ( Integer . parseInt ( a ) <= n ) {
      ans = Math . max ( ans , dsum ( Integer . parseInt ( a ) ) ) ;
    }
  }
}
