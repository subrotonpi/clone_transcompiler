public static void N ( int N ) {
  String [ ] w = new String [ N ] ;
  for ( int i = 0 ;
  i < w . length ;
  i ++ ) w [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < Character , Integer > dic = new HashMap < Character , Integer > ( ) ;
  dic . put ( 'b' , 1 ) ;
  dic . put ( 'c' , 1 ) ;
  dic . put ( 'd' , 2 ) ;
  dic . put ( 'w' , 2 ) ;
  dic . put ( 't' , 3 ) ;
  dic . put ( 'j' , 3 ) ;
  dic . put ( 'f' , 4 ) ;
  dic . put ( 'q' , 4 ) ;
  dic . put ( 'l' , 5 ) ;
  dic . put ( 'v' , 5 ) ;
  dic . put ( 's' , 6 ) ;
  dic . put ( 'x' , 6 ) ;
  dic . put ( 'p' , 7 ) ;
  dic . put ( 'm' , 7 ) ;
  dic . put ( 'h' , 8 ) ;
  dic . put ( 'k' , 9 ) ;
  dic . put ( 'n' , 9 ) ;
  dic . put ( 'g' , 9 ) ;
  dic . put ( 'z' , 0 ) ;
  dic . put ( 'r' , 0 ) ;
  ArrayList < String > ans = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String lowerw [ i ] = w [ i ] . toLowerCase ( ) ;
    String temp = "" ;
    for ( int j = 0 ;
    j < lowerw . length ;
    j ++ ) {
      if ( lowerw [ j ] . equals ( j ) ) temp += Integer . toString ( dic . get ( j ) ) ;
    }
    if ( temp . length ( ) != 0 ) ans . add ( temp ) ;
  }
  System . out . println ( ans . toString ( ) ) ;
}
