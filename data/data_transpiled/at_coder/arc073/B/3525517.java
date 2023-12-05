public static void main ( int N , int W ) {
  int w , v ;
  int w0 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    w = Integer . parseInt ( input . readLine ( ) ) ;
    v = Integer . parseInt ( input . readLine ( ) ) ;
    if ( i == 0 ) {
      w0 = w ;
    }
    if ( w == w0 ) {
      w1 [ i ] = v ;
    }
    else if ( w == w0 + 1 ) {
      w2 [ i ] = v ;
    }
    else if ( w == w0 + 2 ) {
      w3 [ i ] = v ;
    }
    else {
      w4 [ i ] = v ;
    }
  }
  Arrays . sort ( w1 ) ;
  Arrays . sort ( w2 ) ;
  Arrays . sort ( w3 ) ;
  Arrays . sort ( w3 ) ;
  Arrays . sort ( w4 ) ;
  int maxV = 0 ;
  for ( int i1 = 0 ;
  i1 < w1 . length + 1 ;
  i1 ++ ) {
    for ( int i2 = 0 ;
    i2 < w2 . length + 1 ;
    i2 ++ ) {
      for ( int i3 = 0 ;
      i3 < w3 . length + 1 ;
      i3 ++ ) {
        for ( int i4 = 0 ;
        i4 < w4 . length + 1 ;
        i4 ++ ) {
          int w = i1 * w0 + i2 * ( w0 + 1 ) + i3 * ( w0 + 2 ) + i4 * ( w0 + 3 ) ;
          if ( w <= W ) {
            int V = Integer . parseInt ( input . readLine ( ) ) + Integer . parseInt ( input . readLine ( ) ) + Integer . parseInt ( input . readLine ( ) ) + Integer . parseInt ( input . readLine ( ) ) + Integer . parseInt ( input . readLine ( ) ) ;
            maxV = Math . max ( V , maxV ) ;
          }
        }
      }
    }
  }
  System . out . println ( maxV ) ;
}
