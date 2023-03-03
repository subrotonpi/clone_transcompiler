public static void warshallFloyd ( int [ ] [ ] dist , int n ) {
  final Scanner input = new Scanner ( System . in ) ;
  final double inf = Double . MAX_VALUE ;
  /* WarshallFloyd the dist */
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( i == j ) {
          dist [ i ] [ j ] = 0 ;
        }
        else if ( dist [ i ] [ j ] > dist [ i ] [ k ] + dist [ k ] [ j ] ) {
          dist [ i ] [ j ] = dist [ i ] [ k ] + dist [ k ] [ j ] ;
        }
      }
    }
  }
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Edge > edges = new ArrayList < > ( ) ;
  final int [ ] [ ] ad = new int [ N ] [ N ] ;
  for ( int a = 0 ;
  a < M ;
  a ++ ) {
    for ( int b = 0 ;
    b < N ;
    b ++ ) {
      for ( int s = 0 ;
      s < N ;
      s ++ ) {
        if ( ad [ s ] [ a ] + c == ad [ s ] [ b ] ) {
          ans -- ;
          break ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
