@ File ( file = "B-large" ) public static String file = "B-large" ;
BufferedReader fin = new BufferedReader ( new FileReader ( file + ".in" ) ) ;
PrintWriter fout = new PrintWriter ( file + ".out" ) ;
int num_cases = Integer . parseInt ( fin . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
for ( int i = 1 ;
i <= num_cases ;
i ++ ) {
  String result = process ( ) ;
  fout . printf ( "Case #%d: %s\n" , i , result ) ;
}
fin . close ( ) ;
fout . close ( ) ;
int [ ] positions = new int [ num_cases ] ;
for ( int i = 0 ;
i <= n ;
i ++ ) {
  String l = fin . readLine ( ) . replaceAll ( "\\s+" , "" ) ;
  if ( l . equals ( letter ) ) positions [ i ] = i ;
}
/* algorithm */
{
  int n = ( Integer ) Integer . parseInt ( fin . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
  int m = ( Integer ) Integer . parseInt ( fin . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
  String [ ] dictionary = new String [ n ] ;
  String [ ] guessList = new String [ m ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) dictionary [ i ] = fin . readLine ( ) . replaceAll ( "\\s+" , "" ) ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) guessList [ i ] = fin . readLine ( ) . replaceAll ( "\\s+" , "" ) ;
  HashMap < String , HashMap < String , HashSet < String >>> index = new HashMap < String , HashMap < String , HashSet < String >>> ( ) ;
  for ( String letter : "-abcdefghijklmnopqrstuvwxyz" ) {
    HashMap < String , HashSet < String >> alphaDic = new HashMap < String , HashSet < String >> ( ) ;
    for ( String word : dictionary ) {
      int position = searchPosition ( letter , word ) ;
      if ( alphaDic . containsKey ( position ) ) {
        alphaDic . get ( position ) . add ( word ) ;
      }
      else {
        alphaDic . put ( position , new HashSet < String > ( Arrays . asList ( word ) ) ) ;
      }
    }
    index . put ( letter , alphaDic )