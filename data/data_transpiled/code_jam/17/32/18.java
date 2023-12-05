public static int task ( ) {
  int ac = Integer . parseInt ( input . readLine ( ) ) ;
  int aj = Integer . parseInt ( input . readLine ( ) ) ;
  List < TimeInfo > times = new ArrayList < > ( ) ;
  int [ ] used = {
    0 , 0 }
    ;
    for ( int i = 0 ;
    i < ac ;
    i ++ ) {
      int c = Integer . parseInt ( input . readLine ( ) ) ;
      int d = Integer . parseInt ( input . readLine ( ) ) ;
      times . add ( new TimeInfo ( c , 1 , 0 ) ) ;
      times . add ( new TimeInfo ( d , 0 , 0 ) ) ;
      used [ 0 ] += d - c ;
    }
    for ( int i = 0 ;
    i < aj ;
    i ++ ) {
      int c = Integer . parseInt ( input . readLine ( ) ) ;
      int d = Integer . parseInt ( input . readLine ( ) ) ;
      times . add ( new TimeInfo ( c , 1 , 1 ) ) ;
      times . add ( new TimeInfo ( d , 0 , 1 ) ) ;
      used [ 1 ] += d - c ;
    }
    List < TimeInfo > sorted = new ArrayList < > ( ) ;
    times . sort ( ) ;
    TimeInfo lastTime = sorted . get ( times . size ( ) - 1 ) ;
    boolean lastIsStart = sorted . get ( times . size ( ) - 1 ) ;
    int lastWho = sorted . get ( times . size ( ) - 1 ) ;
    lastTime -= 24 * 60 ;
    wiggleRoom = 0 ;
    int neededEdges = 0 ;
    List < TimeInfo > elim = new ArrayList < > ( ) ;
    Iterator < TimeInfo > iter = sorted . iterator ( ) ;
    while ( iter . hasNext ( ) ) {
      TimeInfo time = iter . next ( ) ;
      boolean isStart = iter . hasNext ( ) ;
      int who = iter . next ( ) . getWho ( ) ;
      if ( isStart ) {
        if ( who != lastWho ) {
          wiggleRoom += time . getTime ( ) - lastTime ;
          neededEdges ++ ;
        }
        else {
          elim . add ( new TimeInfo ( time . getTime ( ) - lastTime , who ) ) ;
        }
      }
      lastTime = time ;
      lastIsStart = isStart ;
      lastWho = who ;
    }
    sorted . sort ( elim ) ;
    for ( int length : elim ) {
      int who = elim . get ( length - 1 ) ;
      if ( used [ who