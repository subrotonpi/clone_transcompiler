public static String [ ] [ ] x , int y , int W = Integer . parseInt ( input ) ;
int x = Integer . parseInt ( input . nextLine ( ) ) ;
int y = Integer . parseInt ( input . nextLine ( ) ) ;
String [ ] [ ] c = new String [ 9 ] [ ] ;
String yoko = null ;
List < String > sita = new ArrayList < String > ( ) ;
List < String > yokosita = new ArrayList < String > ( ) ;
for ( int i = 0 ;
i < 9 ;
i ++ ) {
  String ci = new String ( input . nextLine ( ) ) ;
  yoko = ci . substring ( 0 , ci . length ( ) - 1 ) ;
  yoko = yoko . substring ( 1 , yoko . length ( ) - 1 ) ;
  if ( i != 8 && i != 0 ) {
    sita . add ( 0 , ci ) ;
    yokosita . add ( 0 , yoko ) ;
  }
  c [ i ] = ci + yoko ;
}
for ( int i = 0 ;
i < 7 ;
i ++ ) {
  String bf = sita . get ( i ) + yokosita . get ( i ) ;
  c [ i ] [ 0 ] = bf ;
}
HashMap < String , Integer > sousax = new HashMap < String , Integer > ( ) ;
sousax . put ( "R" , 1 ) ;
sousax . put ( "L" , - 1 ) ;
sousax . put ( "U" , 0 ) ;
sousax . put ( "D" , 0 ) ;
sousax . put ( "RU" , 1 ) ;
sousax . put ( "RD" , 1 ) ;
sousax . put ( "LU" , - 1 ) ;
sousay . put ( "LD" , - 1 ) ;
String ans = "" ;
x -- ;
y -- ;
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  ans += c [ y ] [ x ] ;
  x += sousax . get ( W ) ;
  y += sousay . get ( W ) ;
}
System . out . println ( ans ) ;
return c ;
}
