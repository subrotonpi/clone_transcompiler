@ Test public static String TEST = "large" ;
final String IN = "A-" + TEST + ".in" ;
final String OUT = "A-" + TEST + ".out" ;
/* Run the test with the specified number of digits */
if ( n == 0 ) return "INSOMNIA" ;
Set < Character > set = new HashSet < Character > ( ) ;
int i = 1 ;
while ( set . size ( ) < 10 ) {
  int x = n * i ;
  for ( char c : String . valueOf ( x ) . toCharArray ( ) ) {
    set . add ( c ) ;
  }
  i ++ ;
}
/* Run the test with the specified number of digits */
try {
  Scanner fin = new Scanner ( new File ( IN ) ) ;
  PrintWriter fout = new PrintWriter ( new FileOutputStream ( OUT ) ) ;
  int t = Integer . parseInt ( fin . nextLine ( ) . trim ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    int n = Integer . parseInt ( fin . nextLine ( ) . trim ( ) ) ;
    String res = run ( n ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + res ) ;
  }
}
catch ( FileNotFoundException e ) {
  e . printStackTrace ( ) ;
}
catch ( IOException e ) {
  e . printStackTrace ( ) ;
}
if ( __name__ . equals ( "main" ) ) {
  main ( ) ;
}
return "test" ;
}
