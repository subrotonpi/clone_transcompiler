@ Test public static void infilecode ( ) throws IOException {
  final HashMap < String , Integer > mapping = new HashMap < > ( ) ;
  mapping . put ( "A" , "A" ) ;
  mapping . put ( "B" , "B" ) ;
  mapping . put ( "C" , "C" ) ;
  mapping . put ( "D" , "D" ) ;
  mapping . put ( "E" , "E" ) ;
  mapping . put ( "X" , "example" ) ;
  mapping . put ( "S" , "-small" ) ;
  mapping . put ( "L" , "-large" ) ;
  mapping . put ( "P" , "-practice" ) ;
  mapping . put ( "0" , "-attempt0" ) ;
  mapping . put ( "1" , "-attempt1" ) ;
  mapping . put ( "2" , "-attempt2" ) ;
  mapping . put ( "z" , "-1" ) ;
  mapping . put ( "Z" , "-2" ) ;
  mapping . put ( "I" , ".in" ) ;
  String infile = "" + mapping . get ( infilecode ) ;
  String outfile = infile . replace ( ".in" , "" ) + ".out.txt" ;
  System . setIn ( new FileInputStream ( infile ) ) ;
  PrintWriter output = new PrintWriter ( new BufferedWriter ( new FileWriter ( outfile ) ) ) ;
  int T = Integer . parseInt ( input . readLine ( ) ) ;
  /* Manhattan */
  int n = Math . max ( Math . abs ( a [ 0 ] - n ) , Math . abs ( a [ 1 ] - n ) ) ;
  /* Manhattandiag */
  int c = Math . abs ( a [ 0 ] - n ) + Math . abs ( a [ 1 ] - n ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    int N = Integer . parseInt ( input . readLine ( ) ) ;
    int M = Integer . parseInt ( input . readLine ( ) ) ;
    System . out . println ( N + M ) ;
    int n = ( N - 1 ) / 2 ;
    int [ ] order = new int [ M ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      order [ j ] = order [ j ] ;
    }
    grid . put ( "." , order ) ;
    bishops = new ArrayList < > ( ) ;
    rooks = new