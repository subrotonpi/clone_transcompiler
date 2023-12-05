def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.data = sys.stdin.read ( )
    def __str__ ( self ) :
        return self.data
    ABK = str.split ( )
    cont = 0
    for i in range ( min ( int ( ABK [ 0 ] ) , int ( ABK [ 1 ] ) ) , 0 , - 1 ) :
        if int ( ABK [ 0 ] ) % i == 0 and int ( ABK [ 1 ] ) % i == 0 :
            cont += 1
            if cont == int ( ABK [ 2 ] ) :
                print ( i )
                return
