public static boolean deep ( int s , int v ) {
  if ( ( s == n ) && ( v == 0 ) ) return v == 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    if ( ( deep ( s + 1 , v ^ t [ s ] [ i ] ) ) && ( deep ( s , v ^ t [ s ] [ i ] ) ) ) return true ;
  }
  return false ;
}
int n = Integer . parseInt ( input . readLine ( ) ) ;
int k = Integer . parseInt ( input . readLine ( ) ) ;
List < List < Integer >> t = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  t . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
}
if ( deep ( 0 , 0 ) ) System . out . println ( "Found" ) ;
else System . out . println ( "Nothing" ) ;
return true ;
}
