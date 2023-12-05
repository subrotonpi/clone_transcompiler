static final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) {
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  {
    int [ ] planets = ( int [ ] ) ( N ) ;
    int [ ] times = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      planets [ i ] = a [ i % C ] ;
    }
    int suma = 0 ;
    for ( int i = 0 ;
    i < planets . length ;
    i ++ ) {
      times [ i ] = suma ;
      suma += 2 * i ;
    }
    Stream < Planet > pt = Planet . zip ( planets , times ) ;
    List < Planet > improvements = new ArrayList < Planet > ( ) ;
    for ( Planet planet : pt ) {
      int time = planet . getPlanet ( ) . getTime ( ) ;
      if ( time - t > 0 ) {
        improvements . add ( planet ) ;
      }
      else if ( t > time + 2 * planet ) {
        improvements . add ( 0 ) ;
      }
      else {
        improvements . add ( planet . getPlanet ( ) - ( 0.5 * ( t - time ) ) ) ;
      }
    }
    List < Planet > imp = new ArrayList < Planet > ( ) ;
    Collections . sort ( imp ) ;
    System . out . println ( ( int ) ( 2 * Arrays . stream ( planets ) . mapToInt ( Planet :: getPlanet ) . sum ( ) - imp . stream ( ) . mapToInt ( Planet :: getPlanet ) . sum ( ) ) ) ;
  }
  for ( int tt = 0 ;
  tt < t ;
  tt ++ ) {
    int [ ] in = map . get ( tt ) ;
    System . out . println ( "Case #" + ( tt + 1 ) + ":" ) ;
    space ( in ) ;
  }
  return t ;
}
