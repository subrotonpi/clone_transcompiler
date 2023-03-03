public static String gcd ( String a , String b ) {
  if ( b . equals ( 0 ) ) return a ;
  return gcd ( b , a % b ) ;
}
int n = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  String ans = "Yes" ;
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = Integer . parseInt ( input . nextLine ( ) ) ;
  c = Integer . parseInt ( input . nextLine ( ) ) ;
  d = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a . compareTo ( b ) < 0 || d . compareTo ( b ) < 0 ) ans = "No" ;
  else if ( b . compareTo ( c ) <= 0 ) ans = "Yes" ;
  else {
    if ( c . compareTo ( b - gcd ( b , d ) + a . mod ( b , d ) ) < 0 ) ans = "No" ;
  }
  System . out . println ( ans ) ;
}
