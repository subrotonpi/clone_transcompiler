@ org . junit . experimental . theories . DataPoint public static String calc ( int [ ] a , int [ ] b ) {
  int n = a [ 0 ] ;
  int l = a [ 1 ] ;
  int h = a [ 2 ] ;
  int [ ] freq = b ;
  for ( int i = l ;
  i <= h ;
  i ++ ) {
    boolean harmony = true ;
    for ( int f : freq ) {
      if ( ! ( f % i == 0 || i % f == 0 ) ) {
        harmony = false ;
        break ;
      }
    }
    if ( harmony ) {
      return "" + i ;
    }
  }
  return "NO" ;
}
