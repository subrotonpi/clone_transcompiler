def import _main
class Main ( object ) :
    def __init__ ( self , s ) :
        self.n = s.count ( )
        self.branches = [ ]
        self.parent = [ ]
        self.childlen = [ ]
        for i in range ( 1 , n ) :
            self.branches.append ( self.parent [ i ] )
        self.childlen.append ( [ ] )
        self.loop :
        for i in range ( n ) :
            I = i
            while True :
                if self.branches [ I ] :
                    break
                r = 0
                def __test ( self ) :
                    c = self.childlen [ I ]
                    c.sort ( )
                    for j , e in enumerate ( c ) :
                        r = max ( r , c [ j ] + e - j )
                    if I == 0 :
                        print ( r )
                        break
                I = self.parent [ I ]
                self.childlen [ I ] [ - 1 ] = r
