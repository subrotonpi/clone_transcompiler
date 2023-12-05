static int run ( int N , int D , int S0 , int As , int Cs , int Rs , int M0 , int Am , int Cm , int Rm ) throws IOException {
  final int [ ] sal = new int [ N ] ;
  final int [ ] man_ = new int [ N ] ;
  sal [ 0 ] = S0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    sal [ i ] = ( sal [ i - 1 ] * As + Cs ) % Rs ;
    man_ [ i ] = ( man_ [ i - 1 ] * Am + Cm ) % Rm ;
  }
  final int [ ] man = new int [ N ] ;
  man [ 0 ] = - 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    man [ i ] = man_ [ i ] % i ;
  }
  final int [ ] ranl = new int [ N ] ;
  ranl [ 0 ] = sal [ 0 ] - D ;
  int [ ] ranh = new int [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    ranl [ i ] = sal [ 0 ] - D ;
    int sall = ranh [ 0 ] ;
    int salh [ ] = - 1 ;
    int node = i ;
    while ( node != 0 ) {
      sall = Math . min ( sall , sal [ node ] ) ;
      salh = Math . max ( salh , sal [ node ] ) ;
      node = man [ node ] ;
    }
    if ( ( salh - sall <= D ) && ( sall <= D ) ) {
      ranl [ i ] = salh - D ;
      ranh [ i ] = sall ;
    }
  }
  ranl [ 1 ] = Rs + 1 ;
  ranh [ 1 ] = Rs + 1 ;
  Arrays . sort ( ranl , Collections . reverseOrder ( ranh ) ) ;
  Arrays . sort ( ranh , Collections . reverseOrder ( ranl ) ) ;
  int count = 0 ;
  int maxx = 0 ;
  for ( int i = 2 * ranl . length - 2 ;
  i < N ;
  i ++ ) {
    final int val ;
    if ( ranl [ i - 1 ] <= ranh [ i - 1 ] ) {
      val = ranl [ i - 1 ] ;
      count ++ ;
      ranl [ i - 1 ] = ranh [ i - 1 ] ;
    }
    else {
      val = ranh [ i - 1 ]