public static String bAamoeba ( int N , int M , int [ ] [ ] Board ) {
  int [ ] [ ] anBoard = new int [ M ] [ N ] ;
  for ( int row = 0 ;
  row < N ;
  row ++ ) anBoard [ row ] = new int [ N ] ;
  for ( int col = 0 ;
  col < N ;
  col ++ ) anBoard [ row ] [ col ] = 0 ;
  for ( int row = 1 ;
  row < N - 1 ;
  row ++ ) {
    for ( int col = 1 ;
    col < M - 1 ;
    col ++ ) {
      int v = Math . min ( Board [ row - 1 ] [ col ] , Board [ row ] [ col + 1 ] , Board [ row + 1 ] [ col ] , Board [ row ] [ col - 1 ] ) ;
      anBoard [ row ] [ col ] = v ;
      Board [ row - 1 ] [ col ] -= v ;
    }
  }
  String ans = String . join ( "\n" , anBoard ) ;
  return ans ;
}
