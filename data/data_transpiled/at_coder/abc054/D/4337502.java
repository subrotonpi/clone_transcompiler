public static int M_ab = 400 ;
int M_n = 40 ;
float inf = Float . MAX_VALUE ;
int n = Integer . parseInt ( input . readLine ( ) ) ;
int Ma = Integer . parseInt ( input . readLine ( ) ) ;
int Mb = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] A = new int [ n ] , B = new int [ n ] , C = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  A [ i ] = a ;
  B [ i ] = b ;
  C [ i ] = c ;
}
int [ ] [ ] [ ] DP = new int [ M_ab + 1 ] [ M_n + 1 ] [ M_n + 1 ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  DP [ i ] [ 0 ] [ 0 ] = inf ;
  for ( int ca = 0 ;
  ca < M_ab + 1 ;
  ca ++ ) {
    DP [ i ] [ 0 ] [ cb ] = Math . min ( DP [ i + 1 ] [ ca ] [ cb ] , DP [ i ] [ ca ] [ cb ] ) ;
    DP [ i + 1 ] [ ca + A [ i ] ] [ cb + B [ i ] ] = Math . min ( DP [ i + 1 ] [ ca + A [ i ] ] [ cb + B [ i ] ] , DP [ i ] [ ca ] [ cb ] + C [ i ] ) ;
  }
}
int ans = inf ;
for ( int ca = 1 ;
ca <= M_ab ;
ca ++ ) {
  for ( int cb = 1 ;
  cb <= M_ab ;
  cb ++ ) {
    if ( ca * Mb == cb * Ma ) ans = Math . min ( ans , DP [ n ] [ ca ] [ cb ] ) ;
  }
}
if ( ans == inf ) ans = - 1 ;
System . out . println ( ans ) ;
return ans ;
}
