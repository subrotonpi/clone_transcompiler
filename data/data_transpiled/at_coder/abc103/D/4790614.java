public static int N ( Scanner input ) {
  int M = input . nextInt ( ) ;
  Map < Integer , Integer > D = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    if ( ! b . equals ( a ) ) D . put ( b , a ) ;
    else if ( a > D . get ( b ) ) D . put ( b , a ) ;
  }
  int th = 0 ;
  int count = 0 ;
  List < Map . Entry < Integer , Integer >> list = new ArrayList < > ( ) ;
  list . sort ( D . entrySet ( ) ) ;
  Iterator < Map . Entry < Integer , Integer >> it = list . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    Map . Entry < Integer , Integer > e = it . next ( ) ;
    int s = e . getValue ( ) ;
    if ( ( ( th < s ) || ( e . getValue ( ) < th ) ) ) {
      th = e . getValue ( ) - 1 ;
      count ++ ;
    }
  }
  System . out . println ( count ) ;
  return count ;
}
