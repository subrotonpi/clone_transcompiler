private static double cover ( double [ ] [ ] C ) {
  if ( C . length == 0 ) {
    return 0.0 ;
  }
  if ( C . length == 1 ) {
    return C [ 0 ] [ 2 ] ;
  }
  return ( C [ 0 ] [ 2 ] + C [ 1 ] [ 2 ] + Math . sqrt ( ( C [ 0 ] [ 0 ] - C [ 1 ] [ 0 ] ) * ( C [ 0 ] [ 1 ] - C [ 1 ] [ 1 ] ) * ( C [ 0 ] [ 1 ] - C [ 1 ] [ 1 ] ) * ( C [ 0 ] [ 1 ] - C [ 1 ] [ 1 ] ) ) ) / 2.0 ;
}
for ( int tc = 1 ;
tc <= Integer . parseInt ( input ( ) ) ;
int n = Integer . parseInt ( input ( ) ) ;
double [ ] circles = new double [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int x = Integer . parseInt ( input ( ) ) ;
  int y = Integer . parseInt ( input ( ) ) ;
  int r = Integer . parseInt ( input ( ) ) ;
  circles [ i ] = new double [ r ] ;
}
double ans = 0 ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  double nans = Math . max ( cover ( circles , i , i + 1 ) , cover ( circles , 0 , i + 1 , n ) ) ;
  if ( ans == 0 || nans < ans ) {
    ans = nans ;
  }
}
System . out . println ( "Case #" + tc + ": " + ans + " " + ( ans == 0 ? "" : "" ) ) ;
return ans ;
}
