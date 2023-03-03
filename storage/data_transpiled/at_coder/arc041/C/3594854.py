def _import ( ) :
    from io import StringIO
    from io import BytesIO
    from random import randint
    from random import randint
    from random import choice
    from random import random
    class Main ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.N , self.Z = self.N , self.Z
            self.X = [ ]
            self.D = [ ]
            for i in range ( self.N ) :
                self.X.append ( randint ( self.Z , self.Z ) )
            self.__next__ ( )
        def readline ( self ) :
            if self.stream is None or not self.stream :
                try :
                    return self.stream.readline ( )
                except EOFError :
                    raise
            return self.__next__ ( )
        def __next__ ( self ) :
            return randint ( self.Z , self.Z )
        def __next__ ( self ) :
            return randint ( self.Z , self.Z )
        def __next__ ( self ) :
            return randint ( self.Z , self.Z )
        def __next__ ( self ) :
            return randint ( self.Z , self.Z )
    def solve ( ) :
        L = [ ]
        R = [ ]
        for i in range ( self.N - 1 , - 1 , - 1 ) :
            if self.D [ i ] == 'L' :
                if i != self.N - 1 :
                    L.append ( L [ i + 1 ] + 1 )
                else :
                    L.append ( 1 )
            else :
                L.append ( 0 )
        for i in range ( self.N ) :
            if self.D [ i ] == 'R' :
                if i != 0 :
                    R [ i ] = R [ i - 1 ] + 1
                else :
                    R [ i ] = 1
            else :
                R [ i ] = 0
        ans = 0
        for i in range ( self.N - 2 , - 1 , - 1 ) :
            if self.L [ i ] == 0 :
                if self.L [ i + 1 ] >= R [ i ] :
                    dist = X [ i +