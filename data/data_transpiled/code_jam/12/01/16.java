/**
* y qee
* ejp mysljylc kd kxveddknmc re jsicpdrysi
* rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
* de kr kd eoya kw aej tysr re ujdr lkgc jv
*/
public static String inPattern = "y qee" ;
String outPattern = "a zoo" ;
HashMap < String , String > map = new HashMap < String , String > ( ) ;
Iterator < String > i = inPattern . iterator ( ) ;
Iterator < String > j = outPattern . iterator ( ) ;
while ( i . hasNext ( ) ) {
  map . put ( i . next ( ) , j . next ( ) ) ;
}
final String [ ] strings = map . values ( ) ;
for ( String dest : strings ) {
  if ( ! map . values ( ) . contains ( dest ) ) {
    for ( String source : strings ) {
      if ( ! map . containsKey ( source ) ) {
        map . put ( source , dest ) ;
      }
    }
  }
}
int k = Integer . parseInt ( input ( ) ) ;
for ( int i = 0 ;
i < k ;
i ++ ) {
  String text = input ( ) ;
  System . out . println ( "Case #" + ( i + 1 ) + ": " + StringUtils . join ( map . get ( text ) , "" ) + "\n" ) ;
}
return text ;
}
