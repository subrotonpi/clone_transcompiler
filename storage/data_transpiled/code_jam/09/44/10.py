def _import ( ) : return sys.stdin.read ( )
import time
def sqr ( x ) : return x * x
def run ( ) :
    f = open ( 'input.txt' , 'w' )
    _ = f.readline ( )
    for __ in range ( _ ) :
        print ( 'Case #%d: ' % ( __ + 1 ) , end = ' ' )
        n = f.readline ( ).strip ( )
        x , y , r = [ _ for _ in range ( n ) ]
        if n == 1 :
            print ( r [ 0 ] )
        if n == 2 :
            print ( max ( r [ 0 ] , r [ 1 ] ) )
        if n == 3 :
            print ( min ( max ( r [ 0 ] , ( r [ 1 ] + r [ 2 ] + math.sqrt ( sqr ( x [ 1 ] - x [ 2 ] ) + sqr ( y [ 1 ] - y [ 2 ] ) ) ) / 2 ) , min ( max ( r [ 1 ] , ( r [ 0 ] + r [ 2 ] + math.sqrt ( sqr ( x [ 0 ] - x [ 2 ] ) + sqr ( y [ 0 ] - y [ 2 ] ) ) ) / 2 ) , max ( r [ 2 ] , ( r [ 0 ] + r [ 1 ] + math.sqrt ( sqr ( x [ 1 ] - x [ 0 ] ) + sqr ( y [ 1 ] - y [ 0 ] ) ) ) / 2 ) ) )
