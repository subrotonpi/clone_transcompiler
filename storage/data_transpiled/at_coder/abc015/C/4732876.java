static boolean exec ( int [ ] [ ] input , int layer , int [ ] targets ) {
  if ( layer == input . length ) {
    int xor = 0 ;
    for ( int num : targets ) {
      xor = xor ^ num ;
    }
    return xor == 0 ;
  }
  else {
    for ( int num : input [ layer ] ) {
      int [ ] targets2 = targets . clone ( ) ;
      targets2 [ num ] = num ;
      boolean result = exec ( input , layer + 1 , targets2 ) ;
      if ( result ) {
        return true ;
      }
    }
  }
  int n = Integer . parseInt ( input [ layer ] ) ;
  int k = Integer . parseInt ( input [ layer ] ) ;
  int [ ] array = new int [ n ] ;
  for ( int i = 0 ;
  i < array . length ;
  i ++ ) {
    array [ i ] = Integer . parseInt ( input [ layer ] ) ;
  }
  boolean result = exec ( array , 0 , targets ) ;
  System . out . println ( result ? "Found" : "Nothing" ) ;
}
