@ OutputFunction ( "output" ) public static String outfile = "output.txt" ;
/* pop input */
int popinput ( ) throws IOException {
  return Integer . parseInt ( input . readLine ( ) . split ( " " ) [ 0 ] ) ;
}
