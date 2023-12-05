static final int [ ] getEvenArray ( ) {
  final int a = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] odArray = new int [ a + 1 ] ;
  final int [ ] evenArray = new int [ a + 1 ] ;
  int count = 0 ;
  for ( int odd = 0 ;
  odd < odArray . length ;
  odd ++ ) {
    odArray [ odd ] = even ;
  }
  for ( int even = 0 ;
  even < evenArray . length ;
  even ++ ) {
    evenArray [ even ] = odd ;
  }
  count ++ ;
  return odArray ;
}
