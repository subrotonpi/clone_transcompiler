public static void initialize ( ) {
}
{
  int n = read ( ) ;
  int k = read ( ) ;
  int [ ] s = read ( ) ;
  int [ ] mins = new int [ k ] ;
  int [ ] maxs = new int [ k ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int diff = 0 ;
    int j = i ;
    while ( j < n - k ) {
      diff += s [ j + 1 ] - s [ j ] ;
      if ( diff < - mins [ i ] ) mins [ i ] = - diff ;
      if ( diff > maxs [ i ] ) maxs [ i ] = diff ;
      j += k ;
    }
  }
  int sm = ( s [ 0 ] - sum ( mins ) ) % k ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) maxs [ i ] = maxs [ i ] + mins [ i ] ;
  int mx = max ( maxs ) ;
  int avail = sum ( maxs ) ;
  if ( sm > avail ) write ( mx + 1 ) ;
  else write ( mx ) ;
}
final String outputFormat = "Case #%d: " ;
String filename = input . nextLine ( ) . trim ( ) ;
BufferedReader sbr = null ;
PrintWriter tbr = null ;
if ( filename != "" ) {
  sbr = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
  sbr . close ( ) ;
  tbr = new PrintWriter ( new FileWriter ( filename + ".out" ) ) ;
}
{
  String inputLine ;
  if ( sbr != null ) {
    inputLine = sbr . readLine ( ) . trim ( ) ;
  }
  else {
    inputLine = input . nextLine ( ) . trim ( ) ;
  }
  if ( mode == 0 ) return inputLine ;
  if ( mode == 1 ) return inputLine . split ( " " ) ;
  if ( mode == 2 ) return new LinkedList < Integer > ( Arrays . asList ( inputLine . split ( " " ) ) ) ;
}
{
  String s ;
  if ( outputFormat . equals ( "Case #%d" ) ) {
    solve ( ) ;
  }
  else {
    initialize ( ) ;
    int totalCases = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int caseNumber = 1 ;
    caseNumber <= totalCases ;
    caseNumber ++ ) {
      write ( outputFormat . replace ( "%d" , String . valueOf ( caseNumber ) ) ) ;
      solve ( ) ;
      write