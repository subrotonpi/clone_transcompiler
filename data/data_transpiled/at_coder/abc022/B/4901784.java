public static void main ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input ( ) ) ;
  System . out . println ( a . length - Integer . numberOfLeadingZeros ( a ) ) ;
}
