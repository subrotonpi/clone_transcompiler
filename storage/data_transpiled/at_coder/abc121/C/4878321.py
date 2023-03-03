def import _main
class Main ( object ) :
    class Store :
        def __init__ ( self , price , cans ) :
            self.price , self.cans = price , cans
        def __lt__ ( self , obj ) :
            if self.price > obj.price :
                return 1
            if self.price < obj.price :
                return - 1
            return 0
    def main ( self ) :
        with open ( "./manage.py/store/" , "r" ) as sc :
            N = sc.read ( )
            M = sc.read ( )
            stores = [ ( sc.read ( ) , sc.read ( ) ) for _ in range ( N ) ]
            stores.sort ( )
            sum = 0
            for si in stores :
                if si.cans < M :
                    sum += si.price * si.cans
                    M -= si.cans
                else :
                    sum += si.price * M
                    break
            print ( sum , end = ' ' )
