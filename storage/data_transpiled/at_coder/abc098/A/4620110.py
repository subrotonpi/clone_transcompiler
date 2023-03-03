def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self._sc = sys._getframe ( 1 )
    def main ( self ) :
        z = [ ]
        A = self._sc.f_code
        B = self._sc.f_code
        z.append ( A + B )
        z.append ( A - B )
        z.append ( A * B )
        max = z [ 0 ]
        for i in range ( 1 , 3 ) :
            if max < z [ i ] :
                max = z [ i ]
        print ( max )
