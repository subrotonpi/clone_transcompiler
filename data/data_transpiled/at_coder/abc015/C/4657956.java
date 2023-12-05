public static boolean deep ( int s , int v ) {
  if ( ( s == n ) && ( v == 0 ) ) return v == 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    if ( deep ( s + 1 , v ^ t [ s ] [ i ] ) ) return true ;
  }
  return false ;
}
n = Integer . parseInt ( input . nextLine ( ) ) ;
k = Integer . parseInt ( input . nextLine ( ) ) ;
t = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  t . add ( new LinkedList < > ( ) ) ;
}
for ( int i = 0 ;
i < k ;
i ++ ) {
  t . add ( new LinkedList < > ( ) ) ;
}
if ( ( deep ( 0 , 0 ) ) && ( deep ( 1 , 0 ) ) ) System . out . println ( "Found" ) ;
else System . out . println ( "Nothing" ) ;
return true ;
}
