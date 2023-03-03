public static int bit ( int n ) {
  int size = n ;
  int [ ] tree = new int [ n ] ;
  int i ;
  int s ;
  int i ;
  int j ;
  int i ;
  int s ;
  int i = 0 ;
  s = 0 ;
  i -- ;
  while ( i >= 0 ) {
    s += tree [ i ] ;
    i = ( i & ( i + 1 ) ) - 1 ;
  }
  /* add a bit */
  while ( i < size ) {
    tree [ i ] += x ;
    i |= i + 1 ;
  }
  a = ( char ) 'a' ;
  /* make index */
  index = new int [ 26 ] [ ] ;
  for ( i = 0 ;
  i < 26 ;
  i ++ ) {
    char ch = ( char ) i ;
    index [ ( char ) - a ] [ i ] = i ;
  }
  /* solve the string */
  n = s . length ;
  index = makeIndex ( s ) ;
  odd = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    int code = ( char ) ( s . charAt ( i ) - a ) ;
    index [ ( char ) - a ] [ i ] = i ;
  }
  /* solve the string */
  n = s . length ;
  index = makeIndex ( s ) ;
  odd = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    int code = ( char ) ( s . charAt ( i ) - a ) ;
    if ( code == odd && index [ code ] [ index . length - 1 ] == i ) {
      continue ;
    }
    cnt ++ ;
    j = index [ code ] . pop ( ) ;
    ans += n - cnt - ( j - bit . sum ( j ) ) ;
    bit . add ( j , 1 ) ;
    if ( n / 2 <= cnt ) {
      break ;
    }
  }
  if ( odd != 0 ) {
    j = index [ odd ] [ index . length - 1 ] ;
    ans += Math . abs ( n / 2 - ( j - bit . sum ( j ) ) ) ;
  }
  /* main */
  s = input . readLine ( ) ;
  System . out . println ( solve ( s ) ) ;
  if ( __name__ == "main" ) {
    main ( ) ;
  }
  return ans ;
}
