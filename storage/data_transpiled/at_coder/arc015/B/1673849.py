def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.ans = [ ]
        N = self.sc.count ( )
        for i in range ( N ) :
            high = self.sc.get ( i )
            low = self.sc.get ( i )
            if high >= 35 :
                self.ans [ 0 ] += 1
            elif high >= 30 and high < 35 :
                self.ans [ 1 ] += 1
            elif high >= 25 and high < 30 :
                self.ans [ 2 ] += 1
            if low >= 25 :
                self.ans [ 3 ] += 1
            if low < 0 and high >= 0 :
                self.ans [ 4 ] += 1
            if high < 0 :
                self.ans [ 5 ] += 1
        for i in range ( 6 ) :
            if i > 0 :
                print ( "" , end = "" )
            print ( self.ans [ i ] , end = "" )
        print ( )
