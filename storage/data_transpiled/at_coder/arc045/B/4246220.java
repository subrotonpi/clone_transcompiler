public static String bDokidokiTakaHashi ( int N , int M , int [ ] Sections ) {
  int [ ] trimmedCount = new int [ N + 2 ] ;
  for ( int s = 0 ;
  s < N ;
  s ++ ) {
    int t = Sections [ s ] ;
    trimmedCount [ s ] ++ ;
    trimmedCount [ t + 1 ] -- ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    trimmedCount [ i ] += trimmedCount [ i - 1 ] ;
  }
  int [ ] X = new int [ trimmedCount . length ] ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    X [ i ] += 1 ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    X [ i ] += X [ i - 1 ] ;
  }
  X [ 0 ] -- ;
  return ans ;
}
