input ;
T = input . nextInt ( ) ;
{
  int count = 1 ;
  char prev = '\0' ;
  List < Entry > lst = new ArrayList < Entry > ( ) ;
  for ( char character : inputString ) {
    if ( character != prev ) {
      if ( prev != '\0' ) {
        Entry entry = new Entry ( prev , count ) ;
        lst . add ( entry ) ;
      }
      count = 1 ;
      prev = character ;
    }
    else {
      count ++ ;
    }
  }
  else {
    Entry entry = new Entry ( character , count ) ;
    lst . add ( entry ) ;
  }
  return lst ;
}
private static int moves ( List < Integer > l ) {
  int m = 100000000 ;
  for ( int i = 0 ;
  i < 200 ;
  i ++ ) {
    m = Math . min ( m , Math . abs ( l . get ( i ) - i ) ) ;
  }
  return m ;
}
