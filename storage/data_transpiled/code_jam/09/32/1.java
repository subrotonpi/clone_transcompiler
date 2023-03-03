static final double [ ] [ ] b ( ) throws IOException {
  BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  /* size = Math.sqrt(v[0]*v[0]+v[1]*v[1]+v[2]*v[2]); */
  double [ ] [ ] cross ;
  double [ ] [ ] vector = new double [ T ] [ ] ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    int N = Integer . parseInt ( fin . readLine ( ) ) ;
    double px = 0.0 ;
    double py = 0.0 ;
    double pz = 0.0 ;
    double vx = 0.0 ;
    double vy = 0.0 ;
    double vz = 0.0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int x = Integer . parseInt ( fin . readLine ( ) ) ;
      int y = Integer . parseInt ( fin . readLine ( ) ) ;
      int z = Integer . parseInt ( fin . readLine ( ) ) ;
      int xx = Integer . parseInt ( fin . readLine ( ) ) ;
      int yy = Integer . parseInt ( fin . readLine ( ) ) ;
      int zz = Integer . parseInt ( fin . readLine ( ) ) ;
      px += x ;
      py += y ;
      pz += z ;
      vx += xx ;
      vy += yy ;
      vz += zz ;
    }
    px /= N ;
    py /= N ;
    pz /= N ;
    vx /= N ;
    vy /= N ;
    vz /= N ;
    double dotp = - ( px * vx + py * vy + pz * vz ) ;
    double bs = size ( new Vector [ ] {
      vx , vy , vz }
      ) ;
      double time ;
      if ( bs == 0 ) {
        time = - 1 ;
      }
      else {
        double dist = dotp / bs ;
        cross = new Vector [ ] {
          vx / bs * dist + px , vy / bs * dist + py , vz / bs * dist + pz }
          ;
          time = dist / bs ;
        }
        if ( time < 0 ) {
          time = 0 ;
          cross = new Vector [ ] {
            px , py , pz }
            ;
          }
          System . out . println ( "Case #" + ( i + 1 ) + ": " + size ( cross ) + " " + time ) ;
        }
        return cross ;
      }
      