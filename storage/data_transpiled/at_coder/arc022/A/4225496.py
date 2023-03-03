def import re
class Main ( object ) :
    def __init__ ( self , name ) :
        sc = sys.stdin
        s = sc.readline ( ).upper ( )
        if re.match ( '.*I.*C.*T.*' , s ) :
            self.out = 'YES'
        else :
            self.out = 'NO'
