public static String [ ] [ ] N = Integer . parseInt ( input ) {
  String [ ] W = input . split ( " " ) ;
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
  List < String [ ] > ans = new ArrayList < String [ ] > ( ) ;
  for ( String word : W ) {
    word = word . toLowerCase ( ) ;
    String tmp = "" ;
    for ( int i = 0 ;
    i < word . length ( ) ;
    i ++ ) {
      if ( ! dic . containsKey ( word ) ) {
        continue ;
      }
      tmp += dic . get ( word ) ;
    }
    ans . add ( tmp ) ;
  }
  return ans . toArray ( new String [ ans . size ( ) ] [ ] ) ;
}
