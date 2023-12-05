public static long bs ( int l , int r , int [ ] m , int p , int [ ] [ ] price ) throws IOException {
  if ( max ( m ) == 0 ) return 0 ;
  if ( p == 1 ) return price [ 1 ] [ l / 2 ] ;
  int ll = l ;
  int lr = ( l + r ) / 2 ;
  int rl = lr + 1 ;
  int rr = r ;
  int pr = price [ p ] [ l / 2 * p ] ;
  long b ;
  if ( max ( m ) < p ) {
    b = ( bs ( ll , lr , m , 0 , ( rl - ll ) , p - 1 , price ) + bs ( rl , rr , m , ( rl - ll ) , 2 * p , price ) ) ;
  }
  else {
    b = - 1 ;
  }
  for ( int i : xrange ( m . length ) ) {
    if ( m [ i ] > 0 ) m [ i ] -- ;
  }
  long nb = pr + ( bs ( ll , lr , m , 0 , ( lr - ll + 1 ) , p - 1 , price ) + bs ( rl , rr , m , ( lr - ll + 1 ) , 2 * p , price ) ) ;
  if ( b >= 0 && nb > b ) return b ;
  else return nb ;
}
