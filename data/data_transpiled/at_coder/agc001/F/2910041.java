public static void invert ( int [ ] p , int [ ] q ) {
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    int pi = p [ i ] ;
    q [ pi ] = i ;
  }
  {
    int length = last - first ;
    if ( length <= 2 ) {
      if ( length == 2 && p [ first ] - p [ first + 1 ] >= k ) {
        p [ first ] = p [ first + 1 ] ;
        p [ first + 1 ] = p [ first ] ;
      }
      return ;
    }
    for ( int i = first + 1 ;
    i < last ;
    i ++ ) {
      int v = p [ i ] ;
      for ( int t = i - 1 ;
      t >= first ;
      t -- ) {
        if ( p [ t ] - v < k ) {
          t ++ ;
          break ;
        }
      }
      p [ t + 1 ] = p [ t ] ;
      p [ t ] = v ;
    }
  }
  {
    int length = last - first ;
    if ( length < 10 ) {
      sortInsertion ( length , p , first , last ) ;
      return ;
    }
    int middle = ( first + last ) / 2 ;
    sortMerge ( length , p , first , middle ) ;
    sortMerge ( length , p , middle , last ) ;
    int [ ] bounds = new int [ length ] ;
    System . arraycopy ( p , first , bounds , 0 , middle ) ;
    for ( int i = bounds . length - 2 ;
    i >= 0 ;
    i -- ) {
      bounds [ i ] = Math . min ( bounds [ i + 1 ] , bounds [ i ] ) ;
    }
    int [ ] tmp = new int [ length ] ;
    System . arraycopy ( tmp , 0 , tmp , 0 , length ) ;
    int firstLen = middle - first ;
    int head1 = 0 ;
    int head2 = middle ;
    for ( int ohead = first ;
    ohead < last ;
    ohead ++ ) {
      if ( head1 == firstLen || head2 == last ) {
        System . arraycopy ( tmp , ohead , tmp , head1 , firstLen - head1 ) ;
        return ;
      }
      else if ( bounds [ head1 ] - tmp [ head2 ] >= k ) {
        System . arraycopy ( tmp , ohead , tmp , head2 , lastLen - head1 ) ;
        head2 ++ ;
      }
      else {
        System . arraycopy ( tmp , ohead , tmp , head1 , lastLen - head1 ) ;
        head1 ++ ;
      }
    }
  }
}
