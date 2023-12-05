def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.h = sys.maxint
        self.w = sys.maxint
    def __init__ ( self ) :
        sc = sys.stdin
        self.h = sc.h
        self.w = sc.w
        self.a = [ ]
        for i in range ( self.h ) :
            [ tmp ] = '.'
        for i in range ( 1 , self.h + 1 ) :
            tmp = sc.read ( )
            for j in range ( self.w ) :
                if tmp [ j ] == '#' :
                    self.a [ i ] [ j + 1 ] = '#'
    for i in range ( 1 , len ( self.a ) - 1 ) :
        for j in range ( 1 , len ( self.a [ i ] ) - 1 ) :
            if self.a [ i ] [ j ] == '#' :
                print ( '#' , end = ' ' )
            else :
                count = 0
                for k in range ( - 1 , 2 ) :
                    for l in range ( - 1 , 2 ) :
                        if k == 0 and l == 0 :
                            continue
                        if self.a [ i + k ] [ j + l ] == '#' :
                            count += 1
                print ( count , end = ' ' )
        print ( )
