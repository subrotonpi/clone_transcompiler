@ GwtIncompatible ( "java.util.Scanner" ) public static void main ( String [ ] args ) throws IOException {
  Scanner fin = new Scanner ( new File ( "large.in" ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "large.out" ) ) ) ;
  int tn = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int test = 0 ;
  test < tn ;
  test ++ ) {
    String l , p , c ;
    l = Integer . parseInt ( fin . nextLine ( ) ) ;
    p = Integer . parseInt ( fin . nextLine ( ) ) ;
    c = Integer . parseInt ( fin . nextLine ( ) ) ;
    c = Integer . parseInt ( fin . nextLine ( ) ) ;
    float temp1 = log ( 1.0f * p / l ) / log ( c ) ;
    int ans = ( int ) ceil ( log ( temp1 ) / log ( 2 ) ) ;
    if ( ans <= 0 ) ans = 0 ;
    fout . println ( "Case #" + ( test + 1 ) + ": " + ans ) ;
  }
  fin . close ( ) ;
  fout . close ( ) ;
}
