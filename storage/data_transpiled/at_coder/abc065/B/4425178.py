def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.po = [ ]
        self.b = False
        for i in range ( self.n ) :
            self.po.append ( i )
        num = 0
        i = 0
        for i in range ( self.n ) :
            num = self.po [ num ] - 1
            if num == 1 :
                b = True
                break
        print ( i + 1 if b else - 1 )
