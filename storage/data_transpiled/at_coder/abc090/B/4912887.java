public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  List < String > S = new ArrayList < > ( ) ;
  for ( int i = A ;
  i <= B ;
  i ++ ) {
    S . add ( Collections . singletonList ( String . valueOf ( i ) ) ) ;
  }
  for ( String s : S ) {
    if ( ( s . equals ( s . substring ( 0 , s . length ( ) - 1 ) ) ) ) {
      ans ++ ;
    }
  }
  return ans ;
}
