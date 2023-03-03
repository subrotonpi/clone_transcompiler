public static int getBase ( List < String > digits ) throws IOException {
  return Sets . newHashSet ( String . valueOf ( digits ) ) . size ( ) ;
  /* min second */
  int len = digits . size ( ) ;
  List < String > newDigits = new LinkedList < String > ( ) ;
  int count = 1 ;
  Map < String , String > letter2digit = new HashMap < String , String > ( ) ;
  String tmp = digits . remove ( 0 ) ;
  letter2digit . put ( tmp , String . valueOf ( count ) ) ;
  count = 0 ;
  newDigits . add ( letter2digit . get ( tmp ) ) ;
  while ( len -- > 0 ) {
    tmp = digits . remove ( 0 ) ;
    if ( letter2digit . containsKey ( tmp ) ) {
      newDigits . add ( letter2digit . get ( tmp ) ) ;
    }
    else {
      if ( count == 0 ) {
        letter2digit . put ( tmp , String . valueOf ( count ) ) ;
        newDigits . add ( letter2digit . get ( tmp ) ) ;
        count = 2 ;
      }
      else {
        letter2digit . put ( tmp , String . valueOf ( count ) ) ;
        newDigits . add ( letter2digit . get ( tmp ) ) ;
        count ++ ;
      }
    }
  }
  int newDigits = Integer . parseInt ( newDigits . toString ( ) ) ;
  int second = calBase ( newDigits , count ) ;
  /* calBase */
  if ( base <= 1 ) {
    base = 2 ;
  }
  LinkedList < String > list = new LinkedList < String > ( ) ;
  int count = 0 ;
  int res = 0 ;
  while ( list . size ( ) > 0 ) {
    int t = Integer . parseInt ( list . removeFirst ( ) ) ;
    res += t * base * count ;
    count ++ ;
  }
  /* main */
  BufferedReader inputStream = new BufferedReader ( new FileReader ( file ) ) ;
  String line ;
  int testCase = 1 ;
  BufferedWriter wfile = new BufferedWriter ( new FileWriter ( result ) ) ;
  while ( ( line = inputStream . readLine ( ) ) != null ) {
    String d = line . trim ( ) ;
    int n = minSecond ( d ) ;
    wfile . write ( "Case #" + testCase + ": " + n ) ;
    testCase ++ ;
    System . out . println ( line ) ;
  }
  /* main */
  if ( Class . forName ( "org.jna.Main" ) . getMethod ( "main" , new Class [ ] {
    String [ ]