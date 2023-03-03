static final long test ( int N , int M , int K , int t , int b , int limit ) throws IOException {
  final long stone = t + b ;
  final long cover = t + b ;
  int layer = 2 ;
  while ( layer <= M ) {
    if ( cover >= K && t - b <= 2 ) {
      return stone ;
    }
    else {
      stone += 2 ;
      b = Math . min ( N , b + 2 ) ;
      cover += b ;
      if ( b > t ) {
        t = b ;
        b = t ;
      }
      layer ++ ;
    }
    if ( stone > limit ) {
      break ;
    }
  }
  return - 1 ;
}
