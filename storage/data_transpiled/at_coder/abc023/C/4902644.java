static final int [ ] [ ] getBinarySearchMin ( ) {
  int r = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] R1 = new int [ r ] [ c ] ;
  int [ ] [ ] C1 = new int [ c ] [ c ] ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] candy = new int [ n ] [ ] ;
  for ( String l : System . in . readLine ( ) . split ( " " ) ) candy [ 0 ] = l . split ( " " ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    R1 [ candy [ i ] [ 0 ] - 1 ] ++ ;
    C1 [ candy [ i ] [ 1 ] - 1 ] ++ ;
  }
  Arrays . sort ( R1 ) ;
  Arrays . sort ( C1 ) ;
  /* Find the smallest occurrence of the two integers */
  int ng = - 1 ;
  int ok = r1 . length ;
  while ( Math . abs ( ok - ng ) > 1 ) {
    int mid = ( ok + ng ) / 2 ;
    if ( r1 [ mid ] >= r2 [ mid ] ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  /* Find the smallest occurrence of the two integers */
  ans = 0 ;
  for ( int i = 0 ;
  i < k + 1 ;
  i ++ ) {
    ans += binarySearch ( i , R ) * binarySearch ( k - i , C ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( R1 [ candy [ i ] [ 0 ] - 1 ] + C1 [ candy [ i ] [ 1 ] - 1 ] == k ) ans -- ;
    else if ( R1 [ candy [ i ] [ 0 ] - 1 ] + C1 [ candy [ i ] [ 1 ] - 1 ] == k + 1 ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return R1 ;
}
