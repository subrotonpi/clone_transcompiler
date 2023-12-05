public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ms = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ms [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( ms ) ;
  int [ ] times = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) times [ i ] = ( ms [ i ] + b - 1 ) / b ;
  int left = - 1 , right = Math . max ( times , 0 ) ;
  while ( right - left > 1 ) {
    int mid = ( left + right ) / 2 ;
    int center = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ms [ i ] - mid * b > 0 ) {
        int exd = a - b ;
        center += ( ms [ i ] - mid * b + exd - 1 ) / exd ;
      }
    }
    if ( center - mid > 0 ) left = mid ;
    else right = mid ;
  }
  System . out . println ( right ) ;
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( ) ;
  }
}
