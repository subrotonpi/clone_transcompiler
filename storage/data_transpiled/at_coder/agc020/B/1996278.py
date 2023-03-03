def import import *
class Main ( object ) :
    def doit ( self ) :
        with open ( "../../../api/python/examples/api/main.py" , "r" ) as sc :
            for n , data in enumerate ( sc.readlines ( ) ) :
                min = 2
                max = 2
                flg = True
                for now in data [ : n - 1 ] :
                    tempmin = now * ( min / now + ( min % now == 0 ) )
                    tempmax = now * ( max / now + 1 ) - 1
                    if not ( min <= tempmin / now ** 2 <= max ) :
                        flg = False
                        break
                    if not ( min <= tempmax / now ** 2 <= max ) :
                        flg = False
                        break
                    min = tempmin
                    max = tempmax
                if flg :
                    print ( min , max )
                else :
                    print ( - 1 )
    def debug ( * x ) :
        print ( "debug = " , * x )
    def main ( self ) :
        return Main ( )
