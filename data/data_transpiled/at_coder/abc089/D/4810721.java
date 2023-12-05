public static int [ ] [ ] getDistance ( String input , int h , int w , int d ) {
  int [ ] [ ] a = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) a [ i ] [ 0 ] = Integer . parseInt ( input . substring ( 0 , i ) ) ;
  int q = Integer . parseInt ( input ) ;
  int [ ] [ ] lr = new int [ q ] [ w ] ;
  for ( int i = 0 ;
  i < lr . length ;
  i ++ ) lr [ i ] = new int [ q ] ;
  for ( int i = 0 ;
  i < lr [ i ] . length ;
  i ++ ) lr [ i ] [ 0 ] = Integer . parseInt ( input . substring ( 0 , i ) ) ;
  int size = h * w ;
  int [ ] [ ] dist = new int [ ( size ) ] [ d ] ;
  int [ ] ilist = new int [ size + 1 ] ;
  int [ ] jlist = new int [ size + 1 ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) for ( int j = 0 ;
  j < w ;
  j ++ ) {
    ilist [ i ] = i ;
    jlist [ i ] = j ;
  }
  /* Distance to the list of numbers */
  int distance = Math . abs ( ilist [ 0 ] - ilist [ 1 ] ) + Math . abs ( jlist [ 0 ] - jlist [ 1 ] ) ;
  /* Distance to the list of numbers */
  for ( int i = 0 ;
  i < d ;
  i ++ ) for ( int j = 0 ;
  j < ( size ) / d + 1 ;
  j ++ ) if ( ( j - 1 ) * d + i <= 0 || j * d + i > size ) continue ;
  dist [ i ] [ j ] = dist [ i ] [ j - 1 ] + getDistance ( j * d + i , ( j - 1 ) * d + i ) ;
  for ( int l = 0 ;
  l < lr . length ;
  l ++ ) for ( int r = 0 ;
  r < lr [ l ] [ r ] ;
  l ++ ) System . out . println ( dist [ r % d ] [ r / d ] - dist [ l % d ] [ l / d ] ) ;
  return dist ;
}
