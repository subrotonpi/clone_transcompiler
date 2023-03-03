def import re
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
    def main ( self ) :
        print ( re.match ( '^.*i.*c.*t.*$' , 'YES' if re.match ( '^.*i.*c.*t.*$' , 'NO' ) else 'NO' ) )
