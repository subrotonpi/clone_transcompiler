public static int r = 0 , b = 0 ;
int n = Integer . parseInt ( input . readLine ( ) ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  String s = input . readLine ( ) ;
  for ( int j = 0 ;
  j < s . length ( ) ;
  j ++ ) {
    switch ( s . charAt ( j ) ) {
      case 'R' : r ++ ;
      break ;
      case 'B' : b ++ ;
      break ;
    }
  }
}
if ( r == b ) {
  System . out . println ( "DRAW" ) ;
}
else if ( r > b ) {
  System . out . println ( "TAKAHASHI" ) ;
}
else {
  System . out . println ( "AOKI" ) ;
}
return r ;
}
