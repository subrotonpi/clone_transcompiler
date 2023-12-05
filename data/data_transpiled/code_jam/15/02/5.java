static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int t = 0 ;
t < T ;
t ++ ) {
  System . console ( ) . readLine ( ) ;
  int [ ] P = ArrayUtil . splitByCommaSeparatedArray ( System . console ( ) . readLine ( ) . split ( " " ) ) ;
  int [ ] spl = new int [ P . length ] ;
  Arrays . fill ( spl , 1 ) ;
  int res = 10000 ;
  for ( int i = 0 ;
  i < 1005 ;
  i ++ ) {
    int maxi = 0 ;
    for ( int j = 0 ;
    j < P . length ;
    j ++ ) {
      if ( ( P [ j ] + spl [ j ] - 1 ) / spl [ j ] > ( P [ maxi ] + spl [ maxi ] - 1 ) / spl [ maxi ] ) {
        maxi = j ;
      }
    }
    res = Math . min ( res , i + ( P [ maxi ] + spl [ maxi ] - 1 ) / spl [ maxi ] ) ;
    spl [ maxi ] ++ ;
  }
  System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
}
