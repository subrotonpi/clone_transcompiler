def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.dict = { }
        for i in range ( n ) :
            a = sys.stdin.read ( )
            if a in self.dict :
                self.dict [ a ] = not self.dict [ a ]
            else :
                self.dict [ a ] = True
        ans = 0
        for key in self.dict :
            ans += 1 if self.dict [ key ] else 0
        print ( ans )
