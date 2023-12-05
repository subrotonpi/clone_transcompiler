public static int [ ] [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] arr = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    arr [ i ] [ a ] = b ;
  }
  int [ ] leftArr = new int [ n ] ;
  Arrays . sort ( arr ) ;
  int [ ] rightArr = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    leftArr [ i ] [ 2 ] = arr [ i ] [ 2 ] ;
  }
  int [ ] rightArr = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    rightArr [ i ] [ 1 ] = arr [ i ] [ 1 ] ;
  }
  int ans = 0 ;
  int f = 0 ;
  int [ ] [ ] ok = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int lp = 0 ;
    int rp = 0 ;
    int now = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( f == 0 ) {
        while ( true ) {
          if ( ok [ leftArr [ rp ] [ 0 ] ] == 0 ) break ;
          else lp ++ ;
        }
      }
      if ( now >= rightArr [ rp ] [ 1 ] && now <= rightArr [ rp ] [ 2 ] ) {
        ans += 0 ;
      }
      else if ( Math . abs ( rightArr [ rp ] [ 1 ] - now ) < Math . abs ( rightArr [ rp ] [ 2 ] - now ) ) {
        ans += Math . abs ( rightArr [ rp ] [ 1 ] - now ) ;
        now = rightArr [ rp ] [ 2 ] ;
      }
      else {
        ans += Math . abs ( leftArr [ rp ] [ 2 ] - now ) ;
        now = leftArr [ rp ] [ 2 ] ;
      }
      ok [ leftArr [ rp ] [ 0 ] ] = 1 ;
      lp ++ ;
      f = 1 ;
    }
    else {
      while ( true ) {
        if ( f == 0 ) break ;
        else rp ++ ;
      }
    }
    ans += Math . abs ( now ) ;
    ans = 0 ;
  }
  return arr ;
}
