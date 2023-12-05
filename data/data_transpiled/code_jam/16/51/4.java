public static void initializeSolver ( ) {
}
{
  String s = read ( false , String . class ) ;
  int c1 = 0 ;
  int c2 = 0 ;
  int j1 = 0 ;
  int j2 = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      if ( s . charAt ( i ) == 'C' ) c1 ++ ;
      else j1 ++ ;
    }
    else {
      if ( s . charAt ( i ) == 'C' ) c2 ++ ;
      else j2 ++ ;
    }
  }
  return 10 * ( Math . min ( c1 , c2 ) + Math . min ( j1 , j2 ) ) + 5 * Math . abs ( c1 - c2 ) ;
}
final String outputFormat = "Case #%d: " ;
String filename = input . nextLine ( ) . trim ( ) ;
BufferedReader sreader = null ;
PrintWriter twriter = null ;
if ( filename != "" ) {
  sreader = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
  sreader . mark ( 0 ) ;
  twriter = new PrintWriter ( new FileWriter ( filename + ".out" ) ) ;
}
{
  String inputLine ;
  if ( sreader . ready ( ) ) {
    inputLine = sreader . readLine ( ) . trim ( ) ;
  }
  else {
    inputLine = input . nextLine ( ) . trim ( ) ;
  }
  if ( split ) {
    return Lists . newArrayList ( ) ;
  }
  else {
    return rettype ( inputLine ) ;
  }
}
public void write ( StringBuilder sb ) {
  if ( sb == null ) sb = "" ;
  if ( sb . length ( ) == 0 ) sb = new StringBuilder ( ) ;
  sb . append ( " " ) ;
  String s = sb . toString ( ) ;
  if ( twriter != null ) twriter . println ( s ) ;
  else System . out . print ( s ) ;
}
}
