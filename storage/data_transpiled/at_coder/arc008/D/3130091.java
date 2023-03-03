static int [ ] [ ] makeSeg ( int [ ] [ ] array ) {
  int fin = 0 ;
  int n = array . length ;
  int [ ] [ ] seg = new int [ n ] [ n ] ;
  Arrays . fill ( seg , 0 , n , array [ 0 ] [ 0 ] , array [ n - 1 ] [ 0 ] , 1.0 , 0.0 ) ;
  Arrays . sort ( a , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      int [ ] a = o1 ;
      int [ ] b = o2 ;
      int [ ] c = new int [ a . length ] ;
      int pre = 0 ;
      for ( int i = 0 ;
      i < b . length ;
      i ++ ) {
        int [ ] bs = b [ i ] ;
        if ( pre != bs [ 0 ] ) {
          pre = bs [ 0 ] ;
        }
      }
      int [ ] seg = makeSeg ( c ) ;
      int mini = 1 ;
      int maxi = 1 ;
      for ( int i = 0 ;
      i < m ;
      i ++ ) {
        seg = update ( seg , a [ i ] ) ;
        int rec = seg [ 0 ] [ 4 ] + seg [ 0 ] [ 5 ] ;
        if ( rec < mini ) {
          mini = rec ;
        }
        else if ( rec > maxi ) {
          maxi = rec ;
        }
      }
      System . out . println ( mini ) ;
      System . out . println ( maxi ) ;
    }
  }
  /* left */
  int m = 2 * i + 1 ;
  /* right */
  int m = 2 * i + 2 ;
  /* mother */
  int i = ( i + 1 ) / 2 - 1 ;
  /* search */
  int now = 0 ;
  do {
    if ( seg [ now ] [ 1 ] - seg [ now ] [ 0 ] <= 1 ) {
      return now ;
    }
    if ( key <= seg [ left ( now ) ] [ 3 ] ) {
      now = left ( now ) ;
    }
    else {
      now = right ( now ) ;
    }
  }
  while ( now > 0 ) ;
  /* update */
  int [ ] [ ] a = new int [ m ] [ ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int [ ] x = new int [ 3 ] ;
    x [ 0 ] = Integer . parseInt ( input [ 0 ] ) ;
    x [ 1 ] = Double . parseDouble ( input [ 1 ] ) ;
    x [