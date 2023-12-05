def import _main
class Main ( object ) :
    def __init__ ( self , x ) :
        self.temp = x
        if 9 < x :
            self.temp = 18 - x
        if x < 1 :
            self.temp = 2 - x
        return self.temp
    def get ( self , map , y , x ) :
        return map [ self.reverse ( y ) ] [ self.reverse ( x ) ]
    def main ( self ) :
        with open ( "input.txt" , "r" ) as sc :
            x = sc.read ( )
            y = sc.read ( )
            W = sc.read ( )
            map = [ ]
            for line in sc.readlines ( ) :
                for i in range ( 1 , 9 ) :
                    map.append ( [ line [ i - 1 ] ] )
            dy = 0
            dx = 0
            if "R" in W :
                dx = 1
            elif "L" in W :
                dx = - 1
            if "D" in W :
                dy = 1
            elif "U" in W :
                dy = - 1
            for i in range ( 4 ) :
                print ( self.get ( map , y + i * dy , x + i * dx ) , end = ' ' )
            print ( )
