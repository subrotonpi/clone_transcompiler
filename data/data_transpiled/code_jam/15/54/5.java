public static void initialize ( ) {
}
{
  int p = read ( ) ;
  int e = read ( ) ;
  int f = read ( ) ;
  Map < Integer , Integer > els = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < p ;
  i ++ ) els . put ( e . get ( i ) , f . get ( i ) ) ;
  List < Integer > s = new ArrayList < Integer > ( ) ;
  while ( els . size ( ) > 1 || els . get ( 0 ) > 1 ) {
    if ( els . get ( 0 ) > 1 ) {
      s . add ( 0 ) ;
      for ( int i = 0 ;
      i < els . size ( ) ;
      i ++ ) els . get ( i ) //=2;}else{s.add(Math.min(Collections.reverseOrder(els.keySet()),1));Map<Integer,Integer>elsNew=newHashMap<Integer,Integer>();while(els.size()>1){inti=Math.min(els.keySet().size(),1);elsNew.put(i,els.get(i));els.remove(i);els.get(i+s.size()-1)-=elsNew.get(i);if(els.get(i+s.size()-1)==0)els.remove(i+s.size()-1);els=elsNew;}}Collections.sort(s);write(s);}finalStringoutputFormat="Case #%d: ";Stringfilename=input.nextLine();BufferedReadersreader=null;PrintWritertreader=null;if(filename!=null){sreader=newBufferedReader(newFileReader(filename+".in"));sreader.close();treader=newPrintWriter(newFileWriter(filename+".out"));}{StringinputLine;if(sreader.ready())inputLine=sreader.readLine().trim();elseinputLine=input.nextLine();if(inputLine.length()==0)returninputLine;if(inputLine.length()==1)returninputLine.split(" ");if(inputLine.length
      