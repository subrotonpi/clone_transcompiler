def import import sys , string , traceback ; traceback ; traceback ; print ( "" )
import sys , string , sys
def main ( ) :
    with open ( sys.argv [ 1 ] ) as f :
        H , W = struct.unpack ( '>H' , f.read ( 1 ) )
        a = [ ]
        for i in range ( H ) :
            a.append ( f.read ( 1 ) )
        for i in range ( H ) :
            for j in range ( W ) :
                if j != W - 1 and ( j == 0 or a [ i ] [ j ] == '#' or i % 2 == 0 ) :
                    print ( '#' , end = ' ' )
                else :
                    print ( '.' , end = ' ' )
            print ( )
        print ( )
        for i in range ( H ) :
            for j in range ( W ) :
                if j != 0 and ( j == W - 1 or a [ i ] [ j ] == '#' or i % 2 == 1 ) :
                    print ( '#' , end = ' ' )
                else :
                    print ( '.' , end = ' ' )
            print ( )
def tr ( * args ) :
    print ( "".join ( args ) )
