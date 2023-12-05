;
List < String > data = Arrays . asList ( l . split ( " " ) ) ;
List < String > out = new ArrayList < String > ( ) ;
try {
  for ( String l : IOUtils . readLines ( new FileInputStream ( "infile" ) ) ) {
    out . add ( l . trim ( ) ) ;
  }
}
catch ( IOException e ) {
  e . printStackTrace ( ) ;
}
out . add ( "outfile" ) ;
int ncases = Integer . parseInt ( data . remove ( 0 ) ) ;
for ( int testCase = 0 ;
testCase < ncases ;
testCase ++ ) {
  int numelements = Integer . parseInt ( data . remove ( 0 ) ) ;
  int [ ] elements = new int [ numelements ] ;
  for ( String s : data . remove ( 0 ) . split ( "\\s+" ) ) {
    elements [ numelements ] = Integer . parseInt ( s ) ;
  }
  int inwrongplace = 0 ;
  for ( int i = 0 ;
  i < elements . length ;
  i ++ ) {
    if ( elements [ i ] != i + 1 ) {
      inwrongplace ++ ;
    }
  }
  out . add ( "Case #" + ( testCase + 1 ) + ": " + String . format ( "%.6f" , inwrongplace ) ) ;
}
return out ;
}
