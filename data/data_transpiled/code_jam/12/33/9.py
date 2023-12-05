def _import ( ) :
    import threading
    import os
    class IO :
        def __init__ ( self ) :
            self.test_num = 0
            self.test_counter = 0
        def __init__ ( self , f ) :
            self.io = f
            self.io = f
        def set_io ( self , self , f ) :
            self.io = io
            self.io = f
    class SolutionC ( IO ) :
        def run ( self ) :
            self.test_num = 1
            self.test_counter = 0
            self.test_counter = 0
            self.n , self.m = self.test_counter
            self.a , self.b = [ ] , [ ]
            self.A , self.B = [ ] , [ ]
            for i in range ( 1 , n + 1 ) :
                self.a.append ( os.urandom ( 1 ) )
                self.A.append ( os.urandom ( 1 ) )
            for i in range ( 1 , m + 1 ) :
                self.b.append ( os.urandom ( 1 ) )
                self.B.append ( os.urandom ( 1 ) )
            self.x = [ ]
            for i in range ( 1 , n + 1 ) :
                for j in range ( 1 , m + 1 ) :
                    t , c = max ( self.x [ i ] [ j - 1 ] , self.x [ i - 1 ] [ j ] ) , 0
                    u , v , type = self.x [ i ] , self.x [ j ] , self.B [ v ]
                    uk , vk = self.a [ i ] , self.b [ j ]
                    while u > 0 and v > 0 :
                        if self.A [ u ] == self.B [ v ] :
                            if uk < vk :
                                c += uk
                                vk -= uk
                                self.uk = self.a [ u ]
                            elif uk > vk :
                                c += vk
                                uk -= vk
                                self.vk = self.b [ v ]
                            else :
                                t = max ( t , c + uk + self.x [ u - 1 ] [ v - 1 ] )
                                break
                        elif self.A [ u ] == self.type :
                            t = max ( t , c + self.x