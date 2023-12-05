static final int [ ] [ ] shift ( int [ ] a ) {
  final int [ ] [ ] array = new int [ a . length ] [ ] ;
  int [ ] height = new int [ a . length ] ;
  int [ ] width = new int [ a . length ] ;
  int [ ] [ ] temp ;
  {
    Arrays . fill ( arr , a ) ;
  }
  {
    Arrays . fill ( array , a ) ;
  }
  {
    Arrays . fill ( height , a ) ;
  }
  {
    Arrays . fill ( width , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  {
    Arrays . fill ( temp , a ) ;
  }
  int [ ] [ ] arrayInt = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    arrayInt [ i ] = array [ i ] ;
  }
  int [ ] [ ] arrayInt = new int [ N ] [ ] ;
  int count ;
  if ( N >= 2 ) {
    count = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      count [ i ] = shift ( arrayInt ) . isSym ( 0 , i ) * ( N - i ) ;
    }
  }
  else {
    count = ( int [ ] ) shift ( arrayInt ) . isSym ( 0 , 0 ) ;
  }
  System . out . println ( count ) ;
}
