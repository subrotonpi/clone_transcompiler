public static int n ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > AB = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) AB . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  Collections . sort ( AB , Collections . reverseOrder ( ) ) ;
  int [ ] weapon = new int [ n ] ;
  int x = AB . get ( 0 ) . intValue ( ) ;
  for ( int a = 0 ;
  a < n ;
  a ++ ) {
    int b = AB . get ( a ) ;
    if ( b >= x ) weapon [ b ] = x ;
  }
  Arrays . sort ( weapon ) ;
  weapon [ 0 ] = x ;
  int cnt = 0 ;
  for ( int w = weapon . length - 1 ;
  w > 0 ;
  w -- ) {
    h -= w ;
  }
  return cnt ;
}
