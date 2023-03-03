public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( A <= A + i && A + i <= B ) {
      ans . add ( A + i ) ;
    }
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( A <= B - ( K - 1 ) + i && B - ( K - 1 ) + i != B && ! ans . contains ( B - ( K - 1 ) + i ) ) {
      ans . add ( B - ( K - 1 ) + i ) ;
    }
  }
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return A ;
}
