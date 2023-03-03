def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( sys.stdin.read ( ) )
    count = 0
    button = 1
    b = [ ]
    while 1 :
        b.append ( 1 )
        button = a [ button - 1 ]
        count += 1
        if button == 2 :
            print ( count )
            break
        if b [ button - 1 ] == 1 :
            print ( - 1 )
            break
