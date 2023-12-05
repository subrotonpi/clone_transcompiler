def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.readline ( ).strip ( )
        self.M = sys.stdin.readline ( ).strip ( )
        self.name = self.name
        self.kit = self.kit
        self.namemap = { }
        self.kitmap = { }
        for i in range ( self.N ) :
            s = str ( self.name [ i ] )
            if s in self.namemap :
                self.namemap [ s ] = self.namemap [ s ] + 1
            else :
                self.namemap [ s ] = 1
        for i in range ( self.M ) :
            s = str ( self.kit [ i ] )
            if s in self.kitmap :
                self.kitmap [ s ] = self.kitmap [ s ] + 1
            else :
                self.kitmap [ s ] = 1
    ans = 0
    for s in self.namemap :
        num1 = self.namemap [ s ]
        num2 = 0
        if s in self.kitmap :
            num2 = self.kitmap [ s ]
        if num2 == 0 :
            ans = - 1
            break
        else :
            ans = max ( ans , ( num1 + num2 - 1 ) / num2 )
    print ( ans )
