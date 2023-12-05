public static String input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  /*if (S.length() == 1) {
  return S;
  } else if (S.equals("AA")) {
  return "B";
  } else if (S.equals("AB") or S.equals("BA")) {
  return "";
  } else if (S.equals("BB")) {
  return "A";
  }*/
  /*diff (a,b) {
  return a;
  }*/
  String a = "" ;
  String [ ] Sn = new String [ S . length ( ) ] ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    a = sign ( a + S [ i ] ) ;
    Sn [ i ] = a ;
  }
  a = "" ;
  String [ ] Tn = new String [ T . length ( ) ] ;
  for ( int i = 0 ;
  i < T . length ( ) ;
  i ++ ) {
    a = sign ( a + T [ i ] ) ;
    Tn [ i ] = a ;
  }
  int q = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    a = Integer . parseInt ( input ( ) ) ;
    b = Integer . parseInt ( input ( ) ) ;
    c = Integer . parseInt ( input ( ) ) ;
    d = Integer . parseInt ( input ( ) ) ;
    if ( diff ( Sn [ b ] , Sn [ a - 1 ] ) == diff ( Tn [ d ] , Tn [ c - 1 ] ) ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
  return a ;
}
