static final String getStrings ( ) throws IOException {
  String getline = f -> f . nextLine ( ) . trim ( ) ;
  String gettoken = f -> f . split ( "\\s+" ) ;
  int getInt = f -> Integer . parseInt ( getline ) ;
  int getInts = f -> Integer . parseInt ( getline ) ;
  Function < List < Integer > , Integer > product = l -> l > 0 ? Stream . of ( l ) : 1 ;
  Function < List < Integer > , Integer > factorial = n -> product . apply ( xrange ( n , 1 , - 1 ) ) ;
  Function < List < Integer > , Integer > nPr = n -> product . apply ( xrange ( n , n - r , - 1 ) ) ;
  Function < List < Integer > , Integer > nCr = n -> nPr . apply ( n , r ) / factorial . apply ( r ) ;
  Function < List < Integer > , Integer > nMr = l -> factorial . apply ( Ints . asList ( l ) ) / product . apply ( Ints . asList ( l ) ) ;
  Function < List < Integer > , Integer > gcd = x -> x != 0 ? gcd . apply ( x , x % y ) : x ;
  Function < List < Integer > , Integer > lcm = x -> x * y / gcd . apply ( x , y ) ;
  {
    if ( x == 0 ) return new ArrayList < > ( ) ;
    final List < Integer > d = gcd2 . apply ( x , x ) ;
    return d . add ( y ) . add ( x - a / b * y ) ;
  }
  ;
  if ( getClass ( ) . equals ( "java.util.zip.ZipScanner" ) ) {
    InputStream in = new FileInputStream ( sys . getPath ( ) ) ;
    Arrays . sort ( getStrings ( in ) ) ;
    for ( int cases : xrange ( 0 , N ) ) {
      long ans = 0 ;
      int R = getInts ( in ) ;
      int k = getInts ( in ) ;
      int G = getInts ( in ) ;
      int [ ] fs = new int [ G ] ;
      int b = new int [ G ] ;
      int i = 0 ;
      int j = 0 ;
      while ( ! b [ i ] ) {
        b [ i ] = j ;
        int empty = k ;
        int lol = i ;
        while ( empty > 0 && g [ i ] <= empty ) {
          empty -= g [ i ] ;
          i = ( i + 1 ) % G ;
          