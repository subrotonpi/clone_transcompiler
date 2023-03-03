static final String getSector ( ) {
  Function < String , String > getline = f -> f . nextLine ( ) . trim ( ) ;
  Function < String , String > gettoken = f -> StringUtil . split ( getline . apply ( f ) , " " ) ;
  Function < Integer , Integer > getInt = f -> Integer . parseInt ( getline . apply ( f ) ) ;
  Function < Float , Float > getflo = f -> Float . parseFloat ( getline . apply ( f ) ) ;
  Function < Float , Float > getflos = f -> Float . parseFloat ( getline . apply ( f ) ) ;
  Function < Integer , Float > product = f -> f -> Stream . of ( f ) . map ( f -> f ) . collect ( Collectors . toList ( ) ) ;
  Function < Integer , Float > nPr = f -> f -> f . length ( ) > f . length ( ) ? f . length ( ) : f . length ( ) ;
  Function < Integer , Float > nCr = f -> f . length ( ) > f . length ( ) ? f . length ( ) : f . length ( ) ;
  Function < Integer , Float > nMr = f -> f . length ( ) > f . length ( ) ? f . length ( ) : f . length ( ) ;
  Function < Integer , Float > gcd = f -> f . length ( ) > f . length ( ) ? f . length ( ) : f . length ( ) ;
  Function < Integer , Float > lcm = f -> f . length ( ) > f . length ( ) ? f . length ( ) : f . length ( ) ;
  final Function < Integer , Float > add = f -> f . apply ( Math . pow ( f . length ( ) , 2 ) ) ;
  Function < Integer , Float > sub = f -> f . apply ( Math . pow ( f . length ( ) , 2 ) ) ;
  Function < Integer , Float > scalev = f -> f . apply ( Math . pow ( f . length ( ) , 2 ) ) . apply ( Math . pow ( f . length ( ) , 2 ) ) . apply ( Math . pow ( f . length ( ) , 2 ) ) . apply ( Math . pow ( f . length ( ) , 2 ) ) . apply ( Math . pow ( f . length ( ) , 2 ) ) . apply ( Math . pow ( f . length ( ) , 2 ) ) . apply ( Math . pow ( f