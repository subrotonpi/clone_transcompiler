def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.max_t = [ ]
        self.min_t = [ ]
    def main ( self ) :
        sc = _main ( )
        N = sc.count ( )
        ans = [ ]
        for max , min in zip ( sc.values ( ) , sc.values ( ) ) :
            self.max_t.append ( max )
            self.min_t.append ( min )
        for max , min in zip ( self.max_t , sc.values ( ) ) :
            if max >= 35 :
                self.ans [ 0 ] += 1
            elif max >= 30 :
                self.ans [ 1 ] += 1
            elif max >= 25 :
                self.ans [ 2 ] += 1
            elif max < 0 :
                self.ans [ 5 ] += 1
            min = self.min_t [ min ]
            if min >= 25 :
                self.ans [ 3 ] += 1
            elif min < 0 and max >= 0 :
                self.ans [ 4 ] += 1
        print ( self.ans [ 0 ] , self.ans [ 1 ] , self.ans [ 2 ] , self.ans [ 3 ] , self.ans [ 4 ] , self.ans [ 5 ] )
