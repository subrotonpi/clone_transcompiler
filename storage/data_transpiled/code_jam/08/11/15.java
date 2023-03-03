static final int solve ( int [ ] v1 , int [ ] v2 ) throws IOException {
  Arrays . sort ( v1 ) ;
  Arrays . sort ( v2 , Collections . reverseOrder ( ) ) ;
  int [ ] prods = new int [ v1 . length ] ;
  for ( int a = 0 ;
  a < prods . length ;
  a ++ ) {
    prods [ a ] = v1 [ a ] * v2 [ b ] ;
  }
  int sum = 0 ;
  for ( int p : prods ) {
    sum += p ;
  }
  return sum ;
}
