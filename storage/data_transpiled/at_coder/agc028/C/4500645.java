static void print ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  System . setIn ( input ) ;
  final int n = input . nextInt ( ) ;
  final int [ ] [ ] Cost = new int [ n ] [ n ] ;
  int s1 = 0 , s2 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    s1 += a ;
    s2 += b ;
    Cost [ i ] [ 0 ] = a ;
    Cost [ i ] [ 1 ] = b ;
  }
  Arrays . sort ( Cost ) ;
  int s3 = Integer . MAX_VALUE ;
  if ( new HashSet < > ( Cost [ n ] ) . size ( ) == n ) {
    if ( Cost [ n - 1 ] [ 1 ] == Cost [ n ] [ 1 ] ) s3 += Math . min ( Cost [ n + 1 ] [ 0 ] - Cost [ n - 1 ] [ 0 ] , Cost [ n ] [ 0 ] - Cost [ n - 2 ] [ 0 ] ) ;
    else s3 += Cost [ n ] [ 0 ] - Cost [ n - 1 ] [ 0 ] ;
  }
  System . out . println ( Math . min ( s1 , s2 , s3 ) ) ;
}
