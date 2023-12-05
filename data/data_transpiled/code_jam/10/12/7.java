@ Sys public static String from ( ) {
  final int N = 256 ;
  {
    final int dd = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int ii = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int mm = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int n = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int [ ] A = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int [ ] x = new int [ N ] ;
    for ( int a : A ) {
      final int [ ] y = new int [ N ] ;
      for ( int v : x ) y [ v ] = v + dd ;
      for ( int i : xrange ( N ) ) y [ i ] = Math . min ( y [ i ] , Math . min ( x [ Math . max ( 0 , i - mm ) ] , Math . min ( i + mm + 1 , N ) ) + Math . abs ( i - a ) ) ;
      for ( int i : xrange ( N ) ) for ( int j : xrange ( i + 1 , Math . min ( N , i + mm + 1 ) ) ) y [ j ] = Math . min ( y [ j ] , y [ i ] + ii ) ;
      for ( int i : xrange ( N ) ) for ( int j : xrange ( i + 1 , Math . min ( N , i + mm + 1 ) ) ) y [ N - 1 - j ] = Math . min ( y [ N - 1 - j ] , y [ N - 1 - i ] + ii ) ;
      x = y ;
    }
    return String . valueOf ( Math . min ( x , 0 ) ) ;
  }
  final int tno = Integer . parseInt ( stdin . readLine ( ) ) ;
  for ( int i : xrange ( 0 , tno ) ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + main ( ) ) ;
  }
  return String . valueOf ( System . out ) ;
}
