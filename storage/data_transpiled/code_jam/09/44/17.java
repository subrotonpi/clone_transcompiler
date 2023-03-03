public static void codejam ( final JassJavaMethod method ) throws IOException {
  final String basepath = "/home/ilya/workspace/codejam-java/" ;
  final String inputname = basepath + "input.txt" ;
  final String outputname = basepath + "output.txt" ;
  final BufferedReader fIn = new BufferedReader ( new FileReader ( inputname ) ) ;
  final BufferedWriter fOut = new BufferedWriter ( new FileWriter ( outputname ) ) ;
  final int ncases = Integer . parseInt ( fIn . readLine ( ) . replaceAll ( "\n" , "" ) ) ;
  for ( int testcase = 0 ;
  testcase < ncases ;
  testcase ++ ) {
    final int ans = method . invoke ( fIn , new Object [ ] {
    }
    ) ;
    fOut . write ( "Case #" + ( testcase + 1 ) + ": " ) ;
    fOut . write ( ans . toString ( ) ) ;
    fOut . newLine ( ) ;
    System . out . println ( "Case #" + ( testcase + 1 ) + ":" + ans ) ;
  }
  fOut . close ( ) ;
}
