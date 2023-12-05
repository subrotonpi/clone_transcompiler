def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.max_t = [ ]
        self.min_t = [ ]
    def main ( self ) :
        sc = _main ( )
        N = sc.count ( )
        ans = [ ]
        for max , min in _main ( ) :
            self.max_t.append ( max )
            self.min_t.append ( min )
        for max in self.max_t :
            if max >= 35 :
                ans.append ( max )
            elif max >= 30 :
                ans.append ( min )
            elif max >= 25 :
                ans.append ( max )
            elif max < 0 :
                ans.append ( min )
            min = self.min_t [ min ]
            if min >= 25 :
                ans.append ( min )
            elif min < 0 and max >= 0 :
                ans.append ( max )
        for i in range ( 5 ) :
            print ( i , end = ' ' )
        print ( ans [ 5 ] )
