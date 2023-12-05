/*ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv
our language is impossible to understand
there are twenty six factorial possibilities
so it is okay if you want to just give up*/
public static String foo = "" "ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv
our language is impossible to understand
there are twenty six factorial possibilities
so it is okay if you want to just give up" "" . split ( "\n" ) ;
String [ ] bar = StringUtil . split ( foo , 0 , 3 ) ;
String [ ] baz = StringUtil . split ( foo , 3 , 3 ) ;
Map < String , String > m = new HashMap < String , String > ( ) ;
for ( int x = 0 ;
x < bar . length ;
x ++ ) {
  m . put ( bar [ x ] , baz [ x ] ) ;
}
m . put ( "q" , "z" ) ;
m . put ( "z" , "q" ) ;
Scanner ri = new Scanner ( System . in ) ;
int t = Integer . parseInt ( ri . nextLine ( ) ) ;
for ( int i = 0 ;
i < xrange ( t ) ;
i ++ ) {
  String in = ri . nextLine ( ) ;
  StringBuffer out = new StringBuffer ( ) ;
  for ( int l = 0 ;
  l < in . length ( ) ;
  l ++ ) {
    out . append ( m . get ( in . charAt ( l ) ) ) ;
  }
  System . out . format ( "Case #%d:" , ( i + 1 ) ) ;
  return out .