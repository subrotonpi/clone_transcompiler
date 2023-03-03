def import re
class Main ( object ) :
    def __init__ ( self , S ) :
        self.S = S
        if re.match ( '^.*i.*c.*t.*$' , S.lower ( ) ) :
            print ( 'YES' )
        else :
            print ( 'NO' )
