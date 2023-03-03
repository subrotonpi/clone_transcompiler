static final String solve ( ) throws IOException {
  final BufferedReader fin = null ;
  final String s = "" ;
  final String s = "" ;
  final String s = "" ;
  final Scanner scan = new Scanner ( s ) ;
  final int n = nums ( ) ;
  final int l = nums ( ) ;
  final String good = strs ( ) ;
  final String bad = sstrip ( ) ;
  if ( good . contains ( "1" * l ) ) return "IMPOSSIBLE" ;
  if ( l == 1 ) return "0 ?" ;
  return String . format ( "0%s?%s %s" , "10" * l , "1" * ( l - 1 ) , "?" * ( l - 1 ) ) ;
  /* main program */
  String fname = "test.in" ;
  if ( args . length > 0 ) fname = args [ 0 ] ;
  fin = new BufferedReader ( new FileReader ( fname ) ) ;
  fout = new PrintWriter ( new FileOutputStream ( fname + ".out" ) ) ;
  final Date t0 = new Date ( ) ;
  final int t = Integer . parseInt ( scan . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    fout . printf ( "Case #%d: " , i + 1 ) ;
    fout . printf ( s ) ;
  }
  System . out . println ( "Time = %s" , new Date ( ) . getTime ( ) - t0 . getTime ( ) ) ;
  fin . close ( ) ;
  fout . close ( ) ;
  /* nums */
  final int [ ] nums = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) nums [ i ] = Integer . parseInt ( scan . nextLine ( ) ) ;
  /* fnums */
  final double [ ] fnums = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) fnums [ i ] = Double . parseDouble ( scan . nextLine ( ) ) ;
  /* num */
  final int num = Integer . parseInt ( scan . nextLine ( ) ) ;
  /* sstrip */
  final String sstrip = scan . nextLine ( ) . trim ( ) ;
  /* strs */
  for ( int i = 0 ;
  i < n ;
  i ++ ) strs [ i ] = scan . nextLine ( ) ;
  /* arrstr */
  final String sep = s + " " ;
  if ( Class . isCompatible ( )