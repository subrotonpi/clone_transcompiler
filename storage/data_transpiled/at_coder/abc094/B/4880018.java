public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] list = new int [ N + 1 ] ;
  int [ ] costIdx = map . get ( costIdx ) ;
  for ( int i : costIdx ) {
    list [ i ] = 1 ;
  }
  int left = sum ( list , 0 , X + 1 ) ;
  int right = sum ( list , X ) ;
  return left ;
}
