def import import sys , string , traceback ;
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.l = int ( sys.stdin.read ( ) )
        s = string.split ( s )
        st = [ 0 ]
        ret = 0
        for c in s :
            if c == '+' :
                st.append ( 0 )
                if len ( st ) > l :
                    st = [ ]
                    ret += 1
            else :
                st.pop ( )
        print ( ret )
