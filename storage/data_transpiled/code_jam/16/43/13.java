@ Test ( testName = "small-attempt0" ) public static String TEST = "C-" + TEST ;
final String IN = "C-" + TEST + ".in" ;
final String OUT = "C-" + TEST + ".out" ;
{
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      yield ( i , j ) ;
    }
  }
}
{
  /*construct */
  final char [ ] [ ] maze = new char [ r * c ] [ ] ;
  {
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      maze [ i ] = new char [ r ] ;
    }
    {
      /*construct */
      for ( int i = 0 ;
      i < r ;
      i ++ ) {
        maze [ i ] [ 0 ] = '-' ;
        maze [ i ] [ 1 ] = '-' ;
        paths [ i ] = new char [ r ] ;
      }
    }
    {
      /*construct */
      for ( int i = 0 ;
      i < r ;
      i ++ ) {
        maze [ i ] [ 0 ] = '-' ;
        maze [ i ] [ 1 ] = '-' ;
        paths [ i ] [ 0 ] = '-' ;
        paths [ i ] [ 1 ] = '-' ;
        paths [ i ] [ 1 ] = '-' ;
        paths [ i ] [ 0 ] = '-' ;
        paths [ i ] [ 1 ] = '-' ;
        paths [ i ] [ 1 ] = '-' ;
        paths [ i ] [ 0 ] = '-' ;
        paths [ i ] [ 1 ] = '-' ;
        paths [ i ] [ 1 ] = '-' ;
        paths [ i ] [ 0 ] = '-' ;
        paths [ i ] [ 1 ] = '-' ;
        paths [ i ] [ 1 ] = '-' ;
        paths [ i ] [ 1 ] = '-' ;
      }
    }
  }
  {
    /*construct */
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      maze [ i ] [ 0 ] = '-' ;
      maze [ i ] [ 1 ] = '-' ;
      maze [ i ] [ 1 ] = '-' ;
      paths [ i ] [ 1 ] = '-' ;
      paths [ i ] [ 1 ] = '-' ;
    }
  }
  /*verify */
}
