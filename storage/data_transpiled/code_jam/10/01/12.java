static final String getStrings ( ) throws IOException {
  String getline = f -> f . nextLine ( ) . trim ( ) ;
  String gettoken = f -> f . split ( "\\s+" ) ;
  int getInt = f -> Integer . parseInt ( getline ) ;
  int getInts = f -> Integer . parseInt ( getline ) ;
  Function < List < Integer > , Integer > product = l -> l > 0 ? Stream . of ( l ) : 1 ;
  Function < List < Integer > , Integer > factorial = n -> product . apply ( xrange ( n , 1 , - 1 ) ) ;
  Function < List < Integer > , Integer > nPr = n -> product . apply ( xrange ( n , n - r , - 1 ) ) ;
  Function < List < Integer > , Integer > nCr = n -> nPr . apply ( n , r ) / factorial . apply ( r ) ;
  Function < List < Integer > , Integer > nMr = l -> factorial . apply ( Ints . asList ( l ) ) / product . apply ( map ( factorial , l ) ) ;
  Function < List < Integer > , Integer > gcd = ( List < Integer > ) l -> gcd . apply ( y , x -> x % y ) ;
  Function < List < Integer > , Integer > lcm = ( List < Integer > ) l -> x * y / gcd . apply ( x , y ) ;
  {
    if ( b == 0 ) return ( a == 1 ) ? ( a == 0 ) ? ( a == 1 ) ? ( a == 0 ) ? ( a == 1 ) ? ( a == 0 ) ? ( a == 1 ) ? ( a == 1 ) ? ( a == 0 ) ? ( a == 1 ) ? ( a == 0 ) ? ( a == 1 ) ? ( a == 0 ) ? ( a == 1 ) ? ( a == 0 ) ? ( a == 1 ) ? ( a == 0 ) ? ( a == 0 ) ? ( a == 1 ) ? ( a == 0 ) ? ( a == 0 ) ? ( a == 0 ) ? ( a == 0 ) ? ( a - a / b ) * ( a == 0 ) ? ( a == 0 ) ? ( a == 0 ) ? ( a ) : a ;
    return ( a == 0 ) ? ( a == 1 ) ? ( a == 0 ) ? ( a == 0 ) ? ( a - 1 ) : ( a == 0 ) ? ( a == 0 ) ? ( a )