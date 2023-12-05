def import import sys , StringIO , sys , subprocess , tokenize , args , ** kwargs ) :
    from os import path
    from os import environ
    from os import open
    from os import path
    from os import sep
    from os import chdir
    class B ( ) :
        def __init__ ( self , arg ) :
            self.r = args [ 0 ]
            self.c = args [ 1 ]
        def readline ( self ) :
            while not self.r or not self.c :
                try :
                    self.r , self.c = open ( self.r ).readline ( ).split ( )
                except :
                    pass
            return self.r
        def readline ( self ) :
            return int ( self.readline ( ) )
        def readline ( self ) :
            return long ( self.readline ( ) )
        def readline ( self ) :
            return float ( self.readline ( ) )
    def solve ( ) :
        testNo = args [ 0 ]
        for test in range ( 1 , testNo + 1 ) :
            n , v , x = args [ 1 ]
            s = [ S ( x , y ) for x , y in zip ( s , args [ 1 : ] ) ]
            sumrcp , sumrcn = 0 , 0
            sumrvp , sumrvn , sumrvz = 0 , 0 , 0
            for i in range ( n ) :
                if s [ i ].c > x :
                    sumrcp += s [ i ].r * ( s [ i ].c - x )
                    sumrvp += s [ i ].r
                elif s [ i ].c < x :
                    sumrcn += s [ i ].r * ( x - s [ i ].c )
                    sumrvn += s [ i ].r
                else :
                    sumrvz += s [ i ].r
            alphap = 1
            alphan = 1
            if sumrcp > sumrcn :
                if sumrcp :
                    alphap = sumrcn / sumrcp
            else :
                if sumrcn :
                    alphan = sumrcp / sumrcn
            vol = sumrvp * alphap + sumrvn * alphan + sumrvz
            if vol == 0 :
            INDENT