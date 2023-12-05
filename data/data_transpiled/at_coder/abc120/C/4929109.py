def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.S = sys.stdin.read ( )
    def main ( self ) :
        self.S = sys.stdin.read ( )
        a = b = 0
        for i in S :
            if i.startswith ( '1' , i ) :
                a += 1
            else :
                b += 1
        print ( 2 * min ( a , b ) )
