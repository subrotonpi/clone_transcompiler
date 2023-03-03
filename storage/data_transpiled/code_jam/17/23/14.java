static final Scanner re = new Scanner ( System . in ) {
  private int [ ] scan ;
  private int [ ] [ ] st = new int [ scan . length ] [ scan . length ] ;
  {
    while ( true ) {
      scan = new Scanner ( System . in ) . nextInt ( ) ;
    }
  }
  public int [ ] scan ( ) {
    return new int [ scan . length ] ;
  }
  private final Function < Integer , String > red = new Function < Integer , String > ( ) {
    public String apply ( Integer ... a ) {
      System . err . println ( a [ 0 ] + ":" + a [ 1 ] ) ;
      return a [ 0 ] ;
    }
  }
  ;
  private final double inf = Double . MAX_VALUE ;
  private final Scanner calc = new Scanner ( System . in ) ;
  private final int n = scan . nextInt ( ) , q = scan . nextInt ( ) ;
  final int [ ] horse = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) horse [ i ] = ( scan . nextInt ( ) ) ;
  final int [ ] [ ] dist = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) dist [ i ] = scan . nextInt ( ) ;
  q = scan . nextInt ( ) ;
  final int [ ] [ ] stp = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) stp [ i ] [ i ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) for ( int j = 0 ;
  j < n ;
  ++ j ) if ( dist [ i ] [ j ] != - 1 ) stp [ i ] [ j ] = dist [ i ] [ j ] ;
  for ( int k = 0 ;
  k < n ;
  ++ k ) for ( int i = 0 ;
  ++ i < n ;
  ++ i ) for ( int j = 0 ;
  j < n ;
  ++ j ) stp [ i ] [ j ] = Math . min ( stp [ i ] [ j ] , stp [ i ] [ k ] + stp [ k ] [ j ] ) ;
  final double [ ] [ ] mt = new double [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) mt [ i ] [ i ] = inf ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) for ( int j = 0