private static boolean dfs ( int q , int x ) {
  int i ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  t = new ArrayList < > ( ) ;
  for ( i = 0 ;
  i < k ;
  i ++ ) {
    if ( dfs ( q + 1 , x ^ t . get ( q ) [ i ] ) ) {
      return true ;
    }
  }
  return false ;
}
n = Integer . parseInt ( input . nextLine ( ) ) ;
k = Integer . parseInt ( input . nextLine ( ) ) ;
t = new ArrayList < > ( ) ;
for ( i = 0 ;
i < n ;
i ++ ) {
  t . add ( new LinkedList < > ( ) ) ;
}
if ( dfs ( 0 , 0 ) ) {
  System . out . println ( "Found" ) ;
}
else {
  System . out . println ( "Nothing" ) ;
}
return false ;
}
