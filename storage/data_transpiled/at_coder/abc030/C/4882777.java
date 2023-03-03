public static int n ( int m ) {
  int x = Integer . parseInt ( input . readLine ( ) ) ;
  int y = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  int xyz ;
  /* binarysearch */
  int x = x ;
  int y = y ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  /* binarysearch */
  {
    int ng = - 1 ;
    int ok = a . length ;
    while ( Math . abs ( ok - ng ) > 1 ) {
      int mid = ( ok + ng ) / 2 ;
      if ( a [ mid ] >= x ) {
        ok = mid ;
      }
      else {
        ng = mid ;
      }
    }
  }
  int ans = 0 ;
  int time = 0 ;
  boolean flag = true ;
  while ( true ) {
    if ( flag ) {
      xyz = binarysearch ( time , a ) ;
      if ( xyz == a . length ) break ;
      time = a [ xyz ] + x ;
      flag = false ;
    }
    else {
      xyz = binarysearch ( time , b ) ;
      if ( xyz == b . length ) break ;
      time = b [ xyz ] + y ;
      ans ++ ;
      flag = true ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
