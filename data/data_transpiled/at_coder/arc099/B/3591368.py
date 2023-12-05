def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.k = int ( self.k )
    def go ( self ) :
        self.ll = [ ]
        self.dl = [ ]
        self.ll.append ( 1 )
        self.dl.append ( 1.0 )
        for i in range ( 2 , 1002 ) :
            s = ti = i
            for j in range ( 8 ) :
                div = int ( math.pow ( 10 , 7 - j ) )
                if ti >= div :
                    ts = ti / div
                    s += ts
                    ti -= ts * div
            f = float ( i ) / float ( s )
            while self.dl [ - 1 ] > f :
                self.ll.pop ( )
                self.dl.pop ( )
            self.ll.append ( long ( i ) )
            self.dl.append ( f )
        nine = 0
        count = 0
        nine = 0
        count = 0
        for i in range ( 15 ) :
            nine += int ( math.pow ( 10 , count ) ) * 9
            count += 1
            for j in range ( 100 , 999 ) :
                tl = nine + j * int ( math.pow ( 10 , count ) )
                stl = tl
                s = 0
                for m in range ( 17 ) :
                    div = int ( math.pow ( 10 , 16 - m ) )
                    if tl >= div :
                        ts = tl / div
                        s += ts
                        tl -= ts * div
                f = float ( stl ) / float ( s )
                while self.dl [ - 1 ] > f :
                    self.ll.pop ( )
                    self.dl.pop ( )
                self.ll.append ( stl )
                self.dl.append ( f )
        for i in range ( self.k ) :
            print ( self.ll [ i ] )
