static final int [ ] solve ( ) {
  final int inf = 1 << 60 ;
  int ans = 0 ;
  {
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int k = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] a = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) - k ;
    }
    int [ ] s = new int [ a . length + 1 ] ;
    s [ 0 ] = 0 ;
    s [ a . length ] = 0 ;
    MergeSort . mergeSort ( s ) ;
    System . out . println ( ans ) ;
  }
  {
    if ( a . length == 1 ) {
      return a ;
    }
    int [ ] apre = MergeSort . mergeSort ( a , 0 , a . length / 2 ) ;
    int [ ] asuf = MergeSort . mergeSort ( a , a . length / 2 , a . length ) ;
    int [ ] res = merge ( apre , asuf ) ;
    return res ;
  }
  {
    int [ ] res ;
    int na ;
    int nb ;
    int la ;
    int lb ;
    res = new int [ na + nb ] ;
    for ( int i = 0 ;
    i < na ;
    i ++ ) {
      if ( a [ la ] <= b [ lb ] ) {
        ans += na - la ;
        res [ lb ] = b [ lb ] ;
        lb ++ ;
      }
      else {
        res [ lb ] = a [ la ] ;
        la ++ ;
      }
    }
    return res ;
  }
}
