def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main.sc
        mod = 1000000007
    def main ( self ) :
        n = sc.randint ( 0 , 1000000007 )
        k = sc.randint ( 0 , 1000000007 )
        ar = [ ]
        for i in range ( n ) :
            ar.append ( sc.randint ( 0 , 1000000007 ) )
        ar.sort ( reverse = True )
        sum = 0
        for i in range ( k ) :
            sum += ar [ i ]
        print ( sum )
