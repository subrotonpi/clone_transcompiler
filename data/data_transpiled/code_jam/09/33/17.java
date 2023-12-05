@ FileLocation ( "C.in" ) public static String fileIn = "C.in" ;
String fileout = "C.out" ;
HashMap < String , Integer > cache = new HashMap < String , Integer > ( ) ;
/* best of setsleft */
Set < Integer > todo = new HashSet < Integer > ( ) ;
if ( todo . isEmpty ( ) ) return sofar ;
String key = String . valueOf ( ( setsleft ) . size ( ) ) ;
if ( cache . containsKey ( key ) ) {
  return cache . get ( key ) ;
}
else {
  ArrayList < Integer > poss = new ArrayList < Integer > ( ) ;
  for ( Integer p : todo ) {
    List < Integer > his = new ArrayList < Integer > ( ) ;
    for ( Integer i : setsleft ) {
      if ( i . contains ( p ) ) {
        his . add ( i ) ;
      }
    }
    List < Integer > others = new ArrayList < Integer > ( ) ;
    for ( Integer i : setsleft ) {
      if ( ! ( i . contains ( p ) ) ) {
        others . add ( i ) ;
      }
    }
    int cost = his . size ( ) - 1 ;
    List < Integer > hislow = new ArrayList < Integer > ( ) ;
    for ( Integer i : his ) {
      if ( i < p ) {
        hislow . add ( i ) ;
      }
      List < Integer > hishigh = new ArrayList < Integer > ( ) ;
      for ( Integer i : his ) {
        if ( i > p ) {
          hishigh . add ( i ) ;
        }
      }
      List < Integer > otherstodo = new ArrayList < Integer > ( ) ;
      for ( Integer i : todo ) {
        if ( i != p ) {
          otherstodo . add ( i ) ;
        }
      }
      poss . add ( best ( others . toArray ( new Integer [ hislow . size ( ) ] ) , otherstodo , sofar + cost ) ) ;
    }
    Integer ans = Collections . min ( poss ) ;
    cache . put ( key , ans ) ;
    return ans ;
  }
  /* solve the first two */
  String datain = "2\n8 1\n3\n20 3\n3 6 14\n" ;
  BufferedReader datain = new BufferedReader ( new FileReader ( fileIn ) ) ;
  BufferedWriter dataout = new BufferedWriter ( new FileWriter ( fileout ) ) ;
  String [ ] data = datain . split ( " \n