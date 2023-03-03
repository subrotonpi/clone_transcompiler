public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = A ;
  i <= B ;
  i ++ ) {
    List i2 = new LinkedList ( String . valueOf ( i ) ) ;
    List i3 = new LinkedList ( ) ;
    i2 . add ( i ) ;
    if ( i2 . equals ( i3 ) ) {
      ans ++ ;
    }
    else {
      continue ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
