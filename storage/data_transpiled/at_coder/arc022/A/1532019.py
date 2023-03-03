def import re
class Main ( object ) :
    def __init__ ( self , name ) :
        sc = raw_input ( name )
        print ( re.match ( '^.*i.*c.*t.*$' , sc.lower ( ) ) and 'YES' or 'NO' )
