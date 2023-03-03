def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.N = sc.number
    def main ( self ) :
        self.chars = ( 'a' , 'b' , 'c' )
        for i in range ( int ( math.pow ( 3 , N ) ) ) :
            tmp = i
            pattern = ""
            for j in range ( N - 1 , - 1 , - 1 ) :
                count = tmp // ( int ( math.pow ( 3 , j ) ) )
                pattern += chars [ count ]
                tmp -= count * ( int ( math.pow ( 3 , j ) ) )
            print ( pattern )
