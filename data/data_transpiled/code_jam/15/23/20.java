private static int next ( List < List < Integer >> s , int N ) throws Exception {
  int [ ] D = new int [ N ] ;
  int [ ] M = new int [ N ] ;
  for ( List < Integer > e : s ) {
    int d = e . get ( 0 ) ;
    int h = e . get ( 1 ) ;
    int m = e . get ( 2 ) ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      D [ i ] = d ;
      M [ i ] = m + i ;
    }
  }
  int [ ] arrivals = new int [ M . length ] ;
  for ( int i = 0 ;
  i < arrivals . length ;
  i ++ ) arrivals [ i ] = M [ i ] * ( 360.0 - D [ i ] ) / 360.0 ;
  int [ ] allreturns = new int [ M . length ] ;
  for ( int i = 0 ;
  i < arrivals . length ;
  i ++ ) allreturns [ i ] = arrivals [ i ] + M [ i ] ;
  int [ ] oldreturns = allreturns ;
  int H = arrivals . length ;
  for ( int j = 1 ;
  j < H ;
  j ++ ) {
    int [ ] nextreturns = new int [ M . length ] ;
    for ( int i = 0 ;
    i < nextreturns . length ;
    i ++ ) nextreturns [ i ] = oldreturns [ i ] + M [ i ] ;
    oldreturns = nextreturns ;
    allreturns [ j ] = nextreturns ;
  }
  Arrays . sort ( arrivals ) ;
  Arrays . sort ( allreturns ) ;
  if ( Collections . max ( arrivals ) < Collections . min ( allreturns ) ) return 0 ;
  int r = H ;
  for ( int a : arrivals ) {
    int returnpenalty = Integer . valueOf ( allreturns [ a ] ) ;
    int arrivalpenalty = Integer . valueOf ( arrivals [ a ] ) ;
    int number = arrivalpenalty + returnpenalty ;
    if ( number < r ) r = number ;
  }
  BufferedReader input = new BufferedReader ( new FileReader ( RSystem . class . getResource ( "./C-small-2-attempt2.in" ) ) ) ;
  List < Integer > X = new ArrayList < Integer > ( ) ;
  X . add ( input . readLine ( ) ) ;
  int C = Integer . valueOf ( X . get ( 0 ) ) ;
  int [ ] [ ] Y = new int [ X . size ( ) ] [ ]