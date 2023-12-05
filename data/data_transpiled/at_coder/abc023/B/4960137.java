public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  /*switch (i) {
  case 1:
  return 'a' + s + 'c';
  case 2:
  return 'c' + s + 'a';
  case 0:
  return 'b' + s + 'b';
  }*/
  ArrayList < String > memo = new ArrayList < String > ( ) ;
  String init = "b" ;
  for ( int i = 1 ;
  i < 100 ;
  i ++ ) {
    memo . add ( init ) ;
    init = init . substring ( 0 , i ) ;
  }
  if ( memo . contains ( S ) ) {
    System . out . println ( memo . indexOf ( S ) ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return 0 ;
}
