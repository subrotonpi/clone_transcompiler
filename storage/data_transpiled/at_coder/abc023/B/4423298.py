def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.po = sys.stdin.readline ( ).strip ( )
        if self.n % 2 == 0 :
            print ( - 1 )
        else :
            s = 'b'
            count = 1
            while len ( s ) < n :
                s = ( 'b' + s + 'b' if count % 3 == 0 else ( 'a' + s + 'c' if count % 3 == 1 else 'c' + s + 'a' ) )
                count += 1
            print ( len ( s ) / 2 if s == po else - 1 )
