public static void main ( String [ ] args ) throws IOException {
  final String cipher = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv" ;
  final String plain = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up" ;
  final HashMap < String , String > trans = new HashMap < String , String > ( ) ;
  trans . put ( "q" , "z" ) ;
  trans . put ( "z" , "q" ) ;
  for ( int i : xrange ( cipher . length ( ) ) ) {
    if ( ! trans . containsKey ( cipher . charAt ( i ) ) ) {
      trans . put ( cipher . charAt ( i ) , plain . charAt ( i ) ) ;
    }
  }
}
