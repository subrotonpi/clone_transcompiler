// This method is called from the main thread to start the code in and stop the code in it.
private static String filepath = "" ;
String fileprefix = "C-large" ;
String filepathname = filepath + fileprefix ;
String infilename = filepathname + ".in" ;
String outfilename = filepathname + ".out" ;
String [ ] lines = FileUtil . readFileToString ( new File ( infilename ) ) . split ( "\n" ) ;
PrintWriter out = new PrintWriter ( outfilename ) ;
int cases = Integer . parseInt ( lines [ 0 ] ) ;
int linenum = 1 ;
{
  String fsen = "" ;
  String search = "welcome to code jam" ;
  int slen = search . length ( ) ;
  for ( int i = 0 ;
  i < slen ;
  i ++ ) {
    char c = sentence [ i ] ;
    if ( c == 'welcome to code jam' ) fsen += c ;
  }
  int [ ] last = new int [ slen ] ;
  for ( int i = 0 ;
  i < slen ;
  i ++ ) {
    last [ i ] = 0 ;
  }
  for ( char c : fsen . toCharArray ( ) ) {
    int [ ] next = last . clone ( ) ;
    for ( int i = 0 ;
    i < slen ;
    i ++ ) {
      char schar = search . charAt ( i ) ;
      if ( c == schar ) {
        if ( i == 0 ) next [ i ] ++ ;
        else next [ i ] += last [ i - 1 ] ;
      }
    }
    last = next ;
  }
  return String . format ( "%04d" , last [ slen - 1 ] % 10000 ) ;
}
for ( int casenum = 1 ;
casenum <= cases ;
casenum ++ ) {
  String out = solve ( lines [ casenum ] ) ;
  String casestr = "Case #" + casenum + ": " + out ;
  System . out . println ( casestr ) ;
  out . println ( casestr ) ;
  out . println ( casestr ) ;
}
return out ;
}
