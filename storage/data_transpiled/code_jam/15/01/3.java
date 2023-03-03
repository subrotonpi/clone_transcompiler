public static int numberNeeded ( int [ ] list ) {
  int invites = 0 ;
  int standing = 0 ;
  for ( int i = 0 ;
  i < list . length ;
  i ++ ) {
    if ( list [ i ] != 0 && standing < list [ i ] ) {
      invites += ( list [ i ] - standing ) ;
      standing += ( list [ i ] - standing ) ;
    }
    standing += list [ i ] ;
  }
  return ( invites ) ;
}
