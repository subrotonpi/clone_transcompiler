static final String solve ( ) throws IOException {
  final String [ ] args = new String [ ] {
    "" , "" , "" , "" }
    ;
    if ( args . length != 2 ) {
      System . out . println ( "specify input file" ) ;
      exit ( ) ;
    }
    final long startTime = System . nanoTime ( ) ;
    for ( int caseNo = 0 ;
    caseNo < numCases ;
    caseNo ++ ) {
      System . out . println ( '\b' + ( caseNo * 100 ) + ":" ) ;
      System . out . println ( 'Case #"+(caseNo+1)+":");solve();}fin.close();fout.close();System.out.println(' \ b '+(System.nanoTime()-startTime)+":");classParser{Strings;inti;{super();}publicvoidskipWS(){while(i<s.length()&&Character.isWhitespace(s.charAt(i)))i++;}publicStringreadItem(){skipWS();StringBufferresult=newStringBuffer();while(!"() \t\n".equals(s.substring(0,i))){result.append(s.charAt(i));i++;}returnresult.toString();}publicStringq(){returns.substring(0,i)+"***"+s.substring(i);}publicObjectreadTree(){skipWS();asserts.charAt(i)==' ( ':q();i++;doubleprob=readItem();prob=Double.parseDouble(prob);skipWS();if(s.charAt(i)==' ) '){i++;returnnewDouble(prob);}else{Stringqual=readItem();Stringleft=readTree();Stringright=readTree();skipWS();asserts.charAt(i)==' ) ' : q ( ) ; i ++ ; return new Double ( prob ) ; } } } { int L = Integer . parseInt ( ( String ) args [ 0 ] ) ; String tree = new String ( islice ( fin , L ) ) ; Parser tree = new Parser ( tree ) . readTree ( ) ;