static final int [ ] binarySearch ( int N ) {
  int [ ] a = new int [ N ] ;
  int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = i ;
    b [ i ] = i ;
  }
  c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    c [ i ] = i ;
  }
  ArrayList < Integer > sortedA = new ArrayList < Integer > ( a ) ;
  ArrayList < Integer > sortedC = new ArrayList < Integer > ( c ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sortedA . add ( a [ i ] ) ;
    sortedC . add ( c [ i ] ) ;
  }
  int ans = 0 ;
  for ( int eachB : b ) {
    int ai = binarySearch ( sortedA , eachB ) ;
    int ci = binarySearch ( sortedC , eachB ) ;
    ans += ai * ( c . length - ci ) ;
  }
  System . out . println ( ans ) ;
  return sortedA ;
}
