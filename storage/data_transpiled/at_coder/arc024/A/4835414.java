public static int [ ] multiset ( int [ ] a , int [ ] b ) {
  int [ ] x = new int [ a . length + b . length ] , y = new int [ a . length + b . length ] ;
  System . arraycopy ( a , 0 , x , 0 , a . length ) ;
  System . arraycopy ( b , 0 , y , b . length ) ;
  return x ;
}
