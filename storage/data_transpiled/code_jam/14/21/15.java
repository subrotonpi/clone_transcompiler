static final String getDistance ( String cs1 , String cs2 ) throws IOException {
  int [ ] nums1 = new int [ cs1 . length ( ) ] ;
  int [ ] nums2 = new int [ cs2 . length ( ) ] ;
  for ( int i = 0 ;
  i < nums1 . length ;
  i ++ ) {
    nums1 [ i ] = cs1 . charAt ( i ) ;
    nums2 [ i ] = cs2 . charAt ( i ) ;
  }
  return getDistance ( nums1 , nums2 ) ;
}
