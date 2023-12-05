def import re
class Main ( object ) :
    def __init__ ( self , S ) :
        self.S = S
    def __call__ ( self , * args ) :
        return re.match ( '^.*i.*c.*t.*$' , S.lower ( ) )
