static final String [ ] getStrings ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] A = new String [ H ] ;
  String ans = "" ;
  String [ ] answers = new String [ ] {
    "Possible" , "Impossible" }
    ;
    Pattern r = Pattern . compile ( rPattern . matcher ( A ) . replaceAll ( "\\.*#+\\.*" ) ) ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      String s = input . nextLine ( ) ;
      if ( r . matcher ( s ) . matches ( ) ) {
        A [ i ] = s ;
      }
      else {
        ans = answers [ 1 ] ;
        break ;
      }
    }
    if ( ans . equals ( "" ) ) {
      ans = answers [ 0 ] ;
    }
    System . out . println ( ans ) ;
  }
  