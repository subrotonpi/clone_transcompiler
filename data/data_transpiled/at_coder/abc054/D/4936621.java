public static int NM = 40 ;
int ABM = 10 ;
int MM = 400 ;
int N = Integer . parseInt ( input . readLine ( ) ) ;
int M1 = Integer . parseInt ( input . readLine ( ) ) ;
int M2 = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] A = new int [ N ] ;
int [ ] B = new int [ N ] ;
int [ ] C = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  A [ i ] = a ;
  B [ i ] = b ;
  C [ i ] = c ;
}
int cmax = Collections . max ( C ) ;
int CM = N * cmax + 10 ;
int [ ] [ ] [ ] dp = new int [ N ] [ 401 ] [ 401 ] ;
for ( int broop = 0 ;
broop < 401 ;
broop ++ ) for ( int aroop = 0 ;
aroop < 401 ;
aroop ++ ) for ( int nroop = 0 ;
nroop < N + 1 ;
nroop ++ ) dp [ 0 ] [ 0 ] [ 0 ] = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  for ( int cb = 0 ;
  cb < 401 ;
  cb ++ ) {
    for ( int ca = 0 ;
    ca < 401 ;
    ca ++ ) {
      if ( dp [ i ] [ ca ] [ cb ] == CM ) continue ;
      dp [ i + 1 ] [ ca ] [ cb ] = Math . min ( dp [ i + 1 ] [ ca ] [ cb ] , dp [ i ] [ ca ] [ cb ] ) ;
      if ( ca + A [ i ] < 401 && cb + B [ i ] < 401 ) dp [ i + 1 ] [ ca + A [ i ] ] [ cb + B [ i ] ] = Math . min ( dp [ i + 1 ] [ ca + A [ i ] ] [ cb + B [ i ] ] , dp [ i ] [ ca ] [ cb ] + C [ i ] ) ;
    }
  }
}
int ans = CM ;
for ( int cb = 0 ;
cb < 400 ;
cb ++ ) for ( int ca = 0 ;
ca < 400 ;
ca ++ )