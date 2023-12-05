public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int mx = max ( a ) ;
  a [ a . length - 1 ] = Math . abs ( mx ) ;
  int evn = Arrays . binarySearch ( a , 0 , a , 0 , 2 ) ;
  int odd = Arrays . binarySearch ( a , 1 , a , 0 , 2 ) ;
  if ( mx < 0 ) {
    System . out . println ( mx ) ;
  }
  else {
    System . out . println ( max ( evn , odd ) ) ;
  }
  int oe = Integer . valueOf ( evn < odd ? odd : evn ) ;
  int [ ] res = new int [ n ] ;
  int beg = 0 ;
  while ( beg % 2 != oe || a [ beg ] < 0 ) {
    res [ beg ] = 1 ;
    beg ++ ;
  }
  int end = n - 1 ;
  while ( end % 2 != oe || a [ end ] < 0 ) {
    res [ end - beg + 1 ] = end -- ;
  }
  while ( beg < end ) {
    if ( a [ end - 2 ] < 0 ) {
      res [ end - beg - 1 ] = end - 1 ;
    }
    else {
      res [ end - beg ] = end - 2 ;
    }
    end -= 2 ;
  }
  System . out . println ( res . length ) ;
  for ( int i : res ) {
    System . out . println ( i ) ;
  }
  return res ;
}
