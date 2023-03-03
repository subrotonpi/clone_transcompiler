static final int T = Integer . parseInt ( Scanner . nextLine ( ) ) ;
File fin = new File ( "C.data" ) ;
Map < String , Map < Integer , Integer >> data = new HashMap < String , Map < Integer , Integer >> ( ) ;
Map < Integer , Integer > prob = new HashMap < Integer , Integer > ( ) ;
String line ;
try {
  BufferedReader br = new BufferedReader ( new FileReader ( fin ) ) ;
  while ( ( line = br . readLine ( ) ) != null ) {
    int [ ] fields = ArrayUtil . split ( line . split ( " " ) ) ;
    Map < Integer , Integer > m = new HashMap < Integer , Integer > ( ) ;
    for ( int j : xrange ( 2 , fields . length , 2 ) ) {
      m . put ( fields [ j ] , fields [ j + 1 ] ) ;
    }
    data . put ( fields [ 0 ] , m ) ;
    prob . put ( fields [ 0 ] , fields [ 1 ] ) ;
  }
}
catch ( Exception e ) {
  e . printStackTrace ( ) ;
}
return T ;
}
