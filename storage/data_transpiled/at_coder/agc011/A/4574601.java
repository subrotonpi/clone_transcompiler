public static void print ( int visitor , int capacity , int limit ) {
  int [ ] visitorArray = new int [ visitor ] ;
  for ( int i = 0 ;
  i < visitor ;
  i ++ ) {
    int arrivalTime = Integer . parseInt ( input . readLine ( ) ) ;
    visitorArray [ i ] = arrivalTime ;
  }
  Arrays . sort ( visitorArray ) ;
  int start = visitorArray [ 0 ] ;
  int end = start + limit ;
  int count = 0 ;
  int bus = 1 ;
  for ( int j = 0 ;
  j < visitorArray . length ;
  j ++ ) {
    if ( start <= visitorArray [ j ] && visitorArray [ j ] <= end ) {
      count ++ ;
      if ( count <= capacity ) {
        continue ;
      }
      else {
        bus ++ ;
        start = visitorArray [ j ] ;
        end = visitorArray [ j ] + limit ;
        count = 1 ;
      }
    }
    else {
      bus ++ ;
      start = visitorArray [ j ] ;
      end = visitorArray [ j ] + limit ;
      count = 1 ;
    }
  }
  System . out . println ( bus ) ;
}
