static private final void cal ( List < String > list ) throws IOException {
  HashMap < Character , Integer > pos = new HashMap < > ( ) ;
  pos . put ( 'B' , 1 ) ;
  pos . put ( 'O' , 1 ) ;
  char robot = list . get ( 0 ) ;
  char button = list . get ( 1 ) ;
  char preRobot = robot ;
  int time = button - pos . get ( robot ) + 1 ;
  int preTime = time ;
  int totalTime = time ;
  pos . put ( robot , button ) ;
  for ( int i = 1 ;
  i < list . size ( ) ;
  i ++ ) {
    robot = list . get ( i ) ;
    button = list . get ( i ) ;
    time = Math . abs ( button - pos . get ( robot ) ) + 1 ;
    print ( robot , time , preTime , totalTime ) ;
    if ( robot != preRobot ) {
      if ( time > preTime ) {
        time -= preTime ;
        totalTime += time ;
        preTime = time ;
      }
      else {
        totalTime ++ ;
        preTime = 1 ;
      }
    }
    else {
      preTime += time ;
      totalTime += time ;
    }
    preRobot = robot ;
    pos . put ( robot , button ) ;
  }
  {
    File f = new File ( fileName ) ;
    FileWriter fw = new FileWriter ( f ) ;
    for ( int i = 0 ;
    i < results . size ( ) ;
    i ++ ) {
      fw . write ( "Case #" + ( i + 1 ) + ": " + results . get ( i ) + "\n" ) ;
    }
    fw . close ( ) ;
  }
  {
    File f = new File ( fileName ) ;
    List < String > inputs = new ArrayList < > ( ) ;
    int n = Integer . parseInt ( f . getAbsolutePath ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String l = f . getAbsolutePath ( ) ;
      inputs . add ( l ) ;
    }
  }
  if ( className . equals ( "java.util.jar" ) ) {
    List < String > inputs = rf ( args . get ( args . size ( ) - 1 ) ) ;
    List < String > results = new ArrayList < > ( ) ;
    for ( String ip : inputs ) {
      String [ ] array = ip . split ( " " ) ;
      int c = Integer . parseInt ( array [ 0 ] ) ;
      List < String > list = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i