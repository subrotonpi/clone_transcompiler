static int solve ( int r , int k , int n , int [ ] a ) {
  final Map < Integer , Integer > next = new HashMap < > ( ) ;
  final Map < Integer , Integer > income = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int j = i ;
    int people = 0 ;
    boolean secondTime = false ;
    do {
      people += a [ j ] ;
      if ( people > k || ( j == i && secondTime ) ) {
        people -= a [ j ] ;
        break ;
      }
      j ++ ;
      j = j % n ;
      secondTime = true ;
    }
    next . put ( i , j ) ;
    income . put ( i , people ) ;
  }
  Set < Integer > occ = new HashSet < > ( ) ;
  int pos = 0 ;
  occ . add ( pos ) ;
  do {
    pos = next . get ( pos ) ;
    if ( occ . contains ( pos ) ) break ;
    occ . add ( pos ) ;
  }
  int cross = pos ;
  int length = 0 ;
  int sum = 0 ;
  do {
    length ++ ;
    sum += income . get ( pos ) ;
    pos = next . get ( pos ) ;
    if ( pos == cross ) break ;
  }
  while ( pos != cross ) ;
  pos = 0 ;
  int firstSum = 0 ;
  int firstLength = 0 ;
  while ( ( pos != cross ) && ( firstLength < r ) ) {
    firstLength ++ ;
    firstSum += income . get ( pos ) ;
    pos = next . get ( pos ) ;
  }
  if ( r <= firstLength ) return firstSum ;
  final int aroundLength = r - firstLength ;
  final int times = aroundLength / length ;
  final int remainLength = aroundLength % length ;
  pos = cross ;
  int remainSum = 0 ;
  for ( int i = 0 ;
  i < remainLength ;
  i ++ ) {
    remainSum += income . get ( pos ) ;
    pos = next . get ( pos ) ;
  }
  final int finalSum = firstSum + sum * times + remainSum ;
  return finalSum ;
}
