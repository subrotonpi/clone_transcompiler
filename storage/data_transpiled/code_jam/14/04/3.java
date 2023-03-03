@ GwtIncompatible ( "java.util.Scanner" ) public static void main ( String [ ] args ) throws IOException {
  Scanner in = new Scanner ( new File ( "D.in" ) ) ;
  int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    System . out . println ( "Case #" + t + ":" ) ;
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    ArrayList < Integer > p1 = getBlocks ( in ) ;
    ArrayList < Integer > p2 = getBlocks ( in ) ;
    ArrayList < Integer > normalPoints = getNormalPoints ( new ArrayList < Integer > ( p1 ) , new ArrayList < Integer > ( p2 ) ) ;
    ArrayList < Integer > deceitfulPoints = getDeceitfulPoints ( new ArrayList < Integer > ( p1 ) , new ArrayList < Integer > ( p2 ) ) ;
    System . out . println ( deceitfulPoints + " " + normalPoints ) ;
  }
}
