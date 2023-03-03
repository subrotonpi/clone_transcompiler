static final String getOpString ( ) {
  final Function < String , String > getline = f -> f . nextLine ( ) . trim ( ) ;
  final Function < String , String > gettoken = f -> StringUtil . split ( getline . apply ( f ) , " " ) ;
  final Function < String , Integer > getInt = f -> Integer . parseInt ( getline . apply ( f ) ) ;
  final Function < List < Integer > , Integer > getints = f -> ContainerUtil . map ( getints , Integer :: parseInt ) ;
  final Function < List < Integer > , Integer > product = l -> l . stream ( ) . flatMap ( l -> l . stream ( ) . map ( x -> x * y ) . count ( ) ) . findFirst ( ) . orElse ( 1 ) ;
  final Function < List < Integer > , Integer > factorial = n -> product . apply ( xrange ( n , 1 , - 1 ) ) ;
  final Function < List < Integer > , Integer > nPr = n -> product . apply ( xrange ( n , n - r , - 1 ) ) ;
  final Function < List < Integer > , Integer > nCr = n -> product . apply ( xrange ( n , n - r , - 1 ) ) ;
  final Function < List < Integer > , Integer > nMr = n -> factorial . apply ( Iterables . size ( l ) ) . apply ( factorial ) ;
  final Function < List < Integer > , Integer > gcd = y -> gcd . apply ( y , x -> x % y ) != 0 ? x : y ;
  final Function < List < Integer > , Integer > lcm = x -> x * y / gcd . apply ( x , y ) ;
  {
    final List < Integer > cross = x -> x * y ;
    final List < Integer > add = x -> x * y ;
    final List < Integer > sub = x -> x ;
    final Function < List < Integer > , Integer > scale = x -> x * s ;
    final List < Integer > neg = x -> x < 0 ? 1 : x ;
    final List < Integer > mul = x -> x < 0 ? 1 : x ;
    final List < Integer > dot = x -> sum ( mul . apply ( x ) ) ;
    final List < Integer > norm2 = x -> dot . add ( x ) ;
    final List < Integer > dist = x -> x * dist . add ( x ) ;
    final List < Integer > dist2 = x -> norm2 . add ( x ) ;
    