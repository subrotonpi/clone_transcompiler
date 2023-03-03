static final double [ ] [ ] solve ( ) throws IOException {
  final BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final BufferedWriter fout = new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ;
  final int l = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase < l ;
  testCase ++ ) {
    final int N = Integer . parseInt ( fin . readLine ( ) ) ;
    double px = 0.0 , py = 0.0 , pz = 0.0 ;
    double vx = 0.0 , vy = 0.0 , vz = 0.0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final double ix = Double . parseDouble ( fin . readLine ( ) . trim ( ) ) ;
      final double iy = Double . parseDouble ( fin . readLine ( ) . trim ( ) ) ;
      final double iz = Double . parseDouble ( fin . readLine ( ) . trim ( ) ) ;
      final double ivx = Double . parseDouble ( fin . readLine ( ) . trim ( ) ) ;
      final double ivy = Double . parseDouble ( fin . readLine ( ) . trim ( ) ) ;
      final double ivz = Double . parseDouble ( fin . readLine ( ) . trim ( ) ) ;
      px += ix ;
      py += iy ;
      pz += iz ;
      vx += ivx ;
      vy += ivy ;
      vz += ivz ;
    }
    px /= N ;
    py /= N ;
    pz /= N ;
  }
  fin . close ( ) ;
  fout . close ( ) ;
  return solve ( ) ;
}
